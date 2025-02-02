JDBC Project with PostgreSQL
This project illustrates the use of JDBC (Java Database Connectivity) to connect to a PostgreSQL database and manipulate data through a standalone Java application. The goal is to create a database, a table, and perform basic operations (inserting and reading data) using JDBC.

Technologies and Versions Used:

Java: Version 17 (or any compatible version)
PostgreSQL: Version 16.6
JDBC Driver: Version 42.7.5
IDE: VSCode (Visual Studio Code)
Operating System: Windows 11
Prerequisites
Before starting, make sure the following software is installed on your machine:

PostgreSQL (version 16.6)

Download and install PostgreSQL from the official website: [PostgreSQL Downloads](https://www.postgresql.org/download/)
Ensure that the PostgreSQL server is running and that you can access it via psql.
Java JDK (version 17 or above)

Download and install the Java JDK from Oracle JDK or use OpenJDK.
JDBC Driver for PostgreSQL

Download the JDBC driver for PostgreSQL from the Maven Repository or add it to your project via Maven or Gradle.
Database Configuration

Installing PostgreSQL
Follow the installation steps for PostgreSQL on Windows, including setting a password for the postgres user.

Creating the Database and Table
Once PostgreSQL is installed and running, open the psql terminal and execute the following commands to create a database and a table:

sql
Copy
Edit
CREATE DATABASE db1;

CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    Phone_number CHAR(8) UNIQUE
);
This is a basic JDBC project setup, showing how to interact with a PostgreSQL database using Java. 
