# JavaAssignment1
Java Assignment #1 -- Instructor: Dakuma

# Zoo Application - Java Assignment 1

A console-based Java application demonstrating Object-Oriented Programming (OOP) fundamentals. This project was developed as Option B for the MWD2C (Java) Assignment 1 at triOS College.

## Project Architecture

This application strictly enforces a separation of concerns by dividing the logic into two distinct classes:

* **`Animal.java`**: The **Data Model**. It acts as a blueprint for creating animal objects. It demonstrates **encapsulation** by hiding its state (private fields) and providing controlled access through public getters and setters.
* **`Zoo.java`**: The **Driver Class**. This acts as the entry point for the Java Virtual Machine (JVM). It contains the `main` method, handles user input via the `Scanner` class (customized as `llama`), and instantiates the `Animal` object.

## Technical Features

* **Encapsulation**: Strict use of `private` fields (`name`, `color`, `age`, `favFood`) protected by `public` access modifiers.
* **Constructor Initialization**: Uses a parameterized constructor to initialize all object fields simultaneously upon instantiation using the `this` keyword.
* **Formatted Output**: Utilizes `System.out.printf` with specific format specifiers (`%s` for Strings, `%d` for integers, and `%n` for platform-independent newlines) for precise console rendering.
* **Resource Management**: Explicitly closes the input stream (`llama.close()`) at the end of execution to prevent memory leaks.

## How to Compile and Run

To execute this program, you must compile both Java files into bytecode and then run the driver class using your terminal.

### 1. Compilation
Navigate to the directory containing your `.java` files and compile them using the Java Compiler (`javac`):

```bash
javac Animal.java Zoo.java
java Zoo
