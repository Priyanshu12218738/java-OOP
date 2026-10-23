# Phase 8 — Lesson 3: Runtime Polymorphism in the Car System

## Why Runtime Polymorphism?

A car company may use a petrol engine today, a diesel engine tomorrow, and add an electric engine later. Creating a separate `Car` class for every engine type would duplicate code and make the system harder to maintain.

Instead, `Car` depends on the `Engine` interface. Each engine supplies its own implementation of `start()`.

## Example

See [Main.java](Main.java), [Engine.java](Engine.java), [PetrolEngine.java](PetrolEngine.java), [DieselEngine.java](DieselEngine.java), and [Car.java](Car.java).

Expected output:

```text
Petrol engine started
Diesel engine started
```

## What Happens at Runtime?

- `Engine engine` uses the interface as the reference type.
- The actual object may be a `PetrolEngine` or `DieselEngine`.
- When `engine.start()` is called, Java executes the overridden implementation for the actual object.

This is **runtime polymorphism**: the implementation selected for the method call depends on the object's runtime type.

## Interview Distinctions

- **Abstraction:** `Engine` declares what an engine can do without specifying how each engine does it.
- **Polymorphism:** The same `engine.start()` call can execute different implementations.
- **Dependency Injection (DI):** The engine is supplied to `Car` through its constructor.
- **Dependency Inversion Principle (DIP):** `Car` depends on the `Engine` abstraction rather than directly on `PetrolEngine` or `DieselEngine`.

## Key Takeaway

Add another engine implementation without changing the `Car` class, provided the new engine implements the `Engine` interface.
