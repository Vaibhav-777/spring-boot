# CRUD Operations using Spring Boot

**Description:**

It a is simple example of the Spring boot project. The CRUD operations are implemented using RESTful web service and MySQL database.

**Application type:** Spring boot application

**Platform used:** Ubuntu 16.04.6 LTS

**IDE used:** Spring Tool Suite 4 Version: 4.4.0.RELEASE

**Tools & Framework used:** Java spring boot framework, JDK 1.8

**Spring Dependencies used:**

1.Spring web

2.MySql driver

3.Spring data JPA

**Prerequisites:**

1. MySQL Database
2. Maven 

**Steps to run the project**

1. Create database or use existing one

2. Create properties file with .properties file extension and add following lines in it

      `spring.datasource.url=jdbc:mysql://localhost:3306/{database_name}?createDatabaseIfNotExist=true&&useUnicode=true&characterEncoding=utf8`

      `spring.datasource.username={username}`

      `spring.datasource.password={password}`

3. Clone the repository

2. Open terminal in project folder

3. Run mvn clean install 

4. After following step no #3 target folder will be created. Go into that folder you will find {your-app-name}.jar file

5. Open the terminal and type following command

6. java -jar {app-name}.jar --spring.config.location=/{created_properties_file_path}/{file_name}

7. After follwing all these steps application will be running on this host endpoint http://localhost:8080/

8. Use the below API's to perform CRUD operations. We can test all these API's using postman

   1. To list all the records
      GET API: http://localhost:8080/students/

   2. To save the specific record in database
      POST API: http://localhost:8080/students/
   
      `Sample Request Body: { "name": "ABC", "location": "MUMBAI" }`
   
   3. To update the specific record in database
      PUT API: http://localhost:8080/students/{student_id}
      
      `Sample Request Body: { "location": "MUMBAI" }`

   4. To remove the specific record from the database
      DELETE API: http://localhost:8080/students/{student_id}
