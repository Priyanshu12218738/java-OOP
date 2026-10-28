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
