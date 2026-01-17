# PHASE 1: Spring & Spring Boot Basics

## Why was Spring Created?
> Rod Johnson created the Spring framework in 2002-2003 to simplify complex 'Java Enterprise Development'.
> This at the time, relied heavily on verbose configurations and hardcoded dependencies in JavaEE, making development slow and cumbersome.

## What is Java Enterprise Development (JED)?
> Now JakartaEE is a set of specifications, APIs, and tools for building large, scalable, secure,
  multi-tiered, and reliable enterprise-level applications, like banking systems or e-commerce platforms, focusing on backend services, business logic, and data management.
> It extends standard Java(JavaSE) with features for distributed computing, web services, data connectivity (JPA/Hibernate), messaging,
  and transaction management, abstracting infrastructure complexity so developers can focus on business features.

## What is Verbose Configuration?
> When you have to write a lot of configuration code or files just to make things work.
### Eg:
* many xml files.
* long setup code.
* Repeating similar settings again and again.
### Simple words:
> Too much setup, less actual coding. 
### Real-life analogy:
> Before driving a car, you must manually connect wires, fuel pipes, and engine parts every time 🚗

## What are Hardcoded dependencies?
> When a class directly creates or tightly depends on another class, instead of getting it from outside.
### Eg:
```
class OrderService {
	PaymentService payment = new PaymentService(); //hardcoded
}
```
### Problem:
* Hard to change.
* Hard to test.
* Tightly coupled code.
### Better approach(Dependency Injection):
```
Eg:
class OrderService {
	PaymentService payment;
	
	public OrderService(PaymentService pay) {
		this.payment = pay;
	}
}
```
### Simple words:
> Code is stuck with one specific implementation.
### Real-life analogy:
> You buy a phone with a battery permanently glued inside 🔋
  If the battery fails, the whole phone fails.
