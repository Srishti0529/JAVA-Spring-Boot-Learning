# 📦 Classes & Objects in Java

## 📌 Introduction

In Java, **Class and Object** are the core concepts of Object-Oriented Programming (OOP).

- A **class** is a blueprint or template
- An **object** is an instance of a class

---

## 🔹 What is a Class?

A **class** is a user-defined data type that contains variables (data) and methods (functions).

### 🧠 Syntax
class ClassName {
    // variables (data members)
    // methods (functions)
}

---

## 🔹 What is an Object?

An **object** is a real-world entity created from a class.

- It represents data and behavior
- It occupies memory

### 🧠 Syntax
ClassName objName = new ClassName();

---

## 🔹 Components of a Class

- **Variables (Instance variables)** → store data  
- **Methods** → define behavior  
- **Constructors** → initialize objects  

---

## ⚠️ Important Points

- Class is a blueprint, object is an instance  
- Multiple objects can be created from one class  
- `new` keyword is used to create objects  

---

## 🚀 Summary

- Class → blueprint  
- Object → real instance  
- Objects use class properties  
- OOP is based on classes and objects  

---

# 📦 Methods in Java

## 📌 Introduction

A **method** in Java is a block of code that performs a specific task.

- It helps in code reusability  
- Improves readability and modularity  

---

## 🔹 What is a Method?

A **method** is a function defined inside a class that is used to perform an operation.

---

## 🔹 Syntax

returnType methodName(parameters) {
    // code
    return value;
}

---

## 🔹 Static Methods

### 📖 Definition
Methods declared using `static` keyword and can be called without creating an object.

### 🧠 Syntax
static returnType methodName() {
    // code
}

---

## 🔹 Instance Methods

### 📖 Definition
Methods that belong to an object and are called using object reference.

### 🧠 Syntax
returnType methodName() {
    // code
}

---

## ⚠️ Important Points

- Method name should be meaningful  
- Return type must match returned value  
- `void` means no return value  
- Static methods belong to class  
- Instance methods require object  
- Overloading improves flexibility  

---

## 🚀 Summary

- Methods define behavior  
- Types: predefined and user-defined  
- Can have parameters and return values  
- Supports overloading  

---

# 📦 Arrays in Java

## 📌 Introduction

An array in Java is a collection of elements of the same data type stored in contiguous memory locations.

- Used to store multiple values in a single variable  
- Index-based (starts from 0)  

---

## 🔹 What is an Array?

An array is a data structure that stores multiple values of the same type under a single name.

---

## 🔹 Syntax

### Declaration
dataType[] arrayName;

### Creation
arrayName = new dataType[size];

### Initialization
dataType[] arrayName = {value1, value2, value3};

---

## 🔹 Types of Arrays

### 1️⃣ Single-Dimensional Array

#### 📖 Definition
Stores elements in a single row.

#### 🧠 Syntax
dataType[] arrayName = new dataType[size];

---

### 2️⃣ Multi-Dimensional Array

#### 📖 Definition
Stores elements in tabular form (rows and columns).

#### 🧠 Syntax
dataType[][] arrayName = new dataType[row][column];

---

## 🔹 Accessing Array Elements

### 📖 Definition
Elements are accessed using index.

### 🧠 Syntax
arrayName[index];

---

## 🔹 Array Length

### 📖 Definition
Used to get the number of elements in an array.

### 🧠 Syntax
arrayName.length;

---

## ⚠️ Important Points

- Arrays are of fixed size  
- Index starts from 0  
- Stores elements of same data type  
- Memory is allocated at runtime  
- Accessing invalid index causes error  
- Arrays are objects in Java  

---

## 🔹 Advantages of Arrays

- Easy to store multiple values  
- Fast access using index  
- Improves code readability  

---

## 🔹 Disadvantages of Arrays

- Fixed size (cannot grow dynamically)  
- Can store only same type of elements  

---

## 🚀 Summary

- Arrays store multiple values of same type  
- Index-based structure  
- Fixed size  
- Types: Single and Multi-dimensional  

---

# 📦 Strings

## 📌 Introduction

A **String** in Java is a sequence of characters used to store text.

- Strings are objects in Java  
- They are immutable (cannot be changed after creation)  

---

## 🔹 What is a String?

A String represents a collection of characters enclosed in double quotes.

---

## 🔹 Syntax

### Declaration
String variableName;

### Initialization
String name = "Hello";

---

## 🔹 Ways to Create String

### 1️⃣ Using String Literal
String str = "Hello";

### 2️⃣ Using new Keyword
String str = new String("Hello");

---

## 🔹 String Immutability

- Once a String object is created, it cannot be changed  
- Any modification creates a new object  

---

## 🔹 Common String Methods

| Method             | Description                 |
|--------------------|-----------------------------|
| length()           | Returns length of string    |
| toUpperCase()      | Converts to uppercase       |
| toLowerCase()      | Converts to lowercase       |
| charAt(index)      | Returns character at index  |
| equals()           | Compares two strings        |
| equalsIgnoreCase() | Case-insensitive comparison |
| substring()        | Extracts part of string     |
| contains()         | Checks if substring exists  |

---

## 🔹 String Concatenation

Used to combine two or more strings.

### Syntax
string1 + string2

---

## 🔹 String Comparison

### Using equals()
str1.equals(str2);

### Using ==
str1 == str2;

---

## ⚠️ Important Points

- Strings are immutable  
- Stored in String pool (memory optimization)  
- `==` compares references  
- `equals()` compares values  
- String is a class in Java  

---

## 🚀 Summary

- String is used to store text  
- Immutable in nature  
- Created using literals or new keyword  
- Provides many built-in methods  

---


# 📦 StringBuffer in Java

## 📌 Introduction

**StringBuffer** is a class in Java used to create **mutable (modifiable) strings**.

- Unlike String, it can be changed after creation  
- Used when frequent modifications are required  

---

## 🔹 What is StringBuffer?

StringBuffer is a class that represents a sequence of characters that can be modified.

---

## 🔹 Syntax

### Declaration
StringBuffer variableName;

### Initialization
StringBuffer sb = new StringBuffer("Hello");

---

## 🔹 Key Features

- Mutable (can be changed)  
- Thread-safe (synchronized)  
- Slower than StringBuilder  
- Efficient for repeated modifications  

---

## 🔹 Common Methods

| Method     | Description                     |
|------------|---------------------------------|
| append()   | Adds data to the end            |
| insert()   | Inserts data at specified index |
| replace()  | Replaces characters             |
| delete()   | Deletes characters              |
| reverse()  | Reverses the string             |
| capacity() | Returns current capacity        |
| length()   | Returns length of string        |

---

## ⚠️ Important Points

- StringBuffer is mutable  
- It is synchronized (thread-safe)  
- Used when multiple threads access data  
- Better than String for heavy modifications  
- Part of `java.lang` package  

---

## 🚀 Summary

- StringBuffer is used for mutable strings  
- Supports modification without creating new objects  
- Thread-safe but slightly slower than StringBuilder  
- Useful in multi-threaded environments  