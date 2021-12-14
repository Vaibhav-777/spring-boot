# CRUD Operations using Spring Boot

**Description:**

It a is simple example of the Spring boot project. The CRUD operations are implemented using REST API and MySQL database.

**Prerequisites:**

1. MySQL Database
2. Postman

**Steps to run the project**

1. Clone the repository

2. Open terminal in project folder

3. Run mvn clean install 

4. After following step no 3 target folder will be created. Go into that folder you will find {your-app-name}.jar file

5. Open the terminal and type following command

6. java -jar {app-name}.jar 

7. After follwing all these steps application will be running on http://localhost:8080/

8. Use the below API's to perform CRUD operations

   To list all the records
   GET API: http://localhost:8080/students/

   To save the specific record in database
   POST API: http://localhost:8080/students/
   
   To update the specific record in database
   POST API: http://localhost:8080/students/{student_id}

   To remove the specific record from the database
   DELETE API: http://localhost:8080/students/{student_id}
