# JAVA Basics

# 📦 Variables & Data Types in Java

## 📌 Introduction

In Java, a variable is a container used to store data values in memory.

Each variable has:
- a data type → type of data it can store  
- a name → identifier  
- a value → actual data  

---

## 🧠 Syntax

dataType variableName = value;

### Example:

int age = 21;
String name = "Srishti";
double marks = 85.5;

---

## 🔢 Types of Variables in Java

### 1️⃣ Local Variables

- Declared inside methods or blocks  
- Scope is limited to that block  
- Must be initialized before use  

class Demo {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
    }
}

---

### 2️⃣ Instance Variables

- Declared inside class but outside methods  
- Belong to object  
- Each object has its own copy  

class Student {
    int marks;
}

---

### 3️⃣ Static Variables

- Declared using static keyword  
- Shared among all objects  
- Created only once  

class Student {
    static String college = "ABC College";
}

---

## 🔤 Data Types in Java

### ✅ Primitive Data Types

Primitive data types are the basic built-in data types in Java that store simple values directly in memory.
🔹 They are not objects
🔹 They store actual values
🔹 They are faster and use less memory

- byte → byte b = 10;
- short → short s = 100;
- int → int a = 10;
- long → long l = 1000L;
- float → float f = 10.5f;
- double → double d = 20.99;
- char → char c = 'A';
- boolean → boolean b = true;

Example:
int a = 10;
double b = 20.5;
char c = 'A';
boolean flag = true;

---

### ✅ Non-Primitive Data Types

Non-primitive data types are more complex data types that store references (addresses) of objects instead of actual values.
🔹 They are objects
🔹 They can store multiple values or complex data
🔹 They are created by the programmer or Java
- String
- Arrays
- Classes
- Interfaces

Example:
String name = "Srishti";
int[] arr = {1, 2, 3};

---

## ⚡ Rules for Naming Variables

- Must start with letter, _ or $
- Cannot start with number (❌ 1name)
- Cannot use keywords (❌ int class = 10;)
- Case-sensitive (age ≠ Age)
- Use meaningful names

---

## 🚀 Summary

- Variables store data  
- Data types define the type of data  
- Three types → Local, Instance, Static  
- Java is strongly typed  
- Naming rules are important  

---

# 📦 Type Casting & Type Conversion in Java

## 📌 Introduction

Type Casting and Type Conversion are used to convert one data type into another in Java.

- **Type Conversion** → Automatic conversion (by Java)
- **Type Casting** → Manual conversion (by programmer)

---

## 🔹 What is Type Conversion?

Type Conversion is the **automatic conversion of a smaller data type into a larger data type**.

- Also called **Widening Conversion**
- Done automatically by Java
- No data loss

### 🧠 Example

int x = 10;
double y = x;  // int → double

---

## 🔹 What is Type Casting?

Type Casting is the **manual conversion of a larger data type into a smaller data type**.

- Also called **Narrowing Conversion**
- Done by programmer
- May cause data loss

### 🧠 Example

double d = 10.5;
int x = (int) d;  // double → int

---
## ⚠️ Important Points

- Boolean cannot be converted into other types

---

## 🚀 Summary

- Type Conversion → Automatic (small → large)
- Type Casting → Manual (large → small)
- Widening → Safe
- Narrowing → Risk of data loss

---

# 📦 Operators in Java

## 📌 Introduction

Operators in Java are symbols used to perform operations on variables and values.

Example:
int a = 10 + 5;

Here, `+` is an operator.

---

## 🔹 Types of Operators in Java

### 1️⃣ Arithmetic Operators

Used to perform mathematical operations.

| Operator | Description    | Example |
|----------|----------------|---------|
| +        | Addition       | a + b   |
| -        | Subtraction    | a - b   |
| *        | Multiplication | a * b   |
| /        | Division       | a / b   |
| %        | Modulus        | a % b   |
 
#### Example:

int a = 10, b = 5;
System.out.println(a + b); // 15

---

### 2️⃣ Relational Operators

Used to compare two values.

| Operator | Description              |
|----------|--------------------------|
| ==       | Equal to                 |
| !=       | Not equal to             |
| >        | Greater than             |
| <        | Less than                |
| >=       | Greater than or equal to |
| <=       | Less than or equal to    |
 
#### Example:

int a = 10, b = 5;
System.out.println(a > b); // true

---

### 3️⃣ Logical Operators

Used to perform logical operations.

| Operator | Description |
|----------|-------------|
| &&       | AND         |
| ||       | OR          |
| !        | NOT         |

#### Example:

boolean x = true, y = false;
System.out.println(x && y); // false

---

### 4️⃣ Assignment Operators

Used to assign values.

| Operator | Example |
|----------|---------|
| =        | a = 10  |
| +=       | a += 5  |
| -=       | a -= 5  |
| *=       | a *= 5  |
| /=       | a /= 5  |
| %=       | a %= 5  |

#### Example:

int a = 10;
a += 5; // a = 15

---

### 5️⃣ Unary Operators

Operate on a single operand.

| Operator | Description |
|----------|-------------|
| +        | Positive    |
| -        | Negative    |
| ++       | Increment   |
| --       | Decrement   |

#### Example:

int a = 5;
a++; // 6

---

### 6️⃣ Bitwise Operators

Used for bit-level operations.

| Operator | Description |
|----------|-------------|
| &        | AND         |
| |        | OR          |
| ^        | XOR         |
| ~        | NOT         |
| <<       | Left Shift  |
| >>       | Right Shift |

---

### 7️⃣ Ternary Operator

Short form of if-else.

Syntax:
condition ? value1 : value2;

#### Example:

int a = 10, b = 20;
int max = (a > b) ? a : b;

---

## ⚠️ Important Points

- Operators follow precedence (BODMAS rule)
- Use parentheses () to control order
- Logical operators return boolean values

---

## 🚀 Summary

- Operators perform operations on variables
- Types include Arithmetic, Relational, Logical, etc.
- Ternary operator is shortcut for if-else
- Precedence rules decide execution order

---

# 📦 Conditional Statements in Java

## 📌 Introduction

Conditional statements in Java are used to make decisions based on conditions.

They allow the program to execute different blocks of code depending on whether a condition is true or false.

---

## 🔹 Types of Conditional Statements

### 1️⃣ if Statement

Executes a block of code if the condition is true.

#### Syntax:
if (condition) {
    // code
}

### 2️⃣ if-else Statement

Executes one block if condition is true, otherwise another block.

#### Syntax:
if (condition) {
    // code if true
} else {
    // code if false
}

### 3️⃣ if-else if-else Ladder

Used to check multiple conditions.

#### Syntax:
if (condition1) {
    // code
} else if (condition2) {
    // code
} else {
    // code
}

---

### 4️⃣ Nested if

An if statement inside another if.

---

### 5️⃣ switch Statement

Used to select one option from multiple choices.

#### Syntax:
switch (expression) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code
}

---

## ⚠️ Important Points

- Condition must return boolean (true/false)
- Use `break` in switch to avoid fall-through
- `else` is optional
- Multiple `else if` can be used

---

## 🚀 Summary

- Used for decision making
- Types: if, if-else, else-if, nested if, switch
- Conditions must return boolean
- switch is used for multiple choices

---

# 📦 Loops in Java

## 📌 Introduction

Loops in Java are used to execute a block of code repeatedly until a specified condition is satisfied.

They help in reducing code repetition and improve efficiency.

---

## 🔹 Types of Loops in Java

### 1️⃣ for Loop

#### 📖 Definition
The **for loop** is used when the number of iterations is known in advance.

#### 🧠 Syntax
for (initialization; condition; update) {
    // code
}

---

### 2️⃣ while Loop

#### 📖 Definition
The **while loop** executes a block of code as long as the condition is true.

#### 🧠 Syntax
while (condition) {
    // code
}

---

### 3️⃣ do-while Loop

#### 📖 Definition
The **do-while loop** executes the code at least once, then checks the condition.

#### 🧠 Syntax
do {
    // code
} while (condition);

---

### 4️⃣ for-each Loop (Enhanced for Loop)

#### 📖 Definition
The **for-each loop** is used to iterate over arrays or collections.

#### 🧠 Syntax
for (dataType variable : array) {
    // code
}

---

## 🔹 Loop Control Statements

### 🔸 break

#### 📖 Definition
Terminates the loop immediately and transfers control outside the loop.

#### 🧠 Syntax
break;

---

### 🔸 continue

#### 📖 Definition
Skips the current iteration and moves to the next iteration of the loop.

#### 🧠 Syntax
continue;

---

## ⚠️ Important Points

- Loop condition must return a boolean value  
- Ensure the condition becomes false to avoid infinite loops  
- do-while loop executes at least once  
- for loop is best when iterations are known  
- while loop is best when iterations are unknown  
- break stops the loop completely  
- continue skips only the current iteration  

---

## 🚀 Summary

- Loops are used for repetition  
- Types: for, while, do-while, for-each  
- Control statements: break and continue  
- Proper condition handling is important  

---