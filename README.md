# Car Management System 🚗

This project is a **Spring Boot-based REST API** application that provides a system to manage car details, including operations to create, read, update, delete, and search car records.

## Features ✨
- **CRUD Operations**:
  - Add new cars.
  - View all cars.
  - Update car details.
  - Delete car entries.
 
- **Global Search**:
  - Search cars by name, model, year, color, or fuel type 
    
- **Validation**:
  - Validate input data for all endpoints to ensure proper data is submitted.

- **API Documentation**:
  - Swagger/OpenAPI documentation for all endpoints.
 
## Project Structure 🗂️
The project follows the standard **Spring Boot MVC structure**:
  ```
  com.carstop.car_manager
    ├── controller
    │   └── CarController.java               # Handles API requests 
    ├── entity
    │   └── Car.java                         # model
    │   └── CarEntity.java                   # Entity class for Car
    ├── service
    │   ├── CarService.java                  # Service interface
    │   └── CarServiceImp.java               # Service implementation
    ├── repository
    │   └── CarRepository.java               # JPA Repository
    └── CarManagerApplication.java           # Main application entry point
```
 
## Technologies Used 🛠️
- **Backend Framework**: Spring Boot (v3.4.1)
- **Database**: MySQL
- **ORM**: Hibernate (JPA)
- **Dependency Management**: Maven
- **API Documentation**: Swagger (SpringDoc OpenAPI)

## Prerequisites ⚙️
1. **Java**: JDK 17 or later.
2. **Maven**: Ensure Maven is installed and configured.
3. **MySQL**: Database setup with credentials.
4. **Postman**: For API testing.

## Setup Instructions 🛠️
1. Clone the Repository.
3. Edit the application.properties file in resources folder with your database details
4. Build and Run the application.

The application will start on:
```http://localhost:9090```

## API Endpoints 📖
Car Management

- **GET**: Retrieve all cars.
```http://localhost:9090/api/cars/cars```

- **POST**: Add a new car.
```http://localhost:9090/api/cars/cars```
- **PUT**: Update a car by ID.
```http://localhost:9090/api/cars/cars/{id}```
- **DELETE**: Delete a car by ID.
```http://localhost:9090/api/cars/cars/{id}```

Global Search
- **GET**: Search cars by name, model, year, color, or fuel type.
```http://localhost:9090/api/cars/search?keyword?KEYWORD```

## API Documentation 📄
Access Swagger UI for interactive API documentation:
```http://localhost:9090/swagger-ui/index.html```

## Contact 📬
Name: Dimple Tolani || 
Email: dimpletolani1602@gmail.com || 
GitHub: Dimple-Tolani


