# 📘 JUnit Testing with Maven – Basic Calculator Project

## 📌 Overview

This project demonstrates the use of **JUnit 5** for testing a simple Java application built using **Maven**. It focuses on writing unit tests for basic arithmetic operations and handling exceptions.

---

## 🎯 Objective

* Understand JUnit testing in Java
* Learn how to use Maven for project setup
* Practice writing unit tests
* Handle exceptions using test cases

---

## 🧱 Project Structure

```
junit_demo/
 ├── pom.xml
 └── src/
     ├── main/java/com/srishti_test/App.java
     └── test/java/com/srishti_test/AppTest.java
```

---

## ⚙️ Technologies Used

* Java 17
* Maven
* JUnit 5

---

## 🧮 Application Description

The `App` class implements basic arithmetic operations:

* Addition
* Subtraction
* Multiplication
* Division (with exception handling for division by zero)

---

## 🧪 Test Cases Implemented

The `AppTest` class includes:

* ✅ Addition test
* ✅ Subtraction test
* ✅ Multiplication test
* ✅ Division test
* ✅ Exception test (division by zero)

---

## 🚀 How to Run the Project

### 1. Navigate to project folder

```bash
cd junit_demo
```

### 2. Run tests

```bash
mvn test
```

---

## 🔍 Key Learnings

* Writing unit tests using JUnit
* Using assertions like `assertEquals` and `assertThrows`
* Handling exceptions in test cases
* Structuring a Maven project
* Managing dependencies using `pom.xml`

---

## ⚠️ Best Practices Followed

* Clean and simple code structure
* Proper package naming
* Use of reusable test objects
* Exception handling for edge cases
* Separation of main code and test code

---

## 📌 Conclusion

This project provides a basic understanding of unit testing in Java using JUnit and Maven. It helps build a strong foundation for writing reliable and maintainable code.

---
