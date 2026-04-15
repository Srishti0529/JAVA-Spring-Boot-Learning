# srishti-app – First Maven Project

## 📌 Project Description

`srishti-app` is my first Maven-based Java project created to understand the Maven project structure, build lifecycle, and dependency management. The project follows the standard Maven directory layout and is managed using the `pom.xml` configuration file.

---

# 📁 Project Structure

```
srishti-app
│
├── .mvn
├── src
│   ├── main
│   │   └── java
│   │        └── (application source code)
│   │
│   └── test
│       └── java
│            └── (test classes)
│
├── target
├── pom.xml
└── README.md
```

---

# 📂 Folder Explanation

### .mvn

Contains Maven wrapper configuration. It allows the project to run Maven without installing Maven globally.

### src/main/java

Contains the main Java application source code.

### src/test/java

Contains unit test classes.

### target

This folder is automatically created by Maven and contains:

* Compiled `.class` files
* Packaged `.jar` file
* Build output

### pom.xml

This is the main Maven configuration file. It defines:

* Project information
* Dependencies
* Plugins
* Build configuration

### README.md

Project documentation file explaining project details.

---

# ⚙️ Maven Project Details

Defined inside `pom.xml`:

* **groupId** → project package name
* **artifactId** → project name (`srishti-app`)
* **version** → project version

Example:

```
groupId: com.example
artifactId: srishti-app
version: 1.0-SNAPSHOT
```

---

# 🔄 Maven Build Lifecycle Used

Maven follows a build lifecycle:

```
validate → compile → test → package → install
```

---

# 🛠️ Maven Commands

### Compile Project

```
mvn compile
```

### Run Tests

```
mvn test
```

### Package Project (JAR)

```
mvn package
```

### Clean Project

```
mvn clean
```

### Install to Local Repository

```
mvn install
```

### Clean + Install

```
mvn clean install
```

---

# 📦 Output

After running:

```
mvn package
```

Maven generates:

```
target/srishti-app-1.0-SNAPSHOT.jar
```

---

# 🎯 Objectives of this Project

* Understand Maven structure
* Learn pom.xml configuration
* Run Maven lifecycle commands
* Generate JAR file
* Understand dependency management
* Work with Maven wrapper (.mvn)

---

# ✅ Conclusion

This project demonstrates the basic setup of a Maven application. It follows the standard Maven directory layout and uses `pom.xml` to manage the build process. This serves as the foundation for future Java and Spring Boot Maven projects.
---