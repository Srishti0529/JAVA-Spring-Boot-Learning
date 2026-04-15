# Core Java 

This README covers the **theoretical concepts of Core Java** including OOP, Collections, Generics, Streams, Threads, and other core topics.

---

# 1. Java Overview

Java is a **high-level, object-oriented, platform-independent programming language** developed by Sun Microsystems. Java follows the principle **WORA (Write Once, Run Anywhere)** because Java code is compiled into bytecode which runs on JVM.

### Java Features

* Object-Oriented
* Platform Independent
* Secure
* Robust
* Multithreaded
* Distributed
* Portable
* High Performance (via JIT)

---

# 2. JVM, JRE, JDK

### JVM (Java Virtual Machine)

JVM is responsible for executing Java bytecode. It provides platform independence.

### JRE (Java Runtime Environment)

JRE = JVM + Libraries required to run Java applications.

### JDK (Java Development Kit)

JDK = JRE + Development tools (compiler, debugger, etc.)

Hierarchy:

```
JDK
 └── JRE
      └── JVM
```

---

# 3. OOP Concepts

## Encapsulation

Encapsulation is wrapping data and methods into a single unit. Data is hidden using private access modifiers and accessed using getters/setters.

## Inheritance

Inheritance allows one class to acquire properties and behavior of another class. It promotes code reuse.

Types:

* Single
* Multilevel
* Hierarchical

(Java does not support multiple inheritance with classes)

---

## Polymorphism

### Compile-time polymorphism

Method overloading — same method name with different parameters.

### Runtime polymorphism

Method overriding — subclass provides implementation of parent class method.

---

## Abstraction

Abstraction hides implementation details and shows only functionality.

Ways to achieve abstraction:

* Abstract class
* Interface

---

# 4. Abstract Class vs Interface

Abstract Class:

* Can have abstract and non-abstract methods
* Can have constructors
* Supports instance variables
* Uses `extends`

Interface:

* Only abstract methods (before Java 8)
* Methods are public by default
* Variables are public static final
* Uses `implements`
* Supports multiple inheritance

---

# 5. Access Modifiers

| Modifier  | Same Class | Same Package | Subclass | Other Package |
| --------- | ---------- | ------------ | -------- | ------------- |
| private   | YES        | NO           | NO       | NO            |
| default   | YES        | YES          | NO       | NO            |
| protected | YES        | YES          | YES      | NO            |
| public    | YES        | YES          | YES      | YES           |

---

# 6. Collections Framework

Collections framework provides classes and interfaces to store and manipulate data.

Main Interfaces:

* Collection
* List
* Set
* Queue
* Map

---

# 7. List Interface

List allows:

* Duplicate elements
* Insertion order maintained
* Index based access

Implementations:

### ArrayList

* Dynamic array
* Fast retrieval
* Slow insertion/deletion
* Not synchronized

### LinkedList

* Doubly linked list
* Fast insertion/deletion
* Slow retrieval
* Can be used as Queue

### Vector

* Same as ArrayList
* Synchronized
* Thread-safe
* Slower than ArrayList

---

# 8. Set Interface

Set does not allow duplicates.

### HashSet

* No duplicates
* No order
* Allows one null
* Uses Hashing

### LinkedHashSet

* Maintains insertion order
* No duplicates

### TreeSet

* Sorted order
* No null values
* Uses Red-Black tree
* Slower than HashSet

---

# 9. Map Interface

Map stores data in **key-value pairs**

### HashMap

* No duplicate keys
* Allows one null key
* Not synchronized
* No order

### LinkedHashMap

* Maintains insertion order
* Faster iteration

### TreeMap

* Sorted by keys
* No null key
* Uses Red-Black Tree

---

# 10. Queue Interface

Queue follows FIFO.

Implementations:

### PriorityQueue

* Elements sorted by priority
* No null values
* Not thread-safe

### Deque

Double ended queue (insert/remove both ends)

Implementations:

* ArrayDeque
* LinkedList

---

# 11. Comparator vs Comparable

Comparable:

* Used for natural sorting
* Implemented inside class
* compareTo() method

Comparator:

* Used for custom sorting
* Separate class
* compare() method

---

# 12. Generics

Generics allow type safety.

Example:

```
List<String>
List<Integer>
```

Advantages:

* Compile time checking
* No type casting
* Reusable code

---

# 13. Wrapper Classes

Convert primitive into object.

| Primitive | Wrapper   |
| --------- | --------- |
| int       | Integer   |
| char      | Character |
| double    | Double    |
| boolean   | Boolean   |

Autoboxing:
Primitive → Object

Unboxing:
Object → Primitive

---

# 14. Exception Handling

Exception is runtime error.

Types:

* Checked Exception
* Unchecked Exception

Keywords:

* try
* catch
* finally
* throw
* throws

---

# 15. Multithreading

Multithreading allows multiple tasks simultaneously.

Ways to create thread:

* Extend Thread class
* Implement Runnable interface

Thread Lifecycle:

* New
* Runnable
* Running
* Waiting
* Dead

---

# 16. Synchronization

Used to avoid thread conflict.

Types:

* Synchronized method
* Synchronized block
* Static synchronization

---

# 17. Stream API

Stream is used for processing collections.

Operations:

Intermediate:

* filter
* map
* sorted

Terminal:

* forEach
* collect
* reduce

Advantages:

* Less code
* Functional style
* Parallel processing

---

# 18. Lambda Expression

Lambda is anonymous function.

Used with functional interfaces.

Example:

```
(a,b) -> a+b
```

---

# 19. Functional Interface

Interface with one abstract method.

Examples:

* Runnable
* Comparator
* Callable

Annotation:

```
@FunctionalInterface
```

---

# 20. Java Memory

Memory Areas:

* Heap
* Stack
* Method Area
* PC Register

Objects → Heap
Methods → Stack

---

# 21. Garbage Collection

Garbage collector removes unused objects.

Types:

* Serial GC
* Parallel GC
* G1 GC

Cannot force GC but can request using:

```
System.gc()
```

---

# 22. String

String is immutable.

Types:

* String
* StringBuilder
* StringBuffer

String → immutable
StringBuilder → fast, not thread-safe
StringBuffer → thread-safe

---

# 23. Final Keyword

final variable → constant
final method → cannot override
final class → cannot inherit

---

# 24. Static Keyword

static variable → shared
static method → class level
static block → executed once

---

# 25. Java 8 Features

* Lambda expression
* Stream API
* Functional interface
* Default methods
* Method reference
* Optional class

---

# Summary

Core Java includes:

* OOP concepts
* Access modifiers
* Collections framework
* Generics
* Exception handling
* Multithreading
* Streams & Lambda
* Memory management
* String handling
* Java 8 features

These concepts form the foundation for **Advanced Java, Spring, and enterprise development**.
---