# ⚠️ Exception Handling in Java

## 📌 Introduction

**Exception Handling** in Java is used to handle **runtime errors** so that the program does not terminate abruptly.

It helps in:

* Maintaining normal program flow
* Handling runtime errors
* Improving program reliability

---

# 🔹 What is Exception?

### 📖 Definition

An **Exception** is an event that **disrupts the normal flow** of the program during execution.

Examples:

* Divide by zero
* Null pointer
* Array index out of bound
* File not found

---

# 🔹 Types of Exceptions

### 1. Checked Exception

* Checked at compile time
* Must be handled
* Example: IOException, SQLException

### 2. Unchecked Exception

* Occurs at runtime
* Not checked at compile time
* Example: ArithmeticException, NullPointerException

---

# 🔹 Exception Handling Keywords

| Keyword | Description              |
| ------- | ------------------------ |
| try     | used to write risky code |
| catch   | handles exception        |
| finally | always executes          |
| throw   | used to throw exception  |
| throws  | declares exception       |

---

# 🔹 try-catch Syntax

```java
try {
    // risky code
}
catch(Exception e) {
    // handling code
}
```

---

# 🔹 try-catch-finally Syntax

```java
try {
    // risky code
}
catch(Exception e) {
    // handling code
}
finally {
    // always executes
}
```

---

# 🔹 Multiple Catch Syntax

```java
try {

}
catch(ArithmeticException e) {

}
catch(NullPointerException e) {

}
catch(Exception e) {

}
```

---

# 🔹 throw Syntax

```java
throw new Exception("Error message");
```

---

# 🔹 throws Syntax

```java
void show() throws Exception {

}
```

---

# 🔹 Key Points

✔ Exception handling prevents program crash
✔ try block contains risky code
✔ catch block handles exception
✔ finally always executes
✔ throw used to create exception
✔ throws used in method declaration

---

# 🚀 Summary

* Exception = runtime error
* Handled using try-catch
* finally always runs
* Improves program stability
* Supports multiple catch blocks

---

# 🏷️ Annotations in Java

## 📌 Introduction

**Annotations** in Java are used to provide **metadata** (information about code).

Annotations **do not change program logic**, but they help:

* Compiler
* JVM
* Frameworks (Spring, Hibernate)
* Tools

---

# 🔹 What is Annotation?

### 📖 Definition

Annotation is a **tag** added to Java code to give **extra information**.

Annotations start with **@ symbol**

Example:

```
@Override
@Deprecated
@SuppressWarnings
```

---

# 🔹 Common Built-in Annotations

### 1. @Override

Used when overriding parent class method.

```java
@Override
void show() {

}
```

---

### 2. @Deprecated

Marks method as old / not recommended.

```java
@Deprecated
void oldMethod() {

}
```

---

### 3. @SuppressWarnings

Suppress compiler warnings.

```java
@SuppressWarnings("unchecked")
```

---

# 🔹 Annotation Syntax

```java
@interface AnnotationName {

}
```

---

# 🔹 Custom Annotation Syntax

```java
@interface MyAnnotation {

    String value();
    int number();
}
```

---

# 🔹 Using Annotation

```java
@MyAnnotation(value="Java", number=10)
class Test {

}
```

---

# 🔹 Types of Annotations

### 1. Marker Annotation

No values

```java
@interface Marker {

}
```

---

### 2. Single Value Annotation

```java
@interface Single {
    String value();
}
```

Usage:

```java
@Single("Java")
```

---

### 3. Multi Value Annotation

```java
@interface Multi {
    String name();
    int age();
}
```

Usage:

```java
@Multi(name="Java", age=20)
```

---

# 🔹 Where Annotations Can Be Used

✔ Class
✔ Method
✔ Variable
✔ Constructor
✔ Interface

---

# 🔹 Key Points

✔ Annotation starts with @
✔ Used to provide metadata
✔ Does not change program logic
✔ Can create custom annotations
✔ Used by compiler and frameworks

---

# 🚀 Summary

* Annotation = metadata
* Starts with @ symbol
* Built-in and custom annotations
* Improves readability
* Used in modern Java frameworks

---

# ⌨️ User Input in Java

## 📌 Introduction

User input in Java is used to **take data from the user at runtime**.

Java provides multiple ways to take input:

* Scanner class (most commonly used)
* BufferedReader class
* Command line arguments

---

# 🔹 Scanner Class

The **Scanner class** is used to take input from keyboard.

It is available in:

```java
java.util package
```

So we must import it.

---

# 🔹 Import Scanner

```java id="6r1tvq"
import java.util.Scanner;
```

---

# 🔹 Create Scanner Object

```java id="1y5rkj"
Scanner sc = new Scanner(System.in);
```

---

# 🔹 Methods of Scanner

| Method        | Description         |
| ------------- | ------------------- |
| nextInt()     | read integer        |
| nextDouble()  | read decimal number |
| next()        | read single word    |
| nextLine()    | read full line      |
| nextBoolean() | read boolean        |
| nextLong()    | read long value     |

---

# 🔹 Syntax to Take Input

```java id="jtv0e9"
Scanner sc = new Scanner(System.in);

int a = sc.nextInt();
String name = sc.next();
```

---

# 🔹 Taking Different Types Input

```java id="0g0qqd"
int id = sc.nextInt();
String name = sc.next();
double salary = sc.nextDouble();
```

---

# 🔹 Important Note

After using scanner, close it:

```java id="nm1r6o"
sc.close();
```

---

# 🔹 Key Points

✔ Scanner class used for user input
✔ Import java.util.Scanner
✔ Use System.in for keyboard input
✔ Different methods for different data types
✔ Always close scanner

---

# 🚀 Summary

* User input taken using Scanner
* Most commonly used method
* Supports multiple data types
* Simple and easy to use

---

# 🧵 Thread in Java

## 📌 Introduction

A **Thread** in Java is a lightweight process used for **multitasking**.

Threads allow a program to **execute multiple tasks simultaneously**.

This is called **Multithreading**.

---

# 🔹 What is Thread?

### 📖 Definition

A **Thread** is a separate path of execution inside a program.

* Multiple threads run concurrently
* Improves performance
* Saves CPU time
* Used for background tasks

---

# 🔹 Ways to Create Thread

Java provides **2 ways**:

1. By extending **Thread class**
2. By implementing **Runnable interface**

---

# 🔹 Method 1: Extending Thread Class

### Syntax

```java
class MyThread extends Thread {

    public void run() {

    }
}
```

Start thread:

```java
MyThread t = new MyThread();
t.start();
```

---

# 🔹 Method 2: Implementing Runnable Interface

### Syntax

```java
class MyThread implements Runnable {

    public void run() {

    }
}
```

Start thread:

```java
MyThread obj = new MyThread();
Thread t = new Thread(obj);
t.start();
```

---

# 🔹 Thread Life Cycle

1. New
2. Runnable
3. Running
4. Waiting / Blocked
5. Terminated

---

# 🔹 Important Thread Methods

| Method    | Description     |
| --------- | --------------- |
| start()   | starts thread   |
| run()     | thread task     |
| sleep()   | pause thread    |
| join()    | wait for thread |
| getName() | get thread name |
| setName() | set thread name |

---

# 🔹 sleep() Syntax

```java
Thread.sleep(1000);
```

(1000 ms = 1 second)

---

# 🔹 Thread Example Structure

```java
class MyThread extends Thread {

    public void run() {
        // code to execute
    }
}

public class Test {

    public static void main(String[] args) {

        MyThread t = new MyThread();
        t.start();
    }
}
```

---

# 🔹 Key Points

✔ Thread used for multitasking
✔ start() method starts thread
✔ run() contains thread logic
✔ sleep() pauses thread
✔ Multiple threads run concurrently
✔ Improves performance

---

# 🚀 Summary

* Thread = lightweight process
* Used for multithreading
* Two ways to create thread
* start() begins execution
* run() contains logic
* Used in real-time applications

---

# 🔐 Synchronization in Java (Counter Example)

## 📌 Introduction

**Synchronization** is used in Java to control **multiple threads accessing shared data**.

When multiple threads access the same variable, **race condition** may occur.
To avoid this, we use **synchronized keyword**.

---

# 🔹 What is Synchronization?

### 📖 Definition

Synchronization is a process that allows **only one thread at a time** to access shared resource.

* Prevents data inconsistency
* Avoids race condition
* Used in multithreading
* Applied using `synchronized` keyword

---

# 🔹 Problem Without Synchronization

Two threads increment same counter:

Thread 1 → count++
Thread 2 → count++

Both may read same value → incorrect result.

Expected: 2000
Actual: Random value (like 1678, 1923 etc.)

---

# 🔹 Solution: synchronized Keyword

Use synchronized method so **only one thread executes at a time**.

---

# 🔹 Counter Class Syntax

```java id="nb1zb6"
class Counter {

    int count = 0;

    synchronized void increment() {
        count++;
    }
}
```

---

# 🔹 Thread Using Counter

Two threads call `increment()` inside loop.

```java id="o2z4lm"
for(int i = 0; i < 1000; i++) {
    counter.increment();
}
```

---

# 🔹 join() Method

`join()` is used to **wait for thread to finish**

```java id="6ltbwy"
t1.join();
t2.join();
```

Main thread waits until both threads complete.

---

# 🔹 Flow

1. Counter object created
2. Two threads share same object
3. Both run loop 1000 times
4. increment() is synchronized
5. One thread executes at a time
6. Final count printed

---

# 🔹 Expected Output

```id="jqpb87"
Final Count : 2000
```

---

# 🔹 Key Points

✔ synchronized prevents race condition
✔ Only one thread enters method
✔ Shared object required
✔ join() waits for threads
✔ Used in multithreading

---

# 🚀 Summary

* Multiple threads share counter
* increment() marked synchronized
* Threads run loop
* Final value correct
* Synchronization ensures data safety
---

# 📚 Collection Framework in Java

## 📌 Definition

The **Collection Framework** in Java is a set of **classes and interfaces** used to **store and manipulate a group of objects dynamically**.

It is present in:

```java
java.util package
```

Collections provide:

* Dynamic size
* Built-in methods
* Easy data handling

---

# 🔹 Collection Hierarchy

```
                 Iterable
                     |
                 Collection
          ┌──────────┼──────────┐
          |          |          |
         List        Set       Queue
                                  |
                                 Deque
```

### Map (Separate Hierarchy)

```
Map
 ├── HashMap
 ├── LinkedHashMap
 ├── TreeMap
 └── Hashtable
```

---

# 🔹 List Implementations

* ArrayList
* LinkedList
* Vector

---

# 🔹 Set Implementations

* HashSet
* LinkedHashSet
* TreeSet

---

# 🔹 Queue Implementations

* PriorityQueue
* ArrayDeque

---

# 🔹 Key Points

✔ List → ordered, duplicates allowed
✔ Set → no duplicates
✔ Queue → FIFO
✔ Map → key-value pairs

---

# 🚀 Summary

* Collection framework stores group of objects
* Located in **java.util** package
* Main interfaces → List, Set, Queue
* Map is separate hierarchy
* List allows duplicates
* Set does not allow duplicates
* Queue follows FIFO order
* Used for dynamic data handling

---

# 📋 List Interface in Java

## 📌 Definition

**List** is an interface in Java Collection Framework used to **store ordered collection of elements**.

It allows:

* Duplicate values
* Insertion order maintained
* Index-based access
* Dynamic size

List is present in:

```java
java.util package
```

---

# 🔹 List Hierarchy

```
Iterable
   |
Collection
   |
   List
  ├── ArrayList
  ├── LinkedList
  └── Vector
```

---

# 🔹 Main Implementations

### ArrayList

* Dynamic array
* Fast access
* Slow insertion

### LinkedList

* Doubly linked list
* Fast insertion
* Slow access

### Vector

* Thread safe
* Slow performance

---

# 🔹 List Syntax

```java
List<Integer> list = new ArrayList<>();
```

---

# 🔹 Common List Methods

| Method     | Description    |
| ---------- | -------------- |
| add()      | add element    |
| get()      | get element    |
| set()      | update element |
| remove()   | remove element |
| size()     | list size      |
| contains() | check element  |

---

# 🔹 Key Points

✔ List maintains insertion order
✔ Allows duplicate elements
✔ Index based access
✔ Dynamic size
✔ Part of Collection framework

---

# 🚀 Summary

* List stores ordered elements
* Duplicates allowed
* Index based access
* ArrayList, LinkedList, Vector implementations
* Used for dynamic collections

--- 

# 🔗 LinkedList in Java

## 📌 Definition

**LinkedList** is a class in Java Collection Framework that **stores elements using doubly linked list structure**.

Each element is called a **node** and contains:

* Data
* Address of next node
* Address of previous node

LinkedList is present in:

```java
java.util package
```

---

# 🔹 LinkedList Hierarchy

```
Iterable
   |
Collection
   |
   List
    |
LinkedList
```

---

# 🔹 Features of LinkedList

* Maintains insertion order
* Allows duplicate elements
* Dynamic in size
* Fast insertion and deletion
* Slow random access
* Implements List and Deque

---

# 🔹 LinkedList Syntax

```java
LinkedList<Type> list = new LinkedList<>();
```

---

# 🔹 Example Syntax

```java
LinkedList<Integer> list = new LinkedList<>();
```

---

# 🔹 Common LinkedList Methods

| Method        | Description      |
| ------------- | ---------------- |
| add()         | add element      |
| addFirst()    | add at beginning |
| addLast()     | add at end       |
| remove()      | remove element   |
| removeFirst() | remove first     |
| removeLast()  | remove last      |
| get()         | get element      |
| size()        | list size        |

---

# 🔹 Key Points

✔ LinkedList uses doubly linked list
✔ Maintains insertion order
✔ Allows duplicates
✔ Fast insertion and deletion
✔ Slow accessing by index
✔ Part of List interface

---

# 🚀 Summary

* LinkedList stores elements as nodes
* Dynamic in size
* Doubly linked list structure
* Allows duplicate values
* Faster insertion than ArrayList
* Used when frequent modifications required

---

# 📦 Vector in Java

## 📌 Definition

**Vector** is a class in Java Collection Framework that implements **List interface** and stores **dynamic array of elements**.

Vector is **synchronized**, which means it is **thread-safe**.

It is present in:

```java
java.util package
```

---

# 🔹 Vector Hierarchy

```
Iterable
   |
Collection
   |
   List
    |
   Vector
```

---

# 🔹 Features of Vector

* Maintains insertion order
* Allows duplicate elements
* Dynamic in size
* Thread-safe (synchronized)
* Slower than ArrayList
* Legacy class

---

# 🔹 Vector Syntax

```java
Vector<Type> v = new Vector<>();
```

---

# 🔹 Example Syntax

```java
Vector<Integer> v = new Vector<>();
```

---

# 🔹 Common Vector Methods

| Method         | Description        |
| -------------- | ------------------ |
| add()          | add element        |
| addElement()   | add element        |
| get()          | get element        |
| remove()       | remove element     |
| size()         | number of elements |
| capacity()     | current capacity   |
| firstElement() | first value        |
| lastElement()  | last value         |

---

# 🔹 Key Points

✔ Vector implements List interface
✔ Maintains insertion order
✔ Allows duplicates
✔ Thread-safe (synchronized)
✔ Slower than ArrayList
✔ Legacy collection class

---

# 🚀 Summary

* Vector is dynamic array
* Thread-safe collection
* Allows duplicate elements
* Maintains insertion order
* Slower but synchronized
* Part of List interface

---

# 🧩 Set Interface in Java

## 📌 Definition

**Set** is an interface in Java Collection Framework used to **store unique elements**.

It **does not allow duplicate values** and **does not maintain insertion order** (except some implementations).

Set is present in:

```java
java.util package
```

---

# 🔹 Set Hierarchy

```
Iterable
   |
Collection
   |
   Set
  ├── HashSet
  ├── LinkedHashSet
  └── TreeSet
```

---

# 🔹 Features of Set

* No duplicate elements
* Unordered collection
* Dynamic size
* Stores objects only
* Allows one null value (HashSet)

---

# 🔹 Set Syntax

```java
Set<Type> set = new HashSet<>();
```

---

# 🔹 Set Implementations

### HashSet

* Unordered
* Fast performance
* Allows one null

### LinkedHashSet

* Maintains insertion order
* Slower than HashSet

### TreeSet

* Sorted order
* No null allowed
* Slower than HashSet

---

# 🔹 Common Set Methods

| Method     | Description        |
| ---------- | ------------------ |
| add()      | add element        |
| remove()   | remove element     |
| contains() | check element      |
| size()     | number of elements |
| clear()    | remove all         |
| isEmpty()  | check empty        |

---

# 🔹 Key Points

✔ Set does not allow duplicates
✔ Unordered collection
✔ Dynamic size
✔ HashSet, LinkedHashSet, TreeSet implementations
✔ Part of Collection framework

---

# 🚀 Summary

* Set stores unique elements
* Duplicates not allowed
* Unordered collection
* HashSet fastest
* TreeSet sorted
* Used when duplicates not needed

---

# #️⃣ HashSet in Java

## 📌 Definition

**HashSet** is a class in Java Collection Framework that implements **Set interface** and stores **unique elements**.

It **does not allow duplicates** and **does not maintain insertion order**.

HashSet is present in:

```java
java.util package
```

---

# 🔹 HashSet Hierarchy

```
Iterable
   |
Collection
   |
   Set
    |
  HashSet
```

---

# 🔹 Features of HashSet

* No duplicate elements
* Unordered collection
* Allows one null value
* Fast performance
* Uses hashing internally
* Not synchronized

---

# 🔹 HashSet Syntax

```java
HashSet<Type> set = new HashSet<>();
```

---

# 🔹 Example Syntax

```java
HashSet<Integer> set = new HashSet<>();
```

---

# 🔹 Common HashSet Methods

| Method     | Description        |
| ---------- | ------------------ |
| add()      | add element        |
| remove()   | remove element     |
| contains() | check element      |
| size()     | number of elements |
| clear()    | remove all         |
| isEmpty()  | check empty        |

---

# 🔹 Key Points

✔ HashSet implements Set interface
✔ Does not allow duplicates
✔ Does not maintain order
✔ Allows one null value
✔ Fastest Set implementation

---

# 🚀 Summary

* HashSet stores unique elements
* No duplicate values allowed
* Unordered collection
* Allows one null value
* Fast performance using hashing
* Part of Set interface

---

# 🌳 TreeSet in Java

## 📌 Definition

**TreeSet** is a class in Java Collection Framework that implements **Set interface** and stores **unique elements in sorted order**.

It **does not allow duplicates** and **automatically sorts elements**.

TreeSet is present in:

```java id="0e7m9q"
java.util package
```

---

# 🔹 TreeSet Hierarchy

```id="7q42p6"
Iterable
   |
Collection
   |
   Set
    |
  TreeSet
```

---

# 🔹 Features of TreeSet

* No duplicate elements
* Sorted order (ascending)
* Does not allow null values
* Slower than HashSet
* Uses Tree structure (Red-Black Tree)
* Not synchronized

---

# 🔹 TreeSet Syntax

```java id="4pqy3o"
TreeSet<Type> set = new TreeSet<>();
```

---

# 🔹 Example Syntax

```java id="nbpxc8"
TreeSet<Integer> set = new TreeSet<>();
```

---

# 🔹 Common TreeSet Methods

| Method   | Description        |
| -------- | ------------------ |
| add()    | add element        |
| remove() | remove element     |
| first()  | first element      |
| last()   | last element       |
| higher() | next greater       |
| lower()  | next smaller       |
| size()   | number of elements |

---

# 🔹 Key Points

✔ TreeSet implements Set interface
✔ Does not allow duplicates
✔ Stores elements in sorted order
✔ Null not allowed
✔ Slower than HashSet
✔ Uses tree structure

---

# 🚀 Summary

* TreeSet stores unique elements
* Automatically sorted
* No duplicates allowed
* Null values not allowed
* Slower but sorted collection
* Part of Set interface

---

# 🔗 LinkedHashSet in Java

## 📌 Definition

**LinkedHashSet** is a class in Java Collection Framework that implements **Set interface** and stores **unique elements while maintaining insertion order**.

It **does not allow duplicates** and **preserves order of insertion**.

LinkedHashSet is present in:

```java
java.util package
```

---

# 🔹 LinkedHashSet Hierarchy

```
Iterable
   |
Collection
   |
   Set
    |
LinkedHashSet
```

---

# 🔹 Features of LinkedHashSet

* No duplicate elements
* Maintains insertion order
* Allows one null value
* Slower than HashSet
* Faster than TreeSet
* Uses Linked list + Hash table

---

# 🔹 LinkedHashSet Syntax

```java
LinkedHashSet<Type> set = new LinkedHashSet<>();
```

---

# 🔹 Example Syntax

```java
LinkedHashSet<String> set = new LinkedHashSet<>();
```

---

# 🔹 Common LinkedHashSet Methods

| Method     | Description        |
| ---------- | ------------------ |
| add()      | add element        |
| remove()   | remove element     |
| contains() | check element      |
| size()     | number of elements |
| clear()    | remove all         |
| isEmpty()  | check empty        |

---

# 🔹 Key Points

✔ LinkedHashSet implements Set interface
✔ Does not allow duplicates
✔ Maintains insertion order
✔ Allows one null value
✔ Slower than HashSet but ordered

---

# 🚀 Summary

* LinkedHashSet stores unique elements
* Maintains insertion order
* No duplicates allowed
* Allows one null value
* Combination of HashSet + LinkedList
* Part of Set interface

---

# 🗺️ Map in Java

## 📌 Definition

**Map** is an interface in Java Collection Framework used to **store data in key-value pairs**.

* Each key maps to one value
* Keys must be unique
* Values can be duplicate
* Not part of Collection interface

Map is present in:

```java id="s0o0c3"
java.util package
```

---

# 🔹 Map Hierarchy

```id="p0zntn"
Map
 ├── HashMap
 ├── LinkedHashMap
 ├── TreeMap
 └── Hashtable
```

---

# 🔹 Features of Map

* Stores key-value pairs
* Keys are unique
* Values can duplicate
* Dynamic in size
* Faster searching using key

---

# 🔹 Map Syntax

```java id="0i2xfl"
Map<Key, Value> map = new HashMap<>();
```

---

# 🔹 Example Syntax

```java id="g33gn8"
Map<Integer, String> map = new HashMap<>();
```

---

# 🔹 Common Map Methods

| Method          | Description         |
| --------------- | ------------------- |
| put()           | add key-value       |
| get()           | get value using key |
| remove()        | remove entry        |
| containsKey()   | check key           |
| containsValue() | check value         |
| size()          | number of elements  |
| clear()         | remove all          |

---

# 🔹 Key Points

✔ Map stores key-value pairs
✔ Keys must be unique
✔ Values can duplicate
✔ Not part of Collection interface
✔ HashMap most used implementation

---

# 🚀 Summary

* Map stores data in pairs
* Key must be unique
* Value can duplicate
* HashMap, TreeMap, LinkedHashMap
* Used for fast lookup using key

---

# 📥 Queue in Java

## 📌 Definition

**Queue** is an interface in Java Collection Framework used to **store elements in FIFO order**.

FIFO means **First In First Out**.

Elements are **added at rear** and **removed from front**.

Queue is present in:

```java
java.util package
```

---

# 🔹 Queue Hierarchy

```
Iterable
   |
Collection
   |
   Queue
   ├── PriorityQueue
   ├── ArrayDeque
   └── LinkedList
```

---

# 🔹 Features of Queue

* Follows FIFO order
* Dynamic in size
* Allows duplicate elements
* Stores objects only
* Used in scheduling and buffering

---

# 🔹 Queue Syntax

```java
Queue<Type> q = new PriorityQueue<>();
```

---

# 🔹 Queue Methods

| Method    | Description        |
| --------- | ------------------ |
| add()     | insert element     |
| offer()   | insert element     |
| remove()  | remove element     |
| poll()    | remove head        |
| peek()    | view first element |
| element() | view head          |
| size()    | number of elements |

---

# 🔹 Queue Implementations

### PriorityQueue

* Sorted order
* No null allowed

### ArrayDeque

* Double ended queue
* Fast performance

### LinkedList

* FIFO queue
* Doubly linked list

---

# 🔹 Key Points

✔ Queue follows FIFO
✔ Insert at rear, remove from front
✔ Allows duplicates
✔ PriorityQueue most used
✔ Part of Collection framework

---

# 🚀 Summary

* Queue follows FIFO order
* Dynamic collection
* Allows duplicate values
* PriorityQueue, ArrayDeque implementations
* Used for scheduling and processing

---

# 🌊 Stream in Java

## 📌 Definition

**Stream** in Java is used to **process collections of data** in a **functional and efficient way**.

Stream does **not store data**, it only **processes data** from collections.

Streams are introduced in **Java 8**.

---

# 🔹 Features of Stream

* Does not modify original data
* Supports functional programming
* Used for filtering and sorting
* Improves readability
* Processes data in pipeline

---

# 🔹 Stream Hierarchy / Flow

```
Collection → Stream → Operations → Result
```

Example Flow:

```
List → stream() → filter() → map() → collect()
```

---

# 🔹 Creating Stream

```java
list.stream();
```

---

# 🔹 Common Stream Methods

### filter()

Used to filter elements

```java
filter(x -> x > 10)
```

---

### map()

Used to transform elements

```java
map(x -> x * 2)
```

---

### sorted()

Sort elements

```java
sorted()
```

---

### forEach()

Print elements

```java
forEach(System.out::println)
```

---

### collect()

Collect result

```java
collect(Collectors.toList())
```

---

# 🔹 Stream Syntax

```java
list.stream()
    .filter(...)
    .map(...)
    .sorted()
    .forEach(...);
```

---

# 🔹 Key Points

✔ Stream introduced in Java 8
✔ Used to process collections
✔ Does not store data
✔ Uses lambda expressions
✔ Supports chaining operations

---

# 🚀 Summary

* Stream processes collection data
* Functional style programming
* filter, map, sorted operations
* Improves readability
* Introduced in Java 8

---

