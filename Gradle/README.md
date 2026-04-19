# Gradle

## What is Gradle?

Gradle is an open-source **build automation tool** used to build, test, and deploy applications. It is commonly used for **Java**, **Spring Boot**, **Android**, and other JVM-based projects. Gradle automates tasks like compiling code, managing dependencies, running tests, and packaging applications.

---

## Why Use Gradle?

* Fast builds with incremental compilation
* Easy dependency management
* Flexible and customizable build scripts
* Supports multi-project builds
* Uses Groovy or Kotlin DSL
* Compatible with Maven repositories

---

## Key Features

### 1. Dependency Management

Gradle automatically downloads required libraries from repositories like Maven Central.

### 2. Build Automation

You can automate tasks such as:

* Compile source code
* Run tests
* Package JAR/WAR
* Deploy application

### 3. Incremental Builds

Gradle only rebuilds the parts of the project that changed, making builds faster.

### 4. Plugin Support

Gradle provides plugins for:

* Java
* Spring Boot
* Web applications
* Android
* Kotlin

---

## Gradle vs Maven

| Feature               | Gradle        | Maven   |
| --------------------- | ------------- | ------- |
| Build Speed           | Faster        | Slower  |
| Build Script          | Groovy/Kotlin | XML     |
| Flexibility           | High          | Limited |
| Dependency Management | Yes           | Yes     |
| Incremental Build     | Yes           | No      |

---

## Basic Gradle Commands

Build project:

```
gradle build
```

Clean project:

```
gradle clean
```

Run tests:

```
gradle test
```

Run application:

```
gradle run
```

---

## Advantages of Gradle

* Faster than Maven
* More flexible configuration
* Supports large projects
* Easy plugin integration
* Better performance

---

## Summary

Gradle is a modern build tool that simplifies project building, dependency management, and automation. It is widely used in Java and Spring Boot applications because of its speed, flexibility, and powerful features.
---
# Gradle Multi-Project (Gradle-Sample)

This project is a **Gradle Application Project** generated using `gradle init`.
It follows the **multi-project structure** with an `app` module and Gradle wrapper configuration.

---

## Project Structure

```
Gradle
│── settings.gradle
│── gradle.properties
│── gradlew
│── gradlew.bat
│── .gitignore
│── .gitattributes
│
├── gradle
│   ├── wrapper
│   └── libs.versions.toml
│
└── app
    │── build.gradle
    └── src
        ├── main
        │   └── java
        └── test
            └── java
```

---

## Modules

### app

Contains the main application code:

* Java source files
* Tests
* Dependencies
* Application configuration

---

## Important Files

### settings.gradle

Defines project name and modules.

### build.gradle (inside app)

Contains:

* Plugins
* Dependencies
* Application main class
* Build configuration

### gradlew / gradlew.bat

Gradle wrapper scripts to run Gradle without installing it.

### gradle/wrapper

Contains Gradle wrapper configuration and version.

### libs.versions.toml

Centralized dependency version management.

---

## Build the Project

Run from root folder:

```
gradlew build
```

---

## Run Application

```
gradlew run
```

---

## Run Tests

```
gradlew test
```

---

## Clean Project

```
gradlew clean
```

---

## Source Code Location

Main code:

```
app/src/main/java
```

Test code:

```
app/src/test/java
```

---

## Summary

This is a Gradle-based Java application using:

* Multi-project structure
* Gradle wrapper
* Version catalog (libs.versions.toml)
* Separate app module

The project can be built, tested, and run using Gradle commands.
---

