# Task Manager API 📝

This is a simple **Task Management REST API** built with **Spring Boot**. It allows users to perform basic CRUD (Create, Read, Update, Delete) operations on tasks.

## 🔧 Features

- Create a new task
- Retrieve a single task or all tasks
- Update an existing task
- Delete a task

All data is stored in-memory using a `HashMap`, making it lightweight and easy to test without a database.

## 🧩 Project Structure

- **TaskController** - Handles HTTP requests (POST, GET, PUT, DELETE)
- **TaskService** - Business logic layer using a `Map` to store tasks
- **Task Model** - Represents the task entity with fields like `id`, `title`, `description`, etc.

## 📬 Endpoints Overview

### ▶️ POST `/tasks`

Create a new task.

![POST Example](https://github.com/hasanak0407/160923733092-HasanKhan/blob/2e8dfc3d02eb057c9c9aba5abd8471c650c8c5c2/Post.png)

---

### 📥 GET `/tasks` or `/tasks/{id}`

Fetch all tasks or a specific task by ID.

![GET Example](https://github.com/hasanak0407/160923733092-HasanKhan/blob/2e8dfc3d02eb057c9c9aba5abd8471c650c8c5c2/Get.png)

---

### ♻️ PUT `/tasks/{id}`

Update an existing task.

![PUT Example](https://github.com/hasanak0407/160923733092-HasanKhan/blob/2e8dfc3d02eb057c9c9aba5abd8471c650c8c5c2/Put.png)

---

### ❌ DELETE `/tasks/{id}`

Delete a task by ID.

![DELETE Example](https://github.com/hasanak0407/160923733092-HasanKhan/blob/2e8dfc3d02eb057c9c9aba5abd8471c650c8c5c2/Delete.png)

---
