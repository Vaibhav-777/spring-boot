# CRUD Operations using Spring Boot

**Description:**

It is a dockerize spring boot application. The CRUD operations are implemented using RESTful web service and MySQL database.

**Application type:** Spring boot application

**Platform used:** Windows 10

**IDE used:** Spring Tool Suite 4 Version: 4.4.0.RELEASE

**Tools & Framework used:** Java spring boot framework, JDK 1.8, Docker

**Spring Dependencies used:**

1.Spring web

2.MySql driver

3.Spring data JPA

**Prerequisites to run the application:**

1. Docker

**Steps to run the project**

1. Clone the repository

2. Open terminal in project folder

3. Run docker-compose up

4. The application will be running on this host end-point http://localhost:6868/

8. Use the below API's to perform CRUD operations. We can test all these API's using postman

   1. To list all the records
      
      `GET API: http://localhost:8080/students/`
      

   2. To save the specific record in database
      
      `POST API: http://localhost:8080/students/`
      `Sample Request Body: { "name": "ABC", "location": "MUMBAI" }`
   
   3. To update the specific record in database

      `PUT API: http://localhost:8080/students/{student_id}`
      `Sample Request Body: { "location": "MUMBAI" }`

   4. To remove the specific record from the database

      `DELETE API: http://localhost:8080/students/{student_id}`
