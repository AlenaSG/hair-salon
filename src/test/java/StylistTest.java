import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;
import java.util.Arrays;

public class StylistTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void stylist_instantiatesCorrectly_true() {
    Stylist newStylist = new Stylist("Jane Doe", "");
    assertEquals(true, newStylist instanceof Stylist);
  }

  @Test
  public void getName_stylistInstantiatesWithName_JaneDoe() {
    Stylist newStylist = new Stylist("Jane Doe", "");
    assertEquals("Jane Doe", newStylist.getName());
  }

 @Test
 public void all_returnsAllInstancesOfStylist_true() {
   Stylist firstStylist = new Stylist("Jane Doe", "");
   firstStylist.save();
   Stylist secondStylist = new Stylist("Jill Roe", "");
   secondStylist.save();
   assertEquals(true, Stylist.all().get(0).equals(firstStylist));
   assertEquals(true, Stylist.all().get(1).equals(secondStylist));
 }

 @Test
 public void getId_stylistsInstantiateWithAnId_1() {
   Stylist newStylist = new Stylist("Jane Doe", "");
   newStylist.save();
   assertTrue(newStylist.getId() > 0);
 }

 @Test
 public void find_returnsStylistWithSameId_secondStylist() {
   Stylist firstStylist = new Stylist("Jane Doe", "");
   firstStylist.save();
   Stylist secondStylist = new Stylist("Jill Roe", "");
   secondStylist.save();
   assertEquals(Stylist.find(secondStylist.getId()), secondStylist);
 }

  @Test
  public void equals_returnsTrueIfNamesAretheSame() {
    Stylist firstStylist = new Stylist("Jane Doe", "");
    Stylist secondStylist = new Stylist("Jane Doe", "");
    assertTrue(firstStylist.equals(secondStylist));
  }

  @Test
  public void save_savesStylistsIntoDatabase_true() {
    Stylist newStylist = new Stylist("Jane Doe", "");
    newStylist.save();
    assertTrue(Stylist.all().get(0).equals(newStylist));
  }

  @Test
  public void save_assignsIdToObject() {
    Stylist newStylist = new Stylist("Jane Doe", "");
    newStylist.save();
    Stylist savedStylist = Stylist.all().get(0);
    assertEquals(newStylist.getId(), savedStylist.getId());
  }

  @Test
  public void getClients_retrievesAllClientsFromDatabase_clientsList() {
    Stylist newStylist = new Stylist("Jane Doe", "");
    newStylist.save();
    Client firstClient = new Client("John Doe", newStylist.getId());
    firstClient.save();
    Client secondClient = new Client("Joe Roe", newStylist.getId());
    secondClient.save();
    Client[] clients = new Client[] { firstClient, secondClient };
    assertTrue(newStylist.getClients().containsAll(Arrays.asList(clients)));
  }

  @Test
  public void update_updatesStylistName_true() {
    Stylist newStylist = new Stylist("Jane Doe", "");
    newStylist.save();
    newStylist.update("Jill Roe");
    assertEquals("Jill Roe", Stylist.find(newStylist.getId()).getName());
  }

  @Test
  public void delete_deletesStylist_true() {
    Stylist newStylist = new Stylist("Jane Doe", "");
    newStylist.save();
    int newStylistId = newStylist.getId();
    newStylist.delete();
    assertEquals(null, Stylist.find(newStylistId));
  }
}
