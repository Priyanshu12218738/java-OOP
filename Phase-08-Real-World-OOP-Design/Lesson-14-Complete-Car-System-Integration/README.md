# Phase 8 — Lesson 14: Complete Car System Integration

## Goal

Connect the concepts from previous lessons into one working console-based Car System. This version includes engine selection, constructor dependency injection, state management, and a menu for starting and stopping the car.

## 1. Project Structure

```text
CarSystem/
|
|-- Engine.java
|-- DieselEngine.java
|-- PetrolEngine.java
|-- ElectricEngine.java
|-- Car.java
|-- Main.java
```

## 2. Engine.java

```java
public interface Engine {
    boolean start();
    boolean stop();
}
```

The interface defines the common contract implemented by every supported engine.

## 3. DieselEngine.java

```java
public class DieselEngine implements Engine {

    private boolean running = false;

    @Override
    public boolean start() {
        if (running) {
            System.out.println("Engine already running");
            return false;
        }

        running = true;
        System.out.println("Diesel engine started");
        return true;
    }

    @Override
    public boolean stop() {
        if (!running) {
            System.out.println("Engine already stopped");
            return false;
        }

        running = false;
        System.out.println("Diesel engine stopped");
        return true;
    }
}
```

## 4. PetrolEngine.java

```java
public class PetrolEngine implements Engine {

    private boolean running = false;

    @Override
    public boolean start() {
        if (running) {
            System.out.println("Engine already running");
            return false;
        }

        running = true;
        System.out.println("Petrol engine started");
        return true;
    }

    @Override
    public boolean stop() {
        if (!running) {
            System.out.println("Engine already stopped");
            return false;
        }

        running = false;
        System.out.println("Petrol engine stopped");
        return true;
    }
}
```

## 5. ElectricEngine.java

```java
public class ElectricEngine implements Engine {

    private boolean running = false;

    @Override
    public boolean start() {
        if (running) {
            System.out.println("Engine already running");
            return false;
        }

        running = true;
        System.out.println("Electric engine started");
        return true;
    }

    @Override
    public boolean stop() {
        if (!running) {
            System.out.println("Engine already stopped");
            return false;
        }

        running = false;
        System.out.println("Electric engine stopped");
        return true;
    }
}
```

## 6. Car.java

```java
public class Car {

    private final Engine engine;

    public Car(Engine engine) {
        if (engine == null) {
            throw new IllegalArgumentException("Engine cannot be null");
        }

        this.engine = engine;
    }

    public void startCar() {
        if (engine.start()) {
            System.out.println("Car is ready");
        }
    }

    public void stopCar() {
        if (engine.stop()) {
            System.out.println("Car has stopped");
        }
    }
}
```

The Car receives an Engine through its constructor and reports success only when the engine confirms that its state changed.

## 7. Main.java

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Engine:");
        System.out.println("1. Diesel");
        System.out.println("2. Petrol");
        System.out.println("3. Electric");

        int choice = sc.nextInt();

        Engine engine = null;

        switch (choice) {
            case 1:
                engine = new DieselEngine();
                break;

            case 2:
                engine = new PetrolEngine();
                break;

            case 3:
                engine = new ElectricEngine();
                break;

            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        Car car = new Car(engine);

        boolean exit = false;

        while (!exit) {

            System.out.println("\\n1. Start Car");
            System.out.println("2. Stop Car");
            System.out.println("3. Exit");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    car.startCar();
                    break;

                case 2:
                    car.stopCar();
                    break;

                case 3:
                    exit = true;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option");
            }
        }

        sc.close();
    }
}
```

## 8. OOP Concepts Applied

| Concept | Application |
|---|---|
| Encapsulation | Private `running` state inside each engine implementation. |
| Abstraction | Engine interface defines the common contract. |
| Polymorphism | Different Engine implementations can be referenced through Engine. |
| Composition | Car HAS-A Engine reference. |
| Constructor Dependency Injection | `Car(Engine engine)` receives its dependency. |
| DIP | Car depends on the Engine interface, not a concrete engine. |
| OCP | New engine implementations can be added without changing Car, provided they follow the Engine contract. |

## 9. Integration Checklist

- [ ] Compile all six Java files together.
- [ ] Select each engine type and verify its engine-specific start/stop messages.
- [ ] Start the car and verify the success message.
- [ ] Try starting the car twice.
- [ ] Stop the car and verify the success message.
- [ ] Try stopping the car twice.
- [ ] Enter an invalid engine selection.
- [ ] Exit the menu cleanly.

## 10. Refactoring Note

This is a learning version. The three engine classes repeat similar state-management logic. That duplication can be reduced in a later refactoring, while preserving engine-specific behavior.

## Key Takeaway

**Main selects and creates the engine, Car receives it through constructor injection, and the selected Engine implementation manages its own state.**

The integrated application brings together encapsulation, abstraction, polymorphism, composition, dependency injection, and SOLID-oriented design.
