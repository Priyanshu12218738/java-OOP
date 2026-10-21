# Phase 8 — Lesson 1: Car System Design

## Why OOP Design?

Instead of placing all car data and behavior inside `main()`, separate responsibilities into classes. The `Car` has an `Engine`, which is a **HAS-A** relationship. Composition and programming to an interface let the car work with different engine implementations.

## Step 1 — Define the Engine Interface

See [Engine.java](Engine.java).

The `Engine` interface defines a common contract. Every engine implementation must provide `start()`.

## Step 2 — Implement Different Engines

See [PetrolEngine.java](PetrolEngine.java) and [ElectricEngine.java](ElectricEngine.java).

Both classes implement `Engine`, but each provides its own behavior.

## Step 3 — Create the Car Class

See [Car.java](Car.java).

- `private final Engine engine` — the car stores an engine reference; `private` encapsulates it and `final` prevents reassignment after initialization.
- `Car(Engine engine)` — the engine is supplied through the constructor, which is constructor-based Dependency Injection.
- `engine.start()` — calls the implementation belonging to the actual engine object.
- `Car` does not need to know whether the engine is petrol or electric.

## Step 4 — Run the Example

See [Main.java](Main.java).

Expected output:

```text
Petrol engine started
Car is ready
Electric engine started
Car is ready
```

## OOP Concepts Demonstrated

- **Encapsulation:** the engine reference is private.
- **Abstraction:** the `Engine` interface defines a shared contract.
- **Polymorphism:** an `Engine` reference can point to different implementations.
- **Composition:** a `Car` has an `Engine`.
- **Dependency Injection (DI):** the engine is passed through the constructor.
- **Dependency Inversion Principle (DIP):** `Car` depends on the `Engine` abstraction rather than a concrete engine class.

## Key Takeaway

The `Car` class stays unchanged when a new engine type is introduced, as long as the new class implements `Engine`.
