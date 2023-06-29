# MongoDB-Springboot-Application

A demonstration project showcasing the integration of MongoDB with Spring Boot 3.

## Prerequisites

Before running the application, ensure you have the following installed:

- Java Development Kit (JDK) 11 or higher
- Maven
- MongoDB

## Getting Started

To get started with the project, follow these steps:

1. Clone the repository to your local machine:

   ```
   git clone https://github.com/AnkitG7/MongoDB-Springboot-Application.git
   ```

2. Navigate to the project directory:

   ```
   cd MongoDB-Springboot-Application/
   ```

3. Build the project using Maven:

   ```
   mvn clean install
   ```

4. Start MongoDB on your local machine or update the MongoDB connection details in the `application.properties` file.

5. Run the application:

   ```
   mvn spring-boot:run
   ```

6. Open your web browser and access the application at [http://localhost:8080](http://localhost:8080).

## Project Structure

The project follows a standard Maven structure and includes the following main directories:

- `src/main/java`: Contains the Java source code for the application.
- `src/main/resources`: Contains configuration files, including the `application.properties` file for defining MongoDB connection details.
- `src/test`: Contains the test cases for the application.

## Contributing

Contributions to this project are welcome! If you find any issues or have suggestions for improvement, please open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
