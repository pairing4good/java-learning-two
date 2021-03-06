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

## Constructors and Inheritance
- Show print statements in default constructor for TextBox and UserInterfaceControl
- Mention the order that class level fields, followed by constructors, followed by methods
- Switch default constructor on UserInterfaceControl to take a parameter.  This will create an error in the TextBox
- Call the UserInterfaceController constructor explicitly with `super`
- Move super down in the constructor and you get an error

## Access Modifiers
- We know that public members are accessible outside a class while private members are not
- Demonstrate this by showing that UserInterfaceControl `isEnabled` field is not accessible outside the class
- Demonstrate that in the TextBox constructor that you cannot access the parent class's private methods
- We use private to hide implementation so that changes will not impact other classes in the future
- `protected` is considered a bad practice to use it but to demonstrate change UserInterfaceControl `isEnabled` to 
protected.  This will make it available to access in the same package.  Demonstrate that it's available within classes 
in the same package.  Move the class outside the package and it breaks
- `protected` is confusing and is considered a bad practice.  It will make your code hard to maintain so avoid using it.
- remove the modifier to make it package private.  This also should not be used.
- The only difference between `protected` and package private is that subclasses can not access package private.

## Overriding Methods
- Override TextBox `toString` method

## Upcasting and Downcasting
- Upcasting: Casting an object to one of its super types
- Downcasting: Casting an object to one of its sub types
- Print `toString` on UserInterfaceControl
- Then print TextBox downcast to UserInterfaceControl - it prints the TextBox `toString`
- But cannot see the TextBox methods when downcast
- If you cast `(TextBox) control` you can see the methods but if you pass a UserInterfaceControl and try to cast it to 
TextBox you will get a `ClassCastException`
- You need to check the instance before you cast it `instanceof`

## Comparing Objects
- Explain why each line exists in the generated equals and hashcode

## Polymorphism
- We have covered so far: encapsulation, abstraction and inheritance
- We are going to talk about the fourth principle of OO, polymorphism
- Poly means many.  Morph means form.  Polymorphism means many forms.
- Without Polymorphism you would need an if/else structure to render each type of UserInterfaceControl
- UserInterfaceControl isn't really a control.  We don't know how to render it.  It's actually an abstract class.
- You can't instantiate an abstract class
- Try to comment out CheckBox or TextBox overridden render method.  You get an error.

## Final Classes and Methods
- change CheckBox to be a final class and attempt to extend CheckBox.  You will get a compilation error.
- This allows you to prevent a class from being extended.
- String is final because it is immutable
- set UserInterfaceControl `enable` method to final and attempt to override it in CheckBox

## Deep Inheritance Hierarchies
- Too much of a good thing is a bad thing
- Don't create deep inheritance hierarchies
- This is a common mistake
-                                          entity
-                                  user                   courses
-                    instructor             student
-     regularInstructor  premiumInstructor
- Both user and courses are tightly coupled to entity.  If you make any changes to entity you will have to modify 
the user and course classes
- If you modify the constructor of the Entity you may have to modify all the classes
- May add fields or methods that children don't need and end up polluting your hierarchy
- Avoid deep inheritance hierarchies.  Limit to one or two levels.

## Multiple Inheritance
- In some programming languages like C++ and Python, a class can have multiple parents.
- This is called multiple inheritance
- Designers of Java decided to not implement this feature because it introduces several complexities:
  - If C inherits from A & B if they both implement the same method name or provide the same field name which should C inherit?
  - Diamond Problem: If D inherits from B & C and B & C both inherit from A
- YAGNI - You aren't gonna need it - that much anyway

------------------
# Interfaces

These are one of the most powerful and yet most misunderstood constructs in Java

- What Interfaces are
- Why we need them
- How to use them Properly
- Dependency Injection

## What Are Interfaces

We use interfaces to build loosely-coupled, extensible, testable application.

- Earlier in the course we talked about coupling which is the level of dependencies between two software entities 
like classes.  So if A uses B then A is dependant or coupled to B.  If you change B then you may have to change A.
- Keep things as loose as possible.  Like in a car, if we have an engine problem we want to change only one part.  
We don't want to have to change the tires too.
- How can you reduce the coupling between two classes
  - Earlier we talked about abstraction principles: which says we should hide the implementation details and only 
  expose what is necessary.
  - With abstraction A knows less about B but that is not enough.  That's where interfaces come into play
  - An interface does not provide any implementations.  It only defines the capabilities it has.  
- An interface separates two classes so they know nothing about each other
- Interface: What should be done
- Class: How it should be done

## Tightly-coupled Code
- TaxReport is tightly coupled to TaxCalculator
- Add a new constructor parameter on TaxCalculator and you will have to change the TaxReport
- Not a huge deal in the app but what if we had 10 classes that were tightly coupled to TaxCalculator?

## Creating an Interface
- public is not needed in an interface
- You cannot instantiate an interface
- Should add @Override to methods that come from the interface
- If you remove the interface method the @Override will go red

# Dependency Injection
- Our classes should not instantiate (new up) their dependencies
- TaxReport should not new up the TaxCalculator, it should just use it
- We need a separation of concerns.  TaxReports should not be responsible for newing up TaxCalculators
- Dependency Injection: Constructor, Setter or regular method

## Constructor Injection
- We injected TaxCalculator into TaxReport by hand in the TaxReportTest
- Spring is a dependency injection framework.  This is outside the scope of this course.

## Setter Injection
- A second way to inject dependencies is through setters.
- The benefit of setter injection is that you can change out the dependencies throughout the lifetime of a program

## Method Injection
- A third way to inject dependencies is through method injection
- This approach passes the dependency to the method that needs that dependency
- Pass the TaxCalculator to the TaxReport `show` method
- Most of the time you will use Constructor Injection

## Interface Segregation Principle
- ISP = Divide big interface into smaller ones
- Dragger only needs the drag method from the UserInterfaceWidget interface
  - void drag();
  - void resize();
  - void render();
- Draggable is lightweight.
- We don't need to separate interface methods every time there are more than one method.  Instead we need to separate 
their capabilities.  For example Resizable might have other methods that are related to the same capability of resizing.
- *** Unlike Java classes, Java interfaces can extend multiple interfaces.  This is not an issue.  This does not 
create the same multiple inheritance issue like with classes.  If there are multiple methods with the same signature 
it will only inherit one of them because they don't have any implementation.

## Project - MyTube Video Platform
- Decouple these classes as necessary
- Extract three interfaces and decouple these classes from VideoProcessor
- Solution
  - Extract Interfaces
  - Reinject instances
- Cut over to JUnit rather than a main class

## Popular Interview Question
- Differences between interfaces and classes
- Interfaces: contracts used to build loosely-coupled, extensible, testable applications
- Abstract Classes: partially implemented classes used to share code between classes
- *** Unfortunately the newest features in Java interfaces pollutes them with the option to provide partial 
implementation (fields, static methods, private methods).  This reintroduces the dimond inheritance problem that 
Java originally intended to avoid by making multiple inheritance not an option in Java.

## When to Use Interfaces
- Extracting an interface from every class is not a good practice
- You should instead use it to decouple classes
- Benefits of Interfaces
  - Swap Implementations
  - Extend Your Applications (Extensibility)
  - Test Your Classes in Isolation
