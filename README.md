-----

## 🏥 CareHub – Patient Management System

-----

## 📌 Overview

**CareHub** is a sophisticated **microservice-based healthcare management system** designed to efficiently manage **patients, appointments, and medical records**. It's built on a **distributed architecture** using **Spring Boot**, with a focus on **event-driven communication** via **RabbitMQ**. **Keycloak** is integrated for robust, centralized authentication and authorization, ensuring secure access. The entire system is **containerized with Docker**, making it highly portable and easily deployable in **cloud environments like AWS**.

-----

## 🚀 Tech Stack

  - **Backend Framework**: Spring Boot (Java 17)
  - **Architecture**: Microservices with API Gateway and Service Registry for robust communication and routing.
  - **Security**: **Keycloak**, **JSON Web Tokens (JWT)**, and **OAuth2** provide a comprehensive security layer for authentication and authorization.
  - **Messaging Queue**: **RabbitMQ** facilitates asynchronous, event-driven communication between services, ensuring loose coupling and scalability.
  - **Databases**:
      - **PostgreSQL** (Relational): Used for structured data like patient profiles and appointments.
      - **MongoDB** (NoSQL): Ideal for flexible data models, such as unstructured medical records and documents.
  - **Containerization**: **Docker** is used to package each microservice, guaranteeing consistent environments from development to production.
  - **Cloud Deployment**: Designed for seamless deployment on **AWS**, leveraging services like **EC2**, **RDS**, **S3**, and container orchestration with **ECS/EKS**.
  - **Dev Tools**: **Git** for version control, **Postman** for API testing, and **Maven** for build automation.

-----

## 🏗️ System Architecture

### 🔹 Microservices Explained

The CareHub system is composed of several independent microservices, each with a specific responsibility:

  - **Patient Service** 🧑‍⚕️: Manages all patient-related information, including profiles, demographic data, and medical history.
  - **Appointment Service** 📅: Handles the scheduling, management, and tracking of patient appointments with healthcare providers.
  - **Medical Records Service** 📝: Securely stores and retrieves sensitive medical records, test results, and other health documents.
  - **Auth Service (Keycloak)** 🔐: Provides centralized **role-based access control**, user authentication, and single sign-on (SSO) for all services.
  - **API Gateway** 🚪: Acts as a single entry point for all client requests, routing them to the appropriate microservice and providing a unified API.
  - **RabbitMQ** 🐇: Serves as a message broker for **event-driven communication** between the services. This allows services to communicate asynchronously, reducing dependencies and improving system resilience.
  - **Databases** 💾:
      - **PostgreSQL**: Used by the Patient and Appointment services for their structured data needs.
      - **MongoDB**: Utilized by the Medical Records service for its flexibility in handling various medical document formats.

-----

## ✨ Features

  - ✅ **Patient Profile Management**: Create, update, and retrieve patient profiles and medical history.
  - ✅ **Secure Authentication & Authorization**: Leverages **Keycloak** for robust security, including **role-based access control** to ensure only authorized users can access specific resources.
  - ✅ **Appointment Scheduling**: Allows for easy scheduling, rescheduling, and cancellation of appointments.
  - ✅ **Medical Records Storage**: Provides a secure and scalable solution for storing and retrieving sensitive medical data.
  - ✅ **Event-driven Communication**: The use of **RabbitMQ** ensures services are loosely coupled, enabling a resilient and scalable architecture.
  - ✅ **Unified Service Access**: The **API Gateway** simplifies client-side development by providing a single endpoint for all services.
  - ✅ **Dockerized Microservices**: Each service is containerized, ensuring consistency and easy deployment across different environments.
  - ✅ **Cloud-Ready**: The architecture is optimized for cloud deployment, allowing for easy scaling and high availability on **AWS**.

-----

## 🛠️ Setup Instructions

### 🔧 Prerequisites

To set up and run the CareHub system, you need the following:

  - [Java 17+](https://adoptopenjdk.net/)
  - [Maven](https://maven.apache.org/)
  - [Docker](https://www.docker.com/)
  - [RabbitMQ](https://www.rabbitmq.com/)
  - [PostgreSQL](https://www.postgresql.org/)
  - [MongoDB](https://www.mongodb.com/)

-----

### ⚡ Steps

#### 1\. Clone the repository

```bash
git clone https://github.com/your-username/carehub.git
cd carehub
```

#### 2\. Configure Environment Variables

Create a `.env` file in the root directory and add the following variables:

```
# Keycloak
KEYCLOAK_SERVER_URL=http://localhost:8080
KEYCLOAK_REALM=carehub

# RabbitMQ
RABBITMQ_HOST=localhost
RABBITMQ_PORT=5672
RABBITMQ_USERNAME=guest
RABBITMQ_PASSWORD=guest

# PostgreSQL
POSTGRES_HOST=localhost
POSTGRES_PORT=5432
POSTGRES_DB=patient_db
POSTGRES_USER=patient_user
POSTGRES_PASSWORD=patient_password

# MongoDB
MONGO_HOST=localhost
MONGO_PORT=27017
MONGO_DB=medical_records_db
```

#### 3\. Run with Docker Compose

Use Docker Compose to start all the services and databases with a single command.

```bash
docker-compose up --build
```

This command will:

  - Build the Docker images for each microservice.
  - Start containers for each service, along with PostgreSQL, MongoDB, RabbitMQ, and Keycloak.
  - Link all containers on a shared network.

#### 4\. Access the System

  - **API Gateway**: Access the main API at `http://localhost:8080/api`.
  - **Keycloak Admin Console**: `http://localhost:8080`. Log in with default credentials `admin/admin` to configure users and roles.
  - **RabbitMQ Admin UI**: `http://localhost:15672`. Use `guest/guest` for access.

-----

## 🤝 Contributing

Contributions are welcome\! If you have suggestions for new features, bug fixes, or improvements, please open an issue or submit a pull request.

1.  Fork the repository.
2.  Create your feature branch (`git checkout -b feature/AmazingFeature`).
3.  Commit your changes (`git commit -m 'Add some AmazingFeature'`).
4.  Push to the branch (`git push origin feature/AmazingFeature`).
5.  Open a Pull Request.

-----

## 📄 License

Distributed under the MIT License. See `LICENSE` for more information.

-----

