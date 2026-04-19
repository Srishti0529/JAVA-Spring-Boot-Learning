# 📦 Gradle + Spring Core Project (Theory + Implementation)

---

# 📌 1. Introduction

This project demonstrates the fundamentals of **Gradle** and **Spring Core** by building a simple application that uses **Dependency Injection (DI)** and **Inversion of Control (IoC)**.

The goal is to understand:

* How Gradle builds and runs Java projects
* How Spring manages object creation
* How dependencies are injected automatically

---

# ⚙️ 2. What is Gradle?

**Gradle** is a build automation tool used for:

* Compiling code
* Managing dependencies
* Running applications
* Packaging projects

### 🔹 Why Gradle?

* Faster than traditional tools
* Flexible and customizable
* Uses Groovy/Kotlin DSL
* Supports multi-module projects

---

# 🌱 3. What is Spring Core?

Spring Core is the **foundation of the Spring Framework**.

It provides:

* **IoC (Inversion of Control)**
* **DI (Dependency Injection)**

Instead of creating objects manually, Spring manages them.

---

# 🔥 4. Core Concepts

---

## 🔄 4.1 Inversion of Control (IoC)

### 👉 Definition:

Control of object creation is transferred from the programmer to the Spring container.

### ❌ Without IoC:

```java
Service s = new Service();
```

### ✅ With IoC:

```java
Service s = context.getBean(Service.class);
```

---

## 💉 4.2 Dependency Injection (DI)

### 👉 Definition:

Dependencies are provided externally instead of being created inside the class.

### Example:

```java
class Car {
    Engine engine;
    Car(Engine engine) {
        this.engine = engine;
    }
}
```

---

## 📦 4.3 Bean

A **bean** is an object managed by Spring.

---

## 🏭 4.4 ApplicationContext

The **Spring container** responsible for:

* Creating beans
* Managing lifecycle
* Injecting dependencies

---

# 🏗️ 5. Project Implementation

---

## 📁 5.1 Project Structure

```id="cixv1y"
Gradle-concepts/
│
├── app/
│   ├── build.gradle
│   └── src/
│       ├── main/java/org/example/
│       │   └── App.java
│       └── test/
│
├── settings.gradle
```

---

## ⚙️ 5.2 build.gradle

```groovy id="3jwhlm"
plugins {
    id 'java'
    id 'application'
}

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.springframework:spring-context:6.1.6'
}

application {
    mainClass = 'org.example.App'
}
```

### 🔹 Explanation:

* `java` → compiles Java code
* `application` → allows running using Gradle
* `spring-context` → provides Spring Core features
* `mainClass` → entry point of application

---

## 👨‍💻 5.3 Source Code

### 📌 App.java

```java id="97l8bf"
package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

class MessageService {
    public String getMessage() {
        return "Hello from Spring + Gradle 🚀";
    }
}

@Configuration
class AppConfig {
    @Bean
    public MessageService messageService() {
        return new MessageService();
    }
}

public class App {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        MessageService service = context.getBean(MessageService.class);

        System.out.println(service.getMessage());
    }
}
```

---

# 🔄 6. Execution Flow

1. Gradle runs the project using `gradle run`
2. `main()` method starts execution
3. Spring container is initialized
4. Configuration class is loaded
5. Bean (`MessageService`) is created
6. Bean is retrieved using `getBean()`
7. Output is printed

---

# ▶️ 7. How to Run

### Build the project

```id="p09t11"
gradle build
```

### Run the application

```id="18d67v"
gradle run
```

### Skip tests (if needed)

```id="v0g49g"
gradle build -x test
```

---

# ⚠️ 8. Common Errors & Fixes

---

## ❌ ClassNotFoundException

* Check package name
* Check `mainClass` in `build.gradle`

---

## ❌ Test Compilation Error

* Delete test folder OR
* Add JUnit dependency OR
* Run:

```id="6bqjcc"
gradle build -x test
```

---

## ❌ AccessDeniedException

* Close IDE
* Delete `build/` folder
* Avoid OneDrive path

---

# 🧠 9. Key Learnings

* Gradle build lifecycle
* Dependency management
* Spring IoC container
* Bean creation using annotations
* Dependency Injection

---

# 🎯 10. Conclusion

This project provides a foundational understanding of:

* How Gradle automates builds
* How Spring manages objects
* How DI reduces coupling

It serves as a starting point for building scalable applications.

---

# 🚀 11. Future Enhancements

* Convert to Spring Boot
* Build REST APIs
* Connect to database
* Implement layered architecture

---

# 👨‍💻 Author

Akshat Johri