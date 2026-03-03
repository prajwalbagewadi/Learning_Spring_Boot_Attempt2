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
//Car.java
public class Car {

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
//Car.java
//Same package
public class Car {

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
//Main.java
//Same package
Class Main {
  public static void main(String[] args) {
    Car c1 = new Car();
    c1.color = red;
    c1.wheels = 4;
    c1.drive();
  }
}
```

## Encapsulation:

- Wrapping up of data and functions into a single unit is known
  as encapsulation.
- Encapsulation is a process of combining member functions and
  data members in a single unit. The purpose is to prevent access to the
  data directly and to hide "sensitive" data from users.
- Implementation level (how to hide data using access modifiers)
- Encapsulation is the bundling of data members and
  methods(functions) into a single unit (class).

```
//Car.java
public class Car {

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
//Car.java
public class Car {
  // Data members (hidden)
  private String color;
  private int wheels;

  //public methods to access data
  public void setColor(String color) {
    this.color = color;
  }
  public String getColor() {
    return this.color;
  }

  public void setWheels(String color) {
    this.wheels = wheels;
  }
  public String getWheels() {
    return this.wheels;
  }

  //Data is kept private, access is provided through public methods (getters/setters).
}
```

## Abstraction:

- Abstraction refers to the act of representing essential features without including the background details or explanation.
- It hides the implementation/unnecessary details and exposes only the necessary/essential features to the outside world.
- Design level (what to expose).
- Examples:
- ATM Machine:
- Users perform the operations on the ATM Machine. Like cash withdrawal, money transfer, and retrieving statements, etc.
- But we can't know internal details about ATM.
- Bike/Car:
- We know about how to ride or drive bike/car. But cannot know about how it works?
- And also, we do not know the internal functionality of a bike/car.
- Achieved using:
- Abstract classes.
- Interfaces.

```
//Interface
interface ATM {
  void withdraw();
  void deposit();
}
class BankATM implements ATM {
  public void withdraw() {
    System.out.println("Cash withdrawn.");
  }
  public void deposit() {
    System.out.println("Cash deposited.");
  }
}
```

```
//Abstract class
abstract class Vehicle {
  abstract void start();
}
class Car extends Vehicle {
  @Override
  void start() {
    System.out.println("car started.");
  }
}
```

## Inheritance:

- Inheritance is the process by which objects of one class acquire the properties of objects of another class.
- The capability of a class to derive properties and characteristics from another class is called Inheritance.
- Sub/Child/Derived class: The class that inherits properties from another class is called Sub class or a derived class.
- Super/Parent/Base class: The class whose properties are inherited by a subclass is called the Base class or Super Class.
- Inheritance is a mechanism that allows a class (derived or child class) to inherit properties and behaviours from another class (base or parent class).
- Reusability is achieved through inheritance.

### Types of Inheritance:

- Single inheritance
- Multilevel inheritance
- Multiple inheritance (not supported in java but can be achieved through interfaces)
- Hierarchical inheritance
- Hybrid inheritance

## Polymorphism:

- Polymorphism is a Greek term that means the ability to take more than one form.
- "Polymorphism" is the combination of "poly" = many, "morphism" = forms. ManyForms.
- Polymorphism means the same entity (function or object) behaves differently in different scenarios.

### Types of polymorphism:

- Compile time: function overloading.
- Runtime: function overriding, Dynamic method dispatch.
