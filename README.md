Employee Data Entry App
This is a Java application that allows you to manage employee data using a graphical user interface (GUI). It provides basic CRUD (Create, Read, Update, Delete) functionality for managing employee records.

Technologies Used
Java
MySQL
Features
Insert Employee Data
In the "Insert" tab of the application, you can enter details of a new employee such as last name, first name, address, city, state, date of birth, and salary. Clicking the "Save Employee" button will save the entered data into the MySQL database.

Update Employee Data
In the "Update Employee" tab, you can search for an employee by their ID and retrieve their existing data from the database. The retrieved data will be displayed in the corresponding fields. You can then modify any field and click the "Update Employee" button to save the changes back to the database.

Delete Employee Data
In the "Update Employee" tab, you can also delete an employee from the database by entering their ID and clicking the "Delete Employee" button. A confirmation dialog will be displayed before deleting the employee.

Clear Employee Data
Both in the "Insert" and "Update Employee" tabs, you can clear all the input fields by clicking the "Clear Employee" or "Clear" button, respectively.

Usage
Make sure you have Java and MySQL installed on your system.
Set up a MySQL database with the necessary tables for employee data storage.
Configure the database connection settings in the application.
Compile and run the EmployeeGUI.java file.
Dependencies
This application uses the following dependencies:

Java Swing
MySQL Connector/J
Make sure to include the required JAR files in the classpath when compiling and running the application.


Note
This application is a simple implementation and does not include advanced error handling or security features. Use it for educational or prototyping purposes and enhance it as needed for production use.




