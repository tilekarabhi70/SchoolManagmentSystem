
# 🎓 School Management System

A **Spring Boot REST API** project to manage student records. This simple yet effective backend system supports basic CRUD operations, perfect for learning and prototyping educational systems.

---

## 🧠 Overview

This application allows users to:

- ✅ Add a new student
- 🔍 View student by ID
- 📋 View all students
- ✏️ Update student details
- ❌ Delete a student

Built using **Spring Boot** and **Spring Data JPA**, it connects to a relational database and exposes RESTful endpoints for client interactions.

---

## 📐 Architecture Diagram

```plaintext
         +----------------------------+
         |    StudentController       |
         |    (REST API Layer)        |
         +-------------+--------------+
                       |
                       ▼
         +----------------------------+
         |     StudentServiceImpl     |
         |  (Service Layer - Logic)   |
         +-------------+--------------+
                       |
                       ▼
         +----------------------------+
         |     StudentRepository      |
         |  (JPA Repository Layer)    |
         +-------------+--------------+
                       |
                       ▼
         +----------------------------+
         |        Student Entity      |
         | (Mapped to DB Table)       |
         +----------------------------+
```

---

## 📦 Student Object Structure

```json
{
  "name": "John Doe",
  "email": "john.doe@example.com",
  "phoneNumber": "1234567890"
}
```

---

## 🌐 REST API Endpoints

Base URL: `/api/student`

| Method | Endpoint               | Description              |
|--------|------------------------|--------------------------|
| POST   | `/`                    | Add a new student        |
| GET    | `/{id}`                | Get student by ID        |
| GET    | `/`                    | Get all students         |
| PUT    | `/{id}/update`         | Update student by ID     |
| DELETE | `/delete/{id}`         | Delete student by ID     |

---

## ⚙️ Technologies Used

- ☕ Java 17+
- 🚀 Spring Boot
- 📦 Spring Data JPA (Hibernate)
- 💾 H2 / MySQL Database (configurable)
- 📬 RESTful Web Services

---

## 🚀 Getting Started

1. Clone the repository:
    ```bash
    git clone https://github.com/tilekarabhi70/SchoolManagmentSystem.git
    ```
2. Open in **IntelliJ IDEA**, **Eclipse**, or **VS Code**.
3. Run `SchoolManagmentSystemApplication.java`.
4. Test APIs via **Postman**, **cURL**, or any REST client.

---

## 🛠 To Do & Improvements

- 🐞 Fix update logic (currently sets same values)
- ✅ Add input validation with annotations
- 🚨 Add global exception handling
- 📃 Integrate Swagger for API documentation
- 📊 Add pagination support

---

## 🤝 Contributing

Feel free to fork this repo, improve it and submit a pull request. Learning is a journey, let’s grow together!

---

## 👨‍💻 Author

Developed as part of PG-DAC coursework @ CDAC AIT.
Abhijeet Tilekar
---

