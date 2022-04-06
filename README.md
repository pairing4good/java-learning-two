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