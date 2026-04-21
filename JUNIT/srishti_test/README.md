# JUnit Simple Calculation Project – README

## Project Overview

This project demonstrates a **basic JUnit 5 testing setup using Maven**.
A simple calculation class is created, and JUnit test cases are written to validate its methods.

The goal is to understand:

* JUnit setup in Maven
* Writing unit tests
* Using assertions
* Running tests using Maven

---

# Project Structure

```
srishti_test
│
├── pom.xml
│
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── srishti
    │               └── App.java
    │
    └── test
        └── java
            └── com
                └── srishti
                    └── AppTest.java
```

---

# Technologies Used

* Java 17
* Maven
* JUnit 5
* VS Code

---

# Maven Dependency (JUnit 5)

JUnit is added using Maven dependency:

```xml
<dependency>
 <groupId>org.junit.jupiter</groupId>
 <artifactId>junit-jupiter</artifactId>
 <scope>test</scope>
</dependency>
```

Maven Surefire plugin is used to run test cases.

---

# Calculation Class

The main class contains simple calculation methods.

Functions implemented:

* Addition
* Division (optional if added)
* Subtraction / Multiplication (if added)

Purpose:
This class acts as the **unit under test**.

---

# Test Class

JUnit test class created inside:

```
src/test/java/com/srishti
```

Test methods are written using:

* @Test annotation
* Assertions

Each test verifies one method.

Example test scenarios:

* Add two numbers
* Divide numbers
* Validate expected output

---

# JUnit Concepts Used

## @Test

Marks method as test case.

## Assertions

Used to compare expected and actual output.

Example:

* assertEquals()
* assertTrue()
* assertThrows() (optional)

---

# How Tests Work

Flow:

1. Create object of App class
2. Call method (add, divide, etc.)
3. Compare output using assertion
4. JUnit marks test as pass/fail

---

# Running Tests

Run tests using Maven command:

```
mvn test
```

Maven compiles:

* main code
* test code

Then executes JUnit tests.

---

# Expected Output

```
Tests run: 2
Failures: 0
Errors: 0
BUILD SUCCESS
```

This means:

* All tests passed
* Code working correctly

---

# What This Project Demonstrates

* Maven project setup
* JUnit 5 integration
* Unit testing basics
* Writing test methods
* Using assertions
* Running tests using Maven

---

# Learning Outcome

After completing this project:

* Understand JUnit basics
* Write simple unit tests
* Test calculation logic
* Use Maven for testing
* Validate code automatically

---

