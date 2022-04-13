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

## Encapsulation
- Encapsulation: Bundle the data and the methods that operate on the data in a single unit or Object
- Pull out Employee class to encapsulate the values and wage calculation 

## Getters and Setters
- *** Mosh added validation to a setter Employee.setBaseSalary.  Figure out a simple way to not do that.

## Abstraction
- Abstraction: Reduce complexity by hiding unnecessary details
- Metaphore:  Remote control for TV has buttons that work with transistors.  We do not work with them directly.  
Don't care what's under the hood

## Coupling
- Coupling: The level of dependency between classes
- The more our clasess are dependent on other classes the more things will break when we change things and the more
expensive the change will be.
- Remove unused methods.  The more methods that you have the more other classes can be coupled to your class.
- change your unused getters to private on Employee to reduce the opportunity to couple

## Reducing Coupling
- When you create the Browser class make all of their methods public
- Show that all of the public methods are available even though not all are needed
- Make the unused methods private
- Add a new parameter to `private String findIpAddress(String address)` like `boolean cache` to prove that the changes
are isolated to the Browser class.
- Demonstrate that if this method were public and you took away the `cache` parameter then the coupled class will also 
have to change

## Constructor
- You should not need to know how to build up a valid Employee by calling both of the setters after creation.
- Instead add a constructor that encapsulates creation knowledge for a valid Employee
- Once you create a constructor, you could create an immutable class by either deleting the setters or making them private

## Overloading Methods
- You may not want to pass extraHours to Employee.calculateWage if the employee did not work extra hours.
- Caution: Too many overloads on a single method can be very difficult to read.

## Constructor Overloading
- Provide a constructor without hourly rate for non-hourly workers

## Static Members
- In OO a class can have two types of members: instance and static.  
- Instance members belong to instances or objects
- Static members belong to the class
- We want to use this when we have a concept that should be represented in a single place
---------
# Refactoring Towards an Object-Oriented Design
- Make sure you are awake for this section.  Most important section

## The Problem
- Mortgage Calculator
- Code is very procedural.  All in the main class
- Try to pull out classes that you think should exist before watching the rest of this series

## What classes do we need?
- Each class should have a single responsibility
- Talk through each method and discuss its responsibility

## Extracting the Console Classes
- I removed the main and the scanner that takes input from the console so this is not needed in my code

## Overloading Method
- Mosh overloaded on of the Console methods created in the previous section.  He said it's not necessary 
but wanted to review it

## Extracting the MortgageReport
- The method `printMortgage` and `printPaymentSchedule` will both be worked on
- Use extract method to move both methods to a new `MortgageReport` class
- `MortgageReport` line 7 calls back to the MortgageCalculator.  This needs to be changed later.

## Extracting the MortgageCalculator
- Use extract method to move the `calculateBalance` and `calculateMortgage`
- Show how small the `ProceduralMortgageCalculator` is now with only one method
- pull `principal`, `annualInterest` and `years` up as class level fields and add a constructor instead of passing 
them around together
- Use change signature to remove those 3 fields from each method signature
- Have to change the method to not be static because class members cannot see instance members
- start by adding a `new MortgageCalculator(...)` to the MortgageReport.printMortgage method
- but instead of creating it twice for the second `MortgageReport` method we should pull up the `MortgageCalculator` 
to a field level variable

## Move Away From Static Members
- We should not use static fields and members that often

## Move Static Fields
- First search for where they are used
- `MortgageCalculator` uses them more so they should move to that class

## Extracting Duplication

## Extracting getRemainingBalances
- This does expose one failing test.  I'm going to @Ignore it for now and come back to validation later

## One last look

## Extra: Failing Test
- Should have added validatation in the beginning of exercise
  - principal between 1000 and 1,000,000
  - annualInterest between 1 and 30
  - years between 1 and 30
- This code clearly needs a validator

## Extra: Extract Validation

----------------
# Inheritance

## Intro
- Will Cover
  - Constructors
  - Access Modifiers
  - Overriding Methods
  - Comparing Objects
  - Polymorphism

## Inheritance
- Use inheritance to reuse code
- The class you inherit from is called a base, parent or super class
- The class that is inheriting from the parent is called a subclass or child
- Extend the TextBox class with the UserInterfaceControl class
- Point out that the TextBox now has all of its original methods plus all the methods it inherited

## The Object Class
- Every class that we declare either directly or indirectly inherits from the Object class.
- Even if you don't explicitly add "extends Object" to a class the compiler will add it at the time of compilation
- Create a new Object() and look at the methods on the instance