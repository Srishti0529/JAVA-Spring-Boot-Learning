# JUnit

## What is JUnit

JUnit is a **Java unit testing framework** used to test individual methods and classes automatically.

It helps:

* Validate logic
* Detect bugs early
* Automate testing
* Improve code quality

---

## What is Unit Testing

Unit testing means testing **smallest unit of code** (method/class) independently.

Example: testing `add()` method of calculator.

---

## Important Annotations

@Test
Marks a method as test case

@BeforeEach
Runs before every test

@AfterEach
Runs after every test

@BeforeAll
Runs once before all tests

@AfterAll
Runs once after all tests

@Disabled
Skips a test

---

## Assertions (Very Important)

Used to compare expected and actual result.

Common assertions:

* assertEquals()
* assertTrue()
* assertFalse()
* assertNull()
* assertNotNull()
* assertThrows()

Test passes if assertion is true.

---

## Test Lifecycle

```
@BeforeAll
@BeforeEach
@Test
@AfterEach
@AfterAll
```

---

## Test Class

A class that contains test methods.

Located inside:

```
src/test/java
```

---

## Test Method

* Annotated with @Test
* Tests one logic
* Independent

---

## Why JUnit

* Automated testing
* Faster debugging
* Better code quality
* Safe refactoring

---

## JUnit 5 Packages

```
org.junit.jupiter.api
```

---

## Run Tests (Maven)

```
mvn test
```

---
