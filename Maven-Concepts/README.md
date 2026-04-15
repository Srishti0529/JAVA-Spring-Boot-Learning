# Maven

## 📌 What is Maven?

**Maven** is a build automation and project management tool primarily used for Java projects. It helps manage project dependencies, build lifecycle, plugins, and documentation using a standardized structure.

Maven uses a **Project Object Model (POM)** file (`pom.xml`) to define project configuration.

---

# 🧱 Maven Project Structure

```
project-name
│
├── src
│   ├── main
│   │   ├── java        → Application source code
│   │   └── resources   → Config files
│   │
│   └── test
│       ├── java        → Test classes
│       └── resources   → Test resources
│
├── target              → Compiled files (auto-generated)
└── pom.xml             → Maven configuration file
```

---

# 📄 pom.xml (Core of Maven)

The `pom.xml` file contains:

* Project details
* Dependencies
* Plugins
* Build configuration
* Version info

### Example pom.xml

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
         http://maven.apache.org/xsd/maven-4.0.0.xsd">

    <modelVersion>4.0.0</modelVersion>

    <groupId>com.example</groupId>
    <artifactId>demo-project</artifactId>
    <version>1.0-SNAPSHOT</version>

</project>
```

---

# 📦 Key Terminology

### 1. groupId

Identifies project group (like package name)

```
com.company.project
```

### 2. artifactId

Project name

```
my-app
```

### 3. version

Project version

```
1.0-SNAPSHOT
```

---

# ⚙️ Maven Build Lifecycle

Maven has 3 main lifecycles:

### 1. Default Lifecycle

Handles project build

Phases:

```
validate
compile
test
package
verify
install
deploy
```

Example:

```
mvn compile
mvn package
mvn install
```

---

### 2. Clean Lifecycle

Removes generated files

```
mvn clean
```

Deletes `target` folder

---

### 3. Site Lifecycle

Creates project documentation

```
mvn site
```

---

# 📚 Maven Commands

### Compile project

```
mvn compile
```

### Run tests

```
mvn test
```

### Create JAR file

```
mvn package
```

### Install to local repository

```
mvn install
```

### Clean build

```
mvn clean install
```

---

# 📦 Dependencies in Maven

Dependencies are added inside `pom.xml`

Example:

```xml
<dependencies>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
    </dependency>
</dependencies>
```

Maven automatically downloads from **Maven Central Repository**

---

# 📁 Maven Repositories

### 1. Local Repository

Stored in your system

```
C:\Users\username\.m2\repository
```

---

### 2. Central Repository

Default online repository

Maven downloads dependencies from here

---

### 3. Remote Repository

Company/private repository

Example:

* Nexus
* Artifactory

---

# 🔌 Maven Plugins

Plugins add extra functionality.

Example:

```xml
<build>
  <plugins>
    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-compiler-plugin</artifactId>
      <version>3.11.0</version>
    </plugin>
  </plugins>
</build>
```

---

# 🚀 Create Maven Project

### Using Command Line

```
mvn archetype:generate
```

Or quickstart:

```
mvn archetype:generate 
-DgroupId=com.example 
-DartifactId=my-app 
-DarchetypeArtifactId=maven-archetype-quickstart 
-DinteractiveMode=false
```

---

# 🎯 Advantages of Maven

✔ Dependency management
✔ Standard project structure
✔ Build automation
✔ Plugin support
✔ Easy integration with IDE
✔ Version control support

---

# ❗ Maven vs Gradle

| Feature    | Maven  | Gradle        |
| ---------- | ------ | ------------- |
| Language   | XML    | Groovy/Kotlin |
| Speed      | Slower | Faster        |
| Simplicity | Easier | Flexible      |
| Learning   | Easy   | Moderate      |

---

# 🧠 Summary

* Maven is a **build & dependency management tool**
* Uses **pom.xml** for configuration
* Follows **standard project structure**
* Automatically downloads dependencies
* Supports **build lifecycle**
* Used in **Java, Spring Boot, enterprise projects**

---
