# Introduction
Prerequisites
- Basic understanding of Java
    - variables
    - data types
    - methods
    - control flow
## Programming Paradigms
- Procedural
- **Functional**
- **Object-Oriented**
- Event-Driven
- Logic
- Aspect-Oriented

### Ideas
- Not languages but rather styles of how you code
- JavaScript, Java and Python support multiple paradigms
- Objects are units that contain data (state) and methods (behavior)
- OO - keeps data and behavior together in objects
- Functional - separates data from behavior and treats them fundamentally different

## Benefits of OO
- Car parts are replaceable

Benefits
- Reduced Complexity
- Easier Maintenance
- Code Reuse
- Faster Development

## Course Structure
- Encapsulation
- Abstraction
- Classes
- Refactor Towards OO Code
- Inheritance & Polymorphism
- Interfaces
---------
# Classes
## Intro
- Encapsulation
- Abstraction
- Constructors
- Getters/Setters
- Method Overloading
### Explain difference between Class & Objects

## Create Classes
- Pascal naming convention for classes
- public access modifier
- Camel case naming convention for fields
- setter why use this keyword?
- should not set class members as public (but step by step example)
## Creating Objects
- new keyword
- use var instead of the class name twice ???
- use dot operator to see members of this object

## TextBox Class
- org.knightmoves.learn.TextBoxTest.shouldReturnNull_WhenTextNotSet returns null because String is a reference type instead of a primitive type. 
String is a reference type and is set to null by default.
- org.knightmoves.learn.TextBoxTest.shouldThrowException_WhenCallingMethodOnNull will throw an NPE if call a method on null
- If you initialize TextBox.text to empty string it will never be null.

## Memory Allocation
- Heap: Objects
- Stack: Primitives and short-lived variable
- temp variables are on the stack and reference the object on the heap
- org.knightmoves.learn.TextBoxTest.shouldReferenceSameInstance

## Procedural Programming
- WageCalculatorUtility.calculate() will bloat over time with procedural code
- Just because you use Java your code is not magically Object Oriented.  You have to code Java in an OO style.
- Symptoms of procedural code is that you have a lot of parameters
  - Logic is all over the place
  - Logic is not reusable
  - Spaghetti code
