# _MAgic Hair Salon_

#### _This application helps track stylists and clients, 07.14.2017_

#### By _**Alena Golovina**_

## Description

_This is a new management software with a dashboard for an up-and-coming hair salon. The owners want the managers to execute various tasks relating tracking stylists and clients to make their day to day life easier. The user stories below define the content they are expecting to see for their MVP._
_As a salon employee, I need to be able to see a list of all our stylists._
_As an employee, I need to be able to select a stylist, see their details, and see a list of all clients that belong to that stylist._
_As an employee, I need to add new stylists to our system when they are hired._
_As an employee, I need to be able to add new clients to a specific stylist._
_As an employee, I need to be able to update a stylist's details._
_As an employee, I need to be able to update a client's details._
_As an employee, I need to be able to delete a stylist if they're no longer employed here. (What happens to the clients?)_
_As an employee, I need to be able to delete a client if they no longer visit our salon._

## Code Specs

|Behavior - Plain English|Input|Output|
|---|---|---|
|The user enters localhost: 4567 in their web-browser and see the index page for the app with info about the hairstylists and clients|localhost:4567|the app webpage with links to create and view stylists and clients|
|The user is able to see a list of all stylists|click "All stylist"|Go to another page with a list of stylists|
|The user is able to see a list of all clients for a certain stylist and his/her details|click "Name of the Stylist"|Go to another page with a list of all clients for this stylist and his/her details|
|The user is able to add a stylist to the system|click "Add a stylist", then fill out text input fields with name and image url, press "Add this Stylist!" button|see a success page with links to see lists|
|The user is able to update the stylist's name|enter a new name on the stylist's page, click "update stylist" button|see the name change on top of the page|
|The user is able to delete a stylist's profile|on the individual stylist page  click "delete stylist" button|return to the index page with the list of remaining stylists|
|The user is able to add a client to the stylist|click "Add a client", then fill out text input field with a name, press "Add this client!" button|see a success page with links to see lists|
|The user is able to update the client's name|enter a new name on the client's page, click "update client" button|see the name change on top of the page|
|The user is able to delete a client's profile|on the individual client's page  click "delete client" button|return to the stylist's page with the list of remaining clients|


## Setup/Installation Requirements

* _At terminal, enter postgres_
* _In a different terminal window, enter psql_
* _You can restore the databases or create them and their tables as follows. In psql, enter:_
* _CREATE DATABASE hair_salon;_
* _\c hair_salon;_
* _CREATE TABLE clients (id serial PRIMARY KEY, name varchar, stylistId int);_
* _CREATE TABLE stylists (id serial PRIMARY KEY, name varchar, image varchar);_
* _CREATE DATABASE hair_salon_test WITH TEMPLATE hair_salon;_
* _To run the program, go into the project folder on the terminal and enter gradle run_
* _In the browser, enter localhost:4567_

## To Restore Databases:
* _Clone the repository from Github_
* _Connect to psql and run: CREATE DATABASE hair_salon;_
* _Run the following command in the terminal (not psql): psql hair_salon < media.sql_
* _To confirm success and connect to the database switch to psql and run:  \c hair_salon_
* _To see the tables run: \dt_

## To Backup Databases:
* _(Optional)Clear the tables:  from psql, enter:_
* _DELETE FROM clients;_
* _DELETE FROM stylists;_
* _DROP DATABASE hair_salon_test;_
* _In your "normal" terminal window, not psql, enter: pg_dump hair_salon > media.sql_
* _Add changes via git add . and commit your changes to Git_
* _Upload the project to Github._

## Known Bugs

_No known bugs!_

## Support and contact details

_Please contact me if you have any questions or suggestions._

## Technologies Used

* _Java_
* _Postgres and psql_
* _Velocity_
* _Spark_
* _HTML_
* _CSS and Bootstrap_
* _Gradle_
* _jUnit_

### License

_This software is licensed under MIT license._

Copyright (c) 2017 **_Alena Golovina_**
