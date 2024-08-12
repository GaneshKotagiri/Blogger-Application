# Blogger-Application

## Overview
This project is a **Blogger Application** developed using Spring Boot and Groovy. It allows users to create, edit, delete, and view blog posts. The application also supports user authentication, comments, and categorization of posts. The project emphasizes comprehensive testing to ensure reliability and performance.

## Features
- **Blog Management**
  - Create, update, delete, and retrieve blog posts.
  - Categorize blog posts by tags and categories.
  - Support for rich text content in posts.

- **User Management**
  - User registration, login, and authentication.
  - Role-based access control for authors and administrators.
  - Profile management for users.

- **Commenting System**
  - Users can comment on posts.
  - Moderation tools for managing comments (e.g., delete, approve).

- **Search and Filtering**
  - Search posts by title, content, tags, or categories.
  - Filter posts by author or publication date.

- **Groovy Integration**
  - Developed Groovy scripts for dynamic content rendering and utilities.
  - Leveraged Groovy’s scripting capabilities within the Spring Boot application.

- **Testing**
  - **Unit Testing:** Extensive unit tests using JUnit and Groovy’s Spock framework.
  - **Integration Testing:** Testing the interaction between components using Spring Boot Test.
  - **Mocking and Stubbing:** Employed Mockito and Spock for mocking dependencies.
  - **Performance Testing:** Assessed application performance under load conditions.

- **Security**
  - Integrated Spring Security for user authentication and authorization.
  - Implemented JWT for secure API access.
  - Password encryption and secure session management.

- **Deployment**
  - Configured for easy deployment on cloud platforms or on-premise servers.
  - Docker support for containerized deployment.

## Project Structure
```bash
src
├── main
│   ├── groovy
│   │   └── com.example.blogger
│   │       ├── scripts
│   │       │   └── DynamicRenderer.groovy
│   ├── java
│   │   └── com.example.blogger
│   │       ├── controller
│   │       │   └── PostController.java
│   │       ├── service
│   │       │   └── PostService.java
│   │       ├── repository
│   │       │   └── PostRepository.java
│   │       └── model
│   │           └── Post.java
│   └── resources
│       ├── application.properties
│       └── templates
│           └── index.html
