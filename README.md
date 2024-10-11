# Javalin Blog App

## Overview

This is a simple blog application built using Java 21, Javalin 6, SQLite, and Thymeleaf. The project follows the MVC (Model-View-Controller) architecture and includes basic functionality for creating and rendering blog posts.

## Technologies Used

- **Java 21**: The programming language used for backend development.
- **Javalin 6**: A lightweight web framework for creating RESTful APIs and web applications in Java.
- **SQLite**: A lightweight, serverless SQL database for storing blog posts.
- **Thymeleaf**: A Java-based templating engine for rendering HTML views.
- **Maven**: Dependency management and project building.
- **SLF4J**: Simple logging library.

## Project Structure


### Key Files

- **`App.java`**: Contains the Javalin setup and the main application logic.
- **`Database.java`**: Handles the SQLite database connection and table creation.
- **`home.html`**: Thymeleaf template that renders the homepage.
- **`blog.db`**: SQLite database file storing the blog data.

## Setup and Installation

### Prerequisites

Before you start, ensure you have the following installed:

- Java 21
- Maven
- Git
- SQLite3 (optional, for managing the SQLite database)

### Installation Steps

1. **Clone the repository**:

   ```bash
   git clone https://github.com/ssalidm/blog-app.git
   cd blog-app
   ```

2. **Install Maven dependencies**:
    
    Run the following command to download and install all required dependencies:

   ```bash
   mvn clean install
   ```

3. **Create the SQLite database**:

    Create a `db/` directory in the root of your project and create an empty `blog.db` file. The database table will be automatically created when the application runs.
    
    ```bash
    mkdir db
    touch db/blog.db
    ```

4. **Run the application**:    
    
    Use the Maven command to start the application:
    ```bash
    mvn exec:java -Dexec.mainClass="co.za.pixelly.blog.App"
    ```

5. **Access the application:**

    Once the app is running, you can access it by navigating to:
    ```bash
    http://localhost:7000
    ```

## Features

- Basic routing with Javalin.
- Thymeleaf templating for rendering dynamic HTML content.
- SQLite integration for data persistence.
- MVC (Model-View-Controller) architecture.
- Logging with SLF4J.

## Future Enhancements

The following features will be added in future versions:

- User authentication (login, logout, signup).
- CRUD functionality for blog posts.
- Detailed views for each blog post.
- Database migration management.
- Improved error handling and validation.

## Contributing

Contributions are welcome! To contribute:

1. Fork the repository.
2. Create a new feature branch (`git checkout -b feature-branch-name`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature-branch-name`).
5. Open a pull request.