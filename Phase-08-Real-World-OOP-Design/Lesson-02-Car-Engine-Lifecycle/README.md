# Phase 8 — Lesson 2: Car Engine Lifecycle

## Goal

Extend the Car System so the engine can start and stop. Keep engine-specific behavior in engine implementations, while `Car` coordinates its components.

## 1. Improve the Engine Interface

The `Engine` contract now requires both `start()` and `stop()`. Every engine implementation must provide both methods.

See [Engine.java](Engine.java).

## 2. Implement Engine Types

- [PetrolEngine.java](PetrolEngine.java)
- [ElectricEngine.java](ElectricEngine.java)
- [DieselEngine.java](DieselEngine.java)

Each engine provides its own start and stop behavior while following the same interface.

## 3. Let Car Coordinate the Engine

See [Car.java](Car.java).

- `private final Engine engine` stores an engine reference.
- The constructor receives the engine from outside; this is constructor-based Dependency Injection.
- `startCar()` asks the engine to start, then reports that the car is ready.
- `stopCar()` asks the engine to stop, then reports that the car has stopped.
- `Car` does not need to know the concrete engine type.

**Important:** `final` prevents reassignment of the reference after initialization. It does not make the referenced engine object immutable.

## 4. Run the Example

See [Main.java](Main.java).

Expected output:

```text
Petrol engine started
Car is ready
Petrol engine stopped
Car has stopped
Electric engine started
Car is ready
Electric engine stopped
Car has stopped
Diesel engine started
Car is ready
Diesel engine stopped
Car has stopped
```

## Design Takeaway

Keep engine operations inside engine implementations. Let `Car` coordinate those operations through the `Engine` interface. This keeps the design extensible when new engine types are added.
