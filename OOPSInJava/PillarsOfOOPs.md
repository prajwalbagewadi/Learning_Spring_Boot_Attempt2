# POP - Procedural-oriented programming 
# OOP - Object-oriented programming

# POP (Procedural-Oriented Programming): 
- “We tell the computer step-by-step what to do, like following a recipe.” 👶📜

# OOP (Object-Oriented Programming): 
- “We make little objects that know what to do by themselves, like toys with their own actions.” 🧸🤖

## Focus/Emphasis:
- POP: Focuses on procedures or algorithms. (steps)
- OOP: Focuses on Data.
## Approach: (how the compiler reads your program)
- POP: Follows top down approach in program design.
- OOP: Follows Bottom up approach in program design.
## Division:
- POP: Large programs are divided into functions.
- OOP: Large programs are divided into Objects(entities).
## Examples:
- POP: BASIC, C, COBOL, Pascal, Fortran.
- OOP: C++, C#, Java, Python.
## Reusability:
- POP: Limited code reuse.
- OOP: freely code reuse.
## Security:
- POP: Data is less Secure.
- OOP: Data is More Secure and hidden.
## Memory/storage space :
- POP: Its memory requirement is less.
- OOP: Its memory requirement is high.

# Pillars of OOPs:
- Class
- Object
- Encapsulation
- Abstraction
- Inheritance
- Polymorphism

## Class:
- A class is a template or blueprint for creating objects.
- A class is a user-defined data type that represents a
blueprint/prototype for creating instances of objects.
- It defines a set of attributes (data members) and methods
(member functions).
```
class Car {

  // properties/attributes (What it has)
  String color;
  int wheels;

  // function/method (What it does)
  void drive() {
    System.out.println(color + "Car with" + wheels + "is driving"); 
  }
}
```

## Object:
- An object is an instance of a class.
- Objects are the basic run-time or real-world entities in an object-oriented system.
-It may represent a person, a place, a bank, or other things.
```
class Car {

  // properties/attributes (What it has)
  String color;
  int wheels;

  // function/method (What it does)
  void drive() {
    System.out.println(color + "Car with" + wheels + "is driving"); 
  }
}
```
```
Class Main {
  public static void main(String[] args) {
    Car c1 = new Car();
    c1.color = red;
    c1.wheels = 4;
    c1.drive();
  }
}
```
