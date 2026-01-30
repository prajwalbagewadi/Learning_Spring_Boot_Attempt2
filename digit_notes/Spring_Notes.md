# Spring And Spring Boot.

## What is Spring?

## IoC (Inversion of Control):

![Diagram:IoC](./ioc.jpg)

### example:

```
class Controller {
    Service service = new Service();
}
```

```
class Service {
    Repo repo = new Repo();
}
```

```
import java.sql.Connection;
import java.sql.DriverManager;
class Repo {
    public Repo() {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "password";

        try(Connection con = DriverManager.getConnection(url,username,password)) {
            System.out.println("Database connected successfully");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
```

- Typically, we developers create objects by ourselves using the new keyword.
- But what if we give that control to someone else (a framework)?
- - This concept is called IoC.
- IoC(Inversion Of Control) is principle.
- IoC means you don't create objects yourself -- the framework creates and manages them for you
- To achieve IoC, we use a technique called DI(Dependency Injection).
- DI is the actual implementation of IoC (a Concrete Technique).

### example:

```
class Controller {
    //instead of doing.
    Service service = new Service();

    //you can ask Spring to inject -> you mention the reference -> Spring will give you the object.
}
```

## 3 Techniques to achieve Dependency Injection:

### Without Dependency Injection:

```
class Controller {
    private Service service = new Service();

    public void handleRequest() {
        service.doSomeThing();
    }
}

class Service {
    public void doSomeThing() {
        System.out.println("doing work");
    }
}
```

### 1. Constructor Injection:

```
class Controller {
    Service service;

    //Constructor
    Controller(Service serv) { //reference of service(serv)
        this.service = serv;
    }

    //usage
    public void handleRequest() {
        service.doSomeThing();
    }

}

class Service {
    public void doSomeThing() {
        System.out.println("doing work");
    }
}
```

### 2. Setter Method Injection:

```
public class Controller {
    private Service service;

    //Setter Method
    public void setService(Service serv) {
        this.service = serv;
    }

    //usage
    public void handleRequest() {
        service.doSomeThing();
    }
}

public class Service {
    public void doSomeThing() {
        System.out.println("Doing SomeWork.");
    }
}
```

### 3. Field Injection (Not Recommended):

- Field Injection = dependency is injected directly into a class variable(field), instead of through a constructor or setter method.
- Most commonly seen in Spring/Spring Boot using the '@Autowired' annotation.

```
public class Controller {
    @Autowired
    private Service service; //interface

    public void handleRequest() {
        service.doSomeThing();
    }
}

public class Service {
    public void doSomeThing() {
        System.out.println("doing somework");
    }
}
```

- Loose Coupling: you don't have a concrete implementation of one class in another. You code for interfaces.
- What it means:
- You do not create objects using the new keyword.
- You do not depend on a specific class.
- You declare the dependency as an interface.
- Spring injects the actual implementation at runtime.

### example :
1. Without Loose Coupling (tight coupling):
```
@Component
class UserService {
    private MySQLRepository repo = new MySQLRepository();
}
// problem: UserService is stuck with MySQLRepository.
```
2. With Loose Coupling (Field Injection):
```
@Component
class UserService {
    @Autowired
    private UserRepository repo; // interface
}

@Repository
class MySQLRepository implements UserRepository { }
// What this means:
// - UserService does not know which class is used.
// - Spring injects the correct implementation.
// - You can change the implementation without touching UserService
```
- Someone else is injecting the object in your app. -> Spring(IoC container)

## Spring Boot:

![Diagram:SpringBoot](./springboot.jpg)

### Question: 
- Do you want Spring to handle all the classes?
- Most of the time, we don't need objects for all the classes.
- We need objects for a selected few classes.

### How do you talk to your Spring Framework and say -> Don't create objects for everything?
- I just want a few classes.
- We do it in a configuration file -> xml or property file. (talking to framework)

- Just because you are using Spring, -> you will not be able to run your code on the first go.
- You will have to first work with the 'Configuration file'.
- For web apps, -> you need a server;  -> you can use Tomcat.
- If you build a web app in Spring, -> you need to have Tomcat configured and installed.

## Spring Boot:
-  Let me take care of your config problems.
-  Get your project running in a few minutes.
-  Build projects in less time.

## Note: In Spring, you do the configurations manually.

![Diagram:SpringBootOnSpringFramework](./spingbootOnSpring.jpg)

- We can build apps using Spring Framework.
- Or if you want to make it easy, use Spring Boot. (opinionated Framework)

## Spring Boot is an opinionated framework, which means:
- The framework decides defaults for you.
- You follow its way of doing things.
- Fewer choices, fewer configurations.

- Means: Spring Boot will give you certain things the way it wants.
- And you can simply use it to run your apps.

## Spring Initializer (steps):
- https://start.spring.io
- Project (Build Tool): Maven.
- Language: Java.
- Spring Boot (Version): 3.2.5
- Project Metadata:
- Group: com.bagewadi
- Artifact: DemoApp
- Name: DemoApp
- Description: Demo project for Spring Boot
- Package name: com.bagewadi.DemoApp
- Packaging (type): jar(selected)  war
- Java (version): 22 21(selected) 17

## Web apps:
- Deploy on the cloud.
- You need a (.War) file (Web Archive).
- And then you push your war file into Tomcat to run it.

- You can create a Jar file, -> Jar doesn't run on Tomcat.
- What if you don't need an external Tomcat?
- What if the project itself has a Tomcat?
- Spring Boot says if you want to build a web app, -> you will get embedded Tomcat.

## Dependencies:
- We talked about Spring. -> There are multiple projects inside Spring, and we don't need all.
- Depending on your use case, you will choose one.

## Add Dependencies:
- Example: I want to build a web app, select -> Spring web.
- Add Database -> JPA.
- Click on generate.
- Download and Unzip.
- Goto -> IDE -> open downloaded project.
- If you expand the dependencies.
- Jackson: (Convert Java objects to JSON) automatically.
- Micrometer: Used for application metrics (Monitoring).
- - Collects metrics like:
  - request count
  - response time
  - memory / CPU usage
  - custom counters
  - Sends them to monitoring tools (Prometheus, Grafana, etc.)
- Embedded Tomcat
- Spring Boot
- Spring Framework
- Spring Core
- all things needed for the Spring project.

## Using the above steps and information, create a DemoApp.
- Trying to create and run the project.
- (Steps):
- - Steps in Spring initializer.
  - Add the dependency (Spring Web).
  - And try to run the Project.
  - Observe the (External dependencies) and try to find the above dependencies.
  - Unzip the project folder.
  - Open the project with IntelliJ IDEA.
  - Let Maven download the dependencies.
  - Goto -> src (folder) -> main -> java -> com.prajwal.demo -> DemoApplication.java
```
//auto-generated
package com.prajwal.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
```
 - Current file -> run.
 - Goto -> Chrome -> localhost:8080
 - Observe the 'Whitelabel Error Page' (more on that).
 - * Servlet or anyother app before.
 - Create a class Hello.
 - Create -> src (folder) -> main -> java -> com.prajwal.demo -> Controller (Package)
 - Create class Hello.java in the controller package.
```
package com.prajwal.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/") // "/" maps to homepage
    public String greet() {
        return "Hello World!";
    }
}
```
 - Running Project: Goto -> src (folder) -> main -> java -> com.prajwal.demo -> DemoApplication.java -> Run (automatically compiling and running the project on the embedded Tomcat)
 - Goto -> Chrome -> localhost:8080
 - Observe the output on the screen: "Hello World!".

## Spring Boot Issues:
- Default.
- It will do a lot of stuff for you.
- Convenience over Configuration.
- In Spring, you will have to configure a lot of the stuff.
- Spring Boot will give you extra things that you might need or might not.
- It gives you a lot of default stuff.
- If you want more control over your stuff, use Spring.
- Debatable.
- Convenient Spring Boot.

## Dependency Injection using Spring Boot:
- Create a 'Core Spring Boot app' using the Spring Initializr (https://start.spring.io)
- Repeat the steps in [Go to Spring Initializer (steps)](#spring-initializer-steps)
- Maven -> java -> 3.2.5,(3.5.5)
- Group -> com.prajwal
- Name -> MyApp
- Packaging -> Jar
- Java -> 21
- (No Dependencies!) Please don't add any Dependencies.

```
package com.prajwal.MyApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MyAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyAppApplication.class, args);
        // It creates a container responsible for creating and running an IoC container.
        // ChatGpt corrected: It starts the Spring Boot Application and initializes the IoC container. 
    }
} 
```
- SpringApplication.run() bootstraps the Spring Boot app and creates the IoC container.
  
![Diagram:Role of Spring IoC Container in Dependency Injection](./RoleOfSpringIoCContainerInDependencyInjection.jpg)
