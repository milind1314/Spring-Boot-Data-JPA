# 🛠️ Spring Boot Data JPA Repository Projects

This repository contains multiple Spring Boot projects demonstrating various features of **Spring Data JPA**, including CRUD operations, Paging & Sorting, Finder methods, and JPA Repository capabilities.

---

## 📁 Project Modules

### 📌 1. BootDataJPAProj01-CRUDRepositoryApplication
- Demonstrates basic CRUD operations using `CrudRepository`.
- Entity class is managed with basic `save()`, `findById()`, `findAll()`, `deleteById()`.

### 📌 2. BootDataJPAProj02-PagingAndSortingRepository
- Uses `PagingAndSortingRepository` to:
  - Fetch paginated data
  - Sort results dynamically using `Sort.by(...)`

### 📌 3. BootDataJPAProj04-CustomMethods-FinderMethods
- Implements finder methods using Spring Data method naming conventions.
- Example: `findBySalaryGreaterThan(Double salary)`, `findByDeptAndRole(String dept, String role)`

### 📌 4. BootDataJPAProj04-JPARepositoryApplication
- Full usage of `JpaRepository` including:
  - Pagination
  - Sorting
  - Batch operations
  - Custom JPQL/native queries

---
