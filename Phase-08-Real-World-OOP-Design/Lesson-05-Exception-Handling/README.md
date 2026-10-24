# Phase 8 — Lesson 5: Exception Handling in the Car System

## Why Do We Need Exceptions?

In the previous lesson, the car printed a message when an operation was invalid, such as trying to start an already-running car. But when another Java program uses `Car`, it may need a programmatic signal that the operation was not allowed.

- **Message:** Provides information to a user, often in a console application.
- **Exception:** Communicates an error or invalid condition to the calling code.

Not every invalid operation must throw an exception; that choice depends on the application's design.

## Message vs. Exception

### Option A — Print a Message

```java
if (isRunning) {
    System.out.println("Already running");
    return;
}
```

This can be appropriate for simple console feedback.

### Option B — Throw an Exception

```java
if (isRunning) {
    throw new IllegalStateException("Car is already running");
}
```

This signals that the operation is not allowed in the current state. `IllegalStateException` is a built-in unchecked exception, so declaring it with `throws` is not required.

## Handling an Exception

```java
try {
    car.startCar();
} catch (IllegalStateException e) {
    System.out.println("Error: " + e.getMessage());
}
```

- `try`: contains code that may throw an exception.
- `catch`: handles a matching exception.
- `e.getMessage()`: returns the exception message.

**Important:** If `startCar()` only prints a message and does not throw an exception, this `catch` block will not handle that printed message. A catch block handles exceptions, not ordinary console output.

## Implementation

- [Car.java](Car.java) — throws an exception when a start/stop operation is invalid.
- [Engine.java](Engine.java) and [PetrolEngine.java](PetrolEngine.java) — engine contract and implementation.
- [Main.java](Main.java) — demonstrates handling invalid operations with `try/catch`.

## Expected Output

```text
Petrol engine started
Car started successfully.
Error: Car is already running
Petrol engine stopped
Car stopped successfully.
Error: Car is already stopped
```

## Design Takeaway

Choose between user-facing messages and exceptions based on how the caller should respond. Exceptions are useful when calling code needs to detect and handle an operation that could not proceed.
