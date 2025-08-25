# 🏥 CareHub – Patient Management System

![Java](https://img.shields.io/badge/Java-17-blue?logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0-brightgreen?logo=springboot)
![Docker](https://img.shields.io/badge/Docker-Containerization-blue?logo=docker)
![RabbitMQ](https://img.shields.io/badge/RabbitMQ-Messaging-orange?logo=rabbitmq)
![Keycloak](https://img.shields.io/badge/Keycloak-Security-important?logo=keycloak)
![AWS](https://img.shields.io/badge/AWS-Cloud-yellow?logo=amazonaws)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-blue?logo=postgresql)
![MongoDB](https://img.shields.io/badge/MongoDB-NoSQL-green?logo=mongodb)

---

## 📌 Overview
**CareHub** is a **microservice-based healthcare management system** that manages **patients, appointments, and medical records**.  
It follows a **distributed architecture** built with **Spring Boot**, leverages **RabbitMQ** for messaging, and uses **Keycloak** for centralized authentication and authorization.  
The system is fully containerized with **Docker** and designed for **cloud-ready deployments** on **AWS**.

---

## 🚀 Tech Stack
- **Backend Framework**: Spring Boot (Java 17)  
- **Architecture**: Microservices with API Gateway + Service Registry  
- **Security**: Keycloak, JWT, OAuth2  
- **Messaging Queue**: RabbitMQ  
- **Databases**: PostgreSQL (relational), MongoDB (NoSQL)  
- **Containerization**: Docker  
- **Cloud Deployment**: AWS (EC2, RDS, S3, ECS/EKS)  
- **Dev Tools**: Git, Postman, Maven  

---

## 🏗️ System Architecture

*(Add your diagram under `/assets/carehub-architecture.png`)*

![CareHub Architecture](./assets/carehub-architecture.png)

### 🔹 Microservices
- **Patient Service** → Manage patient profiles and medical history  
- **Appointment Service** → Schedule and manage appointments  
- **Medical Records Service** → Store and retrieve medical records securely  
- **Auth Service (Keycloak)** → Centralized role-based access control  
- **API Gateway** → Routes requests to microservices  
- **RabbitMQ** → Event-driven communication between services  

---

## ✨ Features
- ✅ Patient registration & profile management  
- ✅ Secure authentication & role-based access with Keycloak  
- ✅ Appointment scheduling & management  
- ✅ Medical records storage and retrieval  
- ✅ Event-driven communication via RabbitMQ  
- ✅ API Gateway for unified service access  
- ✅ Dockerized microservices for portability  
- ✅ Cloud-ready with AWS deployment  

---

## 🛠️ Setup Instructions

### 🔧 Prerequisites
- [Java 17+](https://adoptopenjdk.net/)  
- [Maven](https://maven.apache.org/)  
- [Docker](https://www.docker.com/)  
- [RabbitMQ](https://www.rabbitmq.com/)  
- [PostgreSQL](https://www.postgresql.org/)  
- [MongoDB](https://www.mongodb.com/)  

---

### ⚡ Steps

#### 1. Clone the repository
```bash
git clone https://github.com/your-username/carehub.git
cd carehub
