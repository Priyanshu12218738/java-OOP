# Phase 8 — Lesson 3: Polymorphism in the Car System

## 1. Why Do We Need Polymorphism?

Imagine supporting petrol, diesel, and electric cars. Creating separate `PetrolCar`, `DieselCar`, and `ElectricCar` classes with duplicate `startCar()` logic would make the system harder to maintain.

Instead, `Car` works with the common `Engine` abstraction and delegates engine behavior through it.

```text
Car
 └── calls engine.start()
       └── Engine interface reference
             ├── PetrolEngine → petrol message
             ├── DieselEngine → diesel message
             └── ElectricEngine → electric message
```

## 2. How Runtime Polymorphism Works

The interface defines the common contract:

```java
public interface Engine {
    void start();
    void stop();
}
```

The `Car` constructor accepts an `Engine`:

```java
public Car(Engine engine) {
    this.engine = engine;
}
```

Now the same `Car` class can work with different implementations:

```java
Car dieselCar = new Car(new DieselEngine());
Car electricCar = new Car(new ElectricEngine());

dieselCar.startCar();
electricCar.startCar();
```

When `dieselCar.startCar()` runs, the diesel engine's `start()` implementation executes. When `electricCar.startCar()` runs, the electric engine's implementation executes, assuming both classes implement `Engine` correctly.

## 3. Compile-Time Type vs. Runtime Object

```java
Engine engine = new DieselEngine();
engine.start();
```

- **Compile-time reference type:** `Engine` — determines which members can be accessed through the reference.
- **Runtime object:** `new DieselEngine()` — the actual object assigned to the reference.
- **Method dispatch:** Java invokes the overridden `start()` implementation belonging to the runtime object.

This is **runtime polymorphism**. The concrete class must implement `Engine` and provide the required `start()` method.

## Example Files

- [Engine.java](Engine.java)
- [PetrolEngine.java](PetrolEngine.java)
- [DieselEngine.java](DieselEngine.java)
- [ElectricEngine.java](ElectricEngine.java)
- [Car.java](Car.java)
- [Main.java](Main.java)

## Key Takeaway

Program against the `Engine` interface, not a specific engine class. Adding another engine implementation should not require a new `Car` class.


## Earlier Theory — Runtime Polymorphism (Retained)

### Why Do We Need Runtime Polymorphism?

A car company may use a petrol engine today, a diesel engine tomorrow, and introduce an electric engine in the future. If every engine type required its own `Car` class, the same car-control logic would be duplicated and become harder to maintain.

The solution is to make `Car` depend on the `Engine` interface rather than a concrete engine class.

### Code Walkthrough

```java
public interface Engine {
    void start();
    void stop();
}

public class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Petrol engine started");
    }

    @Override
    public void stop() {
        System.out.println("Petrol engine stopped");
    }
}

public class DieselEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Diesel engine started");
    }

    @Override
    public void stop() {
        System.out.println("Diesel engine stopped");
    }
}

public class Car {
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {
        engine.start();
    }

    public void stopCar() {
        engine.stop();
    }
}
```

The same `Car` class can be used with either engine:

```java
Car car1 = new Car(new PetrolEngine());
Car car2 = new Car(new DieselEngine());

car1.startCar();
car2.startCar();
```

### What Happens Internally?

- `Engine engine` is a reference whose compile-time type is the `Engine` interface.
- The actual object may be `PetrolEngine`, `DieselEngine`, or another implementation.
- When `engine.start()` executes, Java dispatches the call to the implementation belonging to the actual runtime object.

### Interview Concepts

- **Abstraction:** The `Engine` interface defines what an engine can do, without specifying how each engine performs the operation.
- **Polymorphism:** The same method call can execute different implementations.
- **Dependency Injection (DI):** The engine is passed into `Car` through its constructor.
- **Dependency Inversion Principle (DIP):** `Car` depends on the `Engine` abstraction rather than concrete engine classes.

These earlier explanations are preserved alongside the expanded lesson material above.
