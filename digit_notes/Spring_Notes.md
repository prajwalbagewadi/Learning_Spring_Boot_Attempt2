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
