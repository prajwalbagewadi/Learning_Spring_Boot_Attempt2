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

- Typically,we developers create objects by ourselfs using new keyword.
- But what if we give that control to someone else (a framework)?
- - This concept is called IoC.
- IoC(Inversion Of Control) is principle.
- IoC means you don't create objects yourself -- the framework creates and manages them for you
- To achive IoC, we use a technique called DI(Dependency Injection).
- DI is the actual implementation of IoC (a Concreate Technique).

### example:

```
class Controller {
    //instead of doing.
    Service service = new Service();

    //you can ask spring to inject -> you mention the reference -> Spring will give you the object.
}
```

## 3 Techniques to achive Dependency Injection:

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
