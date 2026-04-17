# srishti-web-app

A simple Java web application created using Maven archetype (`maven-archetype-webapp`).
This project demonstrates a basic Maven-based web structure with JSP and `web.xml` configuration.

---

## 📁 Project Structure

```
srishti-web-app
│── pom.xml
│── README.md
│
├── src
│   └── main
│       └── webapp
│           ├── WEB-INF
│           │   └── web.xml
│           └── index.jsp
│
└── target
    └── srishti-web-app.war
```

---

## ⚙️ Technologies Used

* Java
* Maven
* JSP
* Servlets
* Apache Tomcat (or any servlet container)

---

## 🚀 How to Build the Project

Run the following command from project root:

```bash
mvn clean package
```

This will generate:

```
target/srishti-web-app.war
```

---

## ▶️ How to Run the Application

### Option 1: Deploy on Tomcat

1. Build the project
2. Copy the WAR file:

```
target/srishti-web-app.war
```

3. Paste into Tomcat `webapps` folder
4. Start Tomcat
5. Open in browser:

```
http://localhost:8080/srishti-web-app/
```

---

## 📄 index.jsp

This is the default landing page of the application.

You can modify:

```
src/main/webapp/index.jsp
```

---

## ⚙️ web.xml

Deployment descriptor location:

```
src/main/webapp/WEB-INF/web.xml
```

Used for:

* Servlet configuration
* Welcome file list
* Filters
* Listener configuration

---

## 📦 Maven Packaging

This project uses:

```xml
<packaging>war</packaging>
```

Which creates a deployable **WAR** file.

---

## 👩‍💻 Author

Srishti

---

## 📌 Notes

* This is a basic Maven webapp template
* Can be extended with Servlets, Filters, and Spring
* Can be deployed to Tomcat / Jetty / WildFly

---
