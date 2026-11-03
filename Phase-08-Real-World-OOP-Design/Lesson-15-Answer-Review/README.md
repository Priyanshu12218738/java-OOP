# Phase 8 — Lesson 15: Answer Review

## Goal

Review the engine-state edge case where the user requests an operation that would not change the current state. This lesson confirms the expected behavior and provides a practical test sequence.

## 1. Engine State

The engine starts in the stopped state:

```java
private boolean running = false;
```

When `stop()` is called while the engine is already stopped:

```java
if (!running) {
    System.out.println("Engine already stopped");
    return false;
}
```

Because `running` is `false`, the expression `!running` evaluates to `true`, so this condition executes.

## 2. What Does the Method Return?

The method returns:

```java
return false;
```

This means the requested state transition did not occur. The engine was already stopped, so its state remains unchanged.

## 3. What Happens in the Car Class?

Consider this method:

```java
public void stopCar() {
    if (engine.stop()) {
        System.out.println("Car has stopped");
    }
}
```

When `engine.stop()` returns `false`, the `if` condition is false and `Car` does not print `Car has stopped`.

Expected output for this call:

```text
Engine already stopped
```

### Important Return-Type Clarification

`Car.stopCar()` does not return `false`; its return type is `void`. The boolean value comes from `engine.stop()`. The Car method checks that value to decide whether to print its success message.

## 4. Error or Valid Edge Case?

This is a valid edge case, not an exceptional failure:

- No exception is thrown.
- The program does not crash.
- The engine remains in a valid state.
- The user receives a meaningful message.

This is an example of defensive programming: the implementation checks the current state before attempting a transition.

## 5. Practical Testing Code

Use a simple Main class to test the sequence:

```java
public class Main {
    public static void main(String[] args) {

        Engine engine = new DieselEngine();
        Car car = new Car(engine);

        car.stopCar();  // Already stopped
        car.startCar(); // Starts
        car.startCar(); // Already running
        car.stopCar();  // Stops
        car.stopCar();  // Already stopped
    }
}
```

Expected output:

```text
Engine already stopped
Diesel engine started
Car is ready
Engine already running
Diesel engine stopped
Car has stopped
Engine already stopped
```

## 6. Review Checklist

- [ ] Confirm the initial engine state is stopped.
- [ ] Verify that calling stop on a stopped engine returns false.
- [ ] Verify that Car does not print its success message after a failed state transition.
- [ ] Verify that starting a stopped engine changes its state.
- [ ] Verify that starting an already-running engine does not change its state.
- [ ] Verify that stopping a running engine changes its state.
- [ ] Verify that stopping an already-stopped engine does not change its state.
- [ ] Confirm that these repeated actions are handled without exceptions.

## Key Takeaway

**A repeated start or stop request is a valid edge case. The Engine reports whether its state changed, and Car prints a success message only when the Engine confirms the transition.**
