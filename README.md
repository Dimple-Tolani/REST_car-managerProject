# Car Management System 🚗

This project is a **Spring Boot-based REST API** application that provides a system to manage car details, including operations to create, read, update, delete, and search car records.

## Features ✨
- **CRUD Operations**:
  - Add new cars.
  - View all cars.
  - Update car details.
  - Delete car entries.
    
- **Validation**:
  - Validate input data for all endpoints to ensure proper data is submitted.

- **API Documentation**:
  - Swagger/OpenAPI documentation for all endpoints.
 
## Technologies Used 🛠️
- **Backend Framework**: Spring Boot (v3.4.1)
- **Database**: MySQL
- **ORM**: Hibernate (JPA)
- **Dependency Management**: Maven
- **API Documentation**: Swagger (SpringDoc OpenAPI)
- **Postman**: For API testing.

## Setup Instructions 🛠️

1. Clone the Repositor
2. Edit the application.properties file with your database details
3. Build and Run the application.

## API Endpoints 📖

**GET**:     	http://localhost:9090/api/cars/cars	Retrieve all cars.
**POST**:     http://localhost:9090/api/cars/cars	Add a new car.
**PUT**:  	  http://localhost:9090/api/cars/cars/{id}	Update a car by ID.
**DELETE**: 	http://localhost:9090/api/cars/cars/{id}	Delete a car by ID.

## API Documentation 📄
Access Swagger UI for interactive API documentation:
http://localhost:9090/swagger-ui/index.html

