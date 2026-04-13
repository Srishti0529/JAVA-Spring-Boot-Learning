# 📦 Object-Oriented Programming (OOP) in Java

## 📌 Introduction

Object-Oriented Programming (OOP) is a programming paradigm based on the concept of **objects and classes**.

It helps in organizing code into reusable and modular structures.

---

## 🔹 What is OOP?

OOP is a way of designing programs using:
- Classes  
- Objects  
- Principles like inheritance, encapsulation, polymorphism, and abstraction  

---

## 🔹 Core Concepts of OOP

### 1️⃣ Class

#### 📖 Definition
A class is a blueprint or template used to create objects.

#### 🧠 Syntax
class ClassName {
    // variables and methods
}

---

### 2️⃣ Object

#### 📖 Definition
An object is an instance of a class.

#### 🧠 Syntax
ClassName obj = new ClassName();

---

### 3️⃣ Encapsulation

#### 📖 Definition
Wrapping data (variables) and methods into a single unit (class).

- Achieved using private variables and public methods  

---

### 4️⃣ Inheritance

#### 📖 Definition
A mechanism where one class acquires properties of another class.

- Promotes code reusability  

#### 🧠 Syntax
class Child extends Parent {
    // code
}

---

### 5️⃣ Polymorphism

#### 📖 Definition
Ability to perform one task in different ways.

- Method Overloading (compile-time)  
- Method Overriding (runtime)  

---

### 6️⃣ Abstraction

#### 📖 Definition
Hiding implementation details and showing only functionality.

- Achieved using abstract classes and interfaces  

---

## 🔹 Types of Inheritance

- Single Inheritance  
- Multilevel Inheritance  
- Hierarchical Inheritance  

---

## ⚠️ Important Points

- OOP improves code reusability  
- Helps in data security (encapsulation)  
- Makes code modular and maintainable  
- Supports real-world modeling  
- Java does not support multiple inheritance using classes  

---

## 🚀 Summary

- OOP is based on objects and classes  
- Four pillars: Encapsulation, Inheritance, Polymorphism, Abstraction  
- Helps in writing clean and reusable code  

---

# 📦 Encapsulation in Java

## 📌 Introduction

**Encapsulation** is one of the core principles of Object-Oriented Programming (OOP).

It is the process of **wrapping data (variables) and methods into a single unit (class)** and restricting direct access to the data.

---

## 🔹 What is Encapsulation?

Encapsulation means **data hiding**.

- Variables are kept private  
- Access is provided through public methods (getters and setters)  

---

## 🔹 Syntax

class ClassName {

    private dataType variableName;

    public dataType getVariableName() {
        return variableName;
    }

    public void setVariableName(dataType value) {
        this.variableName = value;
    }
}

---

## 🔹 Key Features

- Data hiding  
- Controlled access  
- Improved security  
- Better code organization  

---

## 🔹 Getter and Setter Methods

### 📖 Getter
Used to access the value of a variable.

### 🧠 Syntax
public dataType getVariableName() {
    return variableName;
}

---

### 📖 Setter
Used to modify the value of a variable.

### 🧠 Syntax
public void setVariableName(dataType value) {
    this.variableName = value;
}

---

## 🔹 Advantages of Encapsulation

- Protects data from unauthorized access  
- Improves maintainability  
- Allows validation before setting values  
- Supports flexibility in code  

---

## ⚠️ Important Points

- Use `private` for variables  
- Use `public` methods to access data  
- Data cannot be accessed directly from outside the class  
- Helps in achieving data security  

---

## 🚀 Summary

- Encapsulation = Data hiding  
- Achieved using private variables + public methods  
- Improves security and control  
- Important concept in OOP  

---

# 📦 Constructors in Java

## 📌 Introduction

A **constructor** in Java is a special method used to initialize objects.

- It is automatically called when an object is created  
- It has the same name as the class  
- It does not have a return type  

---

## 🔹 What is a Constructor?

A **constructor** is used to assign initial values to the object’s variables when the object is created.

---

## 🔹 Syntax

class ClassName {

    ClassName() {
        // initialization code
    }

}

---

## 🔹 Types of Constructors

### 1️⃣ Default Constructor

#### 📖 Definition
A constructor with no parameters. It is provided by Java if no constructor is written.

#### 🧠 Syntax
ClassName() {
    // code
}

---

### 2️⃣ Parameterized Constructor

#### 📖 Definition
A constructor that accepts parameters to initialize variables.

#### 🧠 Syntax
ClassName(dataType param1, dataType param2) {
    // code
}

---

## 🔹 Constructor vs Method

| Feature     | Constructor          | Method             |
|-------------|----------------------|--------------------|
| Name        | Same as class        | Any name           |
| Return Type | No return type       | Has return type    |
| Purpose     | Initialize object    | Perform operations |
| Call        | Automatically called | Called explicitly  |

---

## ⚠️ Important Points

- Constructor name must match class name  
- No return type (not even void)  
- Called automatically when object is created  
- Can be overloaded  
- If no constructor is defined, Java provides a default constructor  
- Used to initialize instance variables  

---

## 🚀 Summary

- Constructor initializes objects  
- Same name as class  
- No return type  
- Types: Default, Parameterized  
- Supports overloading  

---

# 📦 Types of Variables in OOP (Java)

## 📌 Introduction

In Java (OOP), variables are used to store data inside a class and methods.

Based on their declaration and usage, variables are classified into:
- Local Variables  
- Instance Variables  
- Static Variables  

---

## 🔹 1️⃣ Local Variables

### 📖 Definition
Local variables are declared inside a method, constructor, or block.

- Scope is limited to that method/block  
- Must be initialized before use  
- Stored in stack memory  

### 🧠 Syntax
void methodName() {
    dataType variableName;
}

---

## 🔹 2️⃣ Instance Variables

### 📖 Definition
Instance variables are declared inside a class but outside methods.

- Belong to an object (instance of class)  
- Each object has its own copy  
- Stored in heap memory  

### 🧠 Syntax
class ClassName {
    dataType variableName;
}

---

## 🔹 3️⃣ Static Variables

### 📖 Definition
Static variables are declared using the `static` keyword.

- Shared among all objects  
- Only one copy exists  
- Stored in class memory  

### 🧠 Syntax
class ClassName {
    static dataType variableName;
}

---

## ⚠️ Important Points

- Local variables must be initialized before use  
- Instance variables are accessed using objects  
- Static variables are accessed using class name  
- Static variables are shared across all objects  
- Each object has its own instance variables  

---

## 🚀 Summary

- Three types: Local, Instance, Static  
- Local → method-level  
- Instance → object-level  
- Static → class-level (shared)  

---

# 📦 Access Specifiers in Java

## 📌 Introduction

Access specifiers in Java are used to define the **visibility (access level)** of classes, variables, methods, and constructors.

They help in achieving **encapsulation** and **data hiding**.

---

## 🔹 Types of Access Specifiers

Java provides four types of access specifiers:

1. public  
2. private  
3. protected  
4. default (no keyword)

---

## 🔹 1️⃣ Public

### 📖 Definition
The **public** access specifier allows access from anywhere in the program.

### 🧠 Syntax
public dataType variableName;

public void methodName() {
    // code
}

---

## 🔹 2️⃣ Private

### 📖 Definition
The **private** access specifier allows access only within the same class.

### 🧠 Syntax
private dataType variableName;

private void methodName() {
    // code
}

---

## 🔹 3️⃣ Protected

### 📖 Definition
The **protected** access specifier allows access:
- within the same package  
- in subclasses (even in different packages)  

### 🧠 Syntax
protected dataType variableName;

protected void methodName() {
    // code
}

---

## 🔹 4️⃣ Default (No Modifier)

### 📖 Definition
If no access specifier is specified, it is **default**.

- Accessible only within the same package  

### 🧠 Syntax
dataType variableName;

void methodName() {
    // code
}

---

## 🔹 Access Level Table

| Modifier  | Same Class | Same Package | Subclass | Other Package |
|-----------|------------|--------------|----------|---------------|
| public    |         ✅ |          ✅ |       ✅ |           ✅ |
| protected |         ✅ |          ✅ |       ✅ |           ❌ |
| default   |         ✅ |          ✅ |       ❌ |           ❌ |
| private   |         ✅ |          ❌ |       ❌ |           ❌ |

---

## ⚠️ Important Points

- `public` → accessible everywhere  
- `private` → only within class  
- `protected` → package + inheritance  
- `default` → package-only access  
- Only one public class per file  
- Encapsulation is achieved using private variables  

---

## 🚀 Summary

- Access specifiers control visibility  
- Four types: public, private, protected, default  
- Used for security and encapsulation  
- Important for OOP design  

---

# 📦 Inheritance in Java

## 📌 Introduction

**Inheritance** is one of the core concepts of Object-Oriented Programming (OOP).

It allows one class to acquire the properties and behavior of another class.

---

## 🔹 What is Inheritance?

Inheritance is a mechanism where a **child class (subclass)** inherits fields and methods from a **parent class (superclass)**.

- Promotes code reusability  
- Reduces redundancy  

---

## 🔹 Syntax

class Parent {
    // properties and methods
}

class Child extends Parent {
    // additional properties and methods
}

---

## 🔹 Types of Inheritance in Java

### 1️⃣ Single Inheritance

#### 📖 Definition
One child class inherits from one parent class.

#### 🧠 Syntax
class Child extends Parent {
}

---

### 2️⃣ Multilevel Inheritance

#### 📖 Definition
A class inherits from a class, which is already inheriting from another class.

#### 🧠 Syntax
class A {
}

class B extends A {
}

class C extends B {
}

---

### 3️⃣ Hierarchical Inheritance

#### 📖 Definition
Multiple child classes inherit from the same parent class.

#### 🧠 Syntax
class Parent {
}

class Child1 extends Parent {
}

class Child2 extends Parent {
}

---

## 🔹 Method Overriding

### 📖 Definition
When a subclass provides a specific implementation of a method already defined in the parent class.

---

## 🔹 super Keyword

### 📖 Definition
Used to refer to the parent class object.

- Calls parent class constructor  
- Accesses parent class methods and variables  

### 🧠 Syntax
super();

super.methodName();

---

## ⚠️ Important Points

- Inheritance is achieved using `extends` keyword  
- Java does not support multiple inheritance using classes  
- Private members are not inherited  
- Constructor is not inherited  
- Supports code reusability and hierarchy  

---

## 🚀 Summary

- Inheritance = acquiring properties of another class  
- Types: Single, Multilevel, Hierarchical  
- Uses `extends` keyword  
- Supports method overriding  
- Improves reusability and structure  

---

# 📦 Method Overloading & Method Overriding in Java

## 📌 Introduction

Method Overloading and Method Overriding are important concepts in Java that support **polymorphism**.

- **Overloading** → same method name, different parameters  
- **Overriding** → redefining parent class method in child class  

---

## 🔹 Method Overloading

### 📖 Definition
Method Overloading is the process of defining multiple methods with the same name but different parameters in the same class.

- Achieved at compile-time  
- Also called **Compile-Time Polymorphism**  

### 🧠 Syntax
methodName(dataType a) {
    // code
}

methodName(dataType a, dataType b) {
    // code
}

---

## 🔹 Rules of Method Overloading

- Method name must be same  
- Parameters must be different (type, number, or order)  
- Return type can be same or different  
- Happens in same class  

---

## 🔹 Method Overriding

### 📖 Definition
Method Overriding occurs when a subclass provides a specific implementation of a method already defined in the parent class.

- Achieved at runtime  
- Also called **Runtime Polymorphism**  

### 🧠 Syntax
class Parent {
    void methodName() {
        // code
    }
}

class Child extends Parent {
    void methodName() {
        // code
    }
}

---

## 🔹 Rules of Method Overriding

- Method name must be same  
- Parameters must be same  
- Must be in parent-child relationship  
- Access modifier can be same or more accessible  
- Cannot override static or final methods  

---


## ⚠️ Important Points

- Overloading improves flexibility  
- Overriding supports runtime behavior change  
- Overriding requires inheritance  
- `@Override` annotation is recommended  
- Static methods cannot be overridden  

---

## 🚀 Summary

- Overloading → same name, different parameters  
- Overriding → same method in parent & child  
- Both support polymorphism  
- Important for OOP design  

# 📦 Polymorphism in Java

## 📌 Introduction

**Polymorphism** is one of the core concepts of Object-Oriented Programming (OOP).

The word "polymorphism" means **many forms**.

It allows one method or object to behave differently in different situations.

---

## 🔹 What is Polymorphism?

Polymorphism allows a single action to be performed in different ways.

---

## 🔹 Types of Polymorphism

### 1️⃣ Compile-Time Polymorphism (Static Polymorphism)

#### 📖 Definition
Achieved using **method overloading**, where multiple methods have the same name but different parameters.

#### 🧠 Syntax
methodName(dataType a) {
    // code
}

methodName(dataType a, dataType b) {
    // code
}

---

### 2️⃣ Runtime Polymorphism (Dynamic Polymorphism)

#### 📖 Definition
Achieved using **method overriding**, where a subclass provides a specific implementation of a method already defined in the parent class.

#### 🧠 Syntax
class Parent {
    void methodName() {
        // code
    }
}

class Child extends Parent {
    void methodName() {
        // code
    }
}

---

## 🔹 Method Overloading vs Method Overriding

| Feature | Overloading | Overriding |
|--------|------------|-----------|
| Time | Compile-time | Runtime |
| Class | Same class | Different classes |
| Parameters | Different | Same |
| Inheritance | Not required | Required |

---

## ⚠️ Important Points

- Polymorphism means "many forms"  
- Supports flexibility and reusability  
- Overloading → compile-time polymorphism  
- Overriding → runtime polymorphism  
- Runtime polymorphism uses inheritance  

---

## 🚀 Summary

- Polymorphism allows one method to behave differently  
- Two types: Compile-time and Runtime  
- Achieved using overloading and overriding  
- Important concept in OOP  

---
# 📦 Upcasting & Downcasting in Java

## 📌 Introduction

In Java, **Upcasting and Downcasting** are used in **inheritance** to convert objects between parent and child classes.

They are part of **type casting in OOP**.

---

## 🔹 What is Upcasting?

### 📖 Definition
Upcasting is the process of converting a **child class object into a parent class reference**.

- Happens automatically  
- Also called **widening reference conversion**  
- Used in runtime polymorphism  

### 🧠 Syntax
Parent obj = new Child();

---

## 🔹 What is Downcasting?

### 📖 Definition
Downcasting is the process of converting a **parent class reference back to a child class object**.

- Done manually  
- May cause runtime errors if not done properly  
- Requires explicit casting  

### 🧠 Syntax
Child obj = (Child) parentObj;

---


## 🔹 Important Points

- Upcasting is implicit (automatic)  
- Downcasting is explicit (manual)  
- Both require inheritance  
- Downcasting may throw ClassCastException  
- Used in polymorphism  

---

## 🔹 Real Life Example Concept

- Upcasting → Dog treated as Animal  
- Downcasting → Animal treated back as Dog  

---

## 🚀 Summary

- Upcasting → child object to parent reference  
- Downcasting → parent reference to child object  
- Upcasting is safe and automatic  
- Downcasting is risky and manual  

---

# 🎭 Abstraction in Java

## 📌 Introduction

**Abstraction** is one of the core principles of **Object-Oriented Programming (OOP)**.

It is used to **hide implementation details** and **show only essential functionality** to the user.

Abstraction helps in:

* Reducing complexity
* Increasing security
* Improving maintainability
* Achieving loose coupling

---

## 🔹 What is Abstraction?

### 📖 Definition

Abstraction is the process of **hiding internal implementation** and **showing only functionality**.

* Hides unnecessary details
* Shows only important features
* Achieved using **Abstract Class** and **Interface**

---

# 🔹 Ways to Achieve Abstraction in Java

Java provides **two ways**:

1. Abstract Class
2. Interface

---

# 🔹 Abstract Class

### 📖 Definition

A class declared using **abstract keyword** is called an abstract class.

* Can contain abstract methods
* Can contain normal methods
* Cannot be instantiated
* Must be inherited

---

### 🧾 Syntax

```java
abstract class ClassName {
    
    abstract void methodName();
    
    void normalMethod() {
        
    }
}
```

---

# 🔹 Abstract Method

### 📖 Definition

A method without body is called abstract method.

### 🧾 Syntax

```java
abstract void methodName();
```

---

# 🔹 Interface

### 📖 Definition

Interface is used to achieve **100% abstraction**.

* Contains abstract methods
* Uses `implements` keyword
* Methods are public by default

---

### 🧾 Syntax

```java
interface InterfaceName {

    void method1();
    void method2();
}
```

---

# 🔹 Implementing Interface

### 🧾 Syntax

```java
class ClassName implements InterfaceName {

    public void method1() {
        
    }

    public void method2() {
        
    }
}
```

---

# 🔹 Extending Abstract Class

### 🧾 Syntax

```java
class ChildClass extends AbstractClass {

    void methodName() {
        
    }
}
```

---

# 🔹 Key Points

✔ Abstraction hides implementation
✔ Abstract class provides partial abstraction
✔ Interface provides full abstraction
✔ Cannot create object of abstract class
✔ Must override abstract methods
✔ Abstract class uses **extends**
✔ Interface uses **implements**

---

# 🚀 Summary

* Abstraction = hiding details
* Achieved using abstract class and interface
* Improves code structure
* Supports runtime polymorphism
* Used for designing flexible applications

---

# 🔌 Interface in Java

## 📌 Introduction

An **Interface** in Java is used to achieve **100% abstraction**.

It defines **what a class must do**, but **not how it does it**.

Interfaces are used to:

* Achieve abstraction
* Support multiple inheritance
* Provide loose coupling
* Define common behavior

---

# 🔹 What is Interface?

### 📖 Definition

An **interface** is a blueprint of a class that contains **abstract methods**.

* Methods are **public and abstract** by default
* Variables are **public static final**
* Cannot create object of interface
* Class must use **implements** keyword

---

# 🔹 Interface Syntax

```java
interface InterfaceName {

    void method1();
    void method2();

}
```

---

# 🔹 Implementing Interface Syntax

```java
class ClassName implements InterfaceName {

    public void method1() {

    }

    public void method2() {

    }
}
```

---

# 🔹 Multiple Interface Syntax

```java
interface A {
    void show();
}

interface B {
    void display();
}

class Test implements A, B {

    public void show() {

    }

    public void display() {

    }
}
```

---

# 🔹 Interface with Variables

```java
interface Demo {

    int x = 10;   // public static final

    void show();
}
```

---

# 🔹 Interface vs Abstract Class

| Feature     | Interface           | Abstract Class    |
| ----------- | ------------------- | ----------------- |
| Methods     | Abstract only       | Abstract + Normal |
| Variables   | public static final | Instance allowed  |
| Constructor | No                  | Yes               |
| Keyword     | implements          | extends           |
| Inheritance | Multiple            | Single            |

---

# 🔹 Key Points

✔ Interface provides 100% abstraction
✔ Use **implements** keyword
✔ Methods are public by default
✔ Cannot create object of interface
✔ Supports multiple inheritance
✔ Class must override all methods

---

# 🚀 Summary

* Interface = blueprint of class
* Used for full abstraction
* Supports multiple inheritance
* Improves loose coupling
* Methods must be implemented
---

# 🔢 Enum in Java

## 📌 Introduction

**Enum** in Java is used to define a **fixed set of constants**.

It improves **readability**, **type safety**, and **maintainability**.

Example:
Days of week, Directions, Status, Months, etc.

---

# 🔹 What is Enum?

### 📖 Definition

Enum is a **special data type** used to represent **group of constants**.

* Constants are **public static final** by default
* Enum keyword is used
* Cannot create enum objects using `new`
* Used like a class

---

# 🔹 Enum Syntax

```java
enum EnumName {
    CONSTANT1,
    CONSTANT2,
    CONSTANT3
}
```

---

# 🔹 Enum Example

```java
// enum declaration
enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class EnumExample {

    public static void main(String[] args) {

        // using enum
        Day d = Day.MONDAY;

        System.out.println(d);
    }
}
```

---

# 🔹 Enum inside Class

```java
class Test {

    enum Status {
        START,
        PROCESS,
        END
    }

    public static void main(String[] args) {

        Status s = Status.START;
        System.out.println(s);
    }
}
```

---

# 🔹 Enum with Switch

```java
enum Level {
    LOW, MEDIUM, HIGH
}

public class Demo {

    public static void main(String[] args) {

        Level l = Level.HIGH;

        switch(l) {

            case LOW:
                System.out.println("Low level");
                break;

            case MEDIUM:
                System.out.println("Medium level");
                break;

            case HIGH:
                System.out.println("High level");
                break;
        }
    }
}
```

---

# 🔹 Key Points

✔ Enum is collection of constants
✔ Use `enum` keyword
✔ Constants are uppercase by convention
✔ Improves readability
✔ Can be used in switch
✔ Type-safe

---

# 🚀 Summary

* Enum = fixed constants
* Used instead of static final variables
* Cleaner and safer code
* Used like a class

---

