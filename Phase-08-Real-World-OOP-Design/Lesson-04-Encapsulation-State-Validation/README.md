# Phase 8 — Lesson 4: Encapsulation, State Management, and Validation

## Why Track Car State?

A car should know whether its engine is already running. Without state management, repeated calls to `startCar()` or `stopCar()` could trigger invalid operations.

This lesson models two states:

- **STOPPED:** `isRunning == false`
- **RUNNING:** `isRunning == true`

Valid transitions are:

```text
STOPPED --startCar()--> RUNNING
RUNNING --stopCar()--> STOPPED
```

## Encapsulation

The `Car` class stores state in a private field:

```java
private boolean isRunning = false;
```

- `private` prevents external code from changing the field directly.
- The initial value `false` means the car starts in the stopped state.
- `startCar()` and `stopCar()` validate the current state before calling the engine.
- The state is updated only after the corresponding engine operation returns successfully.

Making a field private is not sufficient by itself; the methods that change it must enforce valid transitions.

## Implementation

See [Engine.java](Engine.java), [PetrolEngine.java](PetrolEngine.java), [Car.java](Car.java), and [Main.java](Main.java).

## Expected Output

```text
Petrol engine started
Car started successfully.
Car is already running.
Petrol engine stopped
Car stopped successfully.
Car is already stopped.
```

## Important Design Note

This simple example assumes `Engine.start()` and `Engine.stop()` either complete successfully or throw an exception. Since `Car` updates its state only after the operation returns, a thrown exception leaves the stored state unchanged. In a production system, the design may need explicit failure states or recovery logic if the engine can partially change state before failing.

## Key Takeaway

Encapsulation protects an object's state, while validation in its methods ensures that only valid state transitions are allowed.
