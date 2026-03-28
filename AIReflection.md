# AI Reflection

## 1. How Did You Use AI In This Assignment?
I used AI-generated code as a reference.

**Examples:
* **Prompt:** "Can we use a word document on GitHub?"
* **Prompt:** "can we rename the Scanner to Llama?"

**Concepts Researched:**
I encountered the concept of encapsulation. I had no idea what that means.
The AI explained why fields must be declared as `private` (e.g., `private String name;`) 
and accessed via public getters and setters to protect the data 
integrity from the driver class.

## 2. How Did You Understand, Verify, and Adapt the Code?
**Verification:**
I verified the AI-generated code by compiling it directly in 
the terminal using `javac Animal.java Zoo.java` and executing 
the bytecode with `java Zoo`. There was one error and it did not run
because of a terminator.  I used ":" instead of ";"
**Adapting the Code:**
* **Identifier Change:** I intentionally modified the `Scanner` 
    identifier from Dakuma's default `elvis` to `llama`. 
    I understood that this variable can be changed as an Identifier.

## 3. What Did You Learn or Get Better At Through This Work?
**Concept Level-Up:**
I significantly improved my understanding of strict separation 
of concerns in Java. I learned that a data model class like 
`Animal.java` serves only as a blueprint and cannot be executed 
on its own because it lacks a `main` method. It requires a 
driver class like `Zoo.java` to instantiate (represent) the object and run 
the application.  After this assignment, when I reviewed my syntax over and over, it wasn't 
completely incomprehensible, it had a sense of structural familiarity.

**What Went Well / Didn't:**
Following my Dakuma's specific coding style (like his comment blocks and formatting)
was successful. I also learned that I couldn't run my Animal.java file by itself because 
it lacks a 'start' button (the main method). This showed me exactly how Java needs a driver 
class to actually make the code work.
