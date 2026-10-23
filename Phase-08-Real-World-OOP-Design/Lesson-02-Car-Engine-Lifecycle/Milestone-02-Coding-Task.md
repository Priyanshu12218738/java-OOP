# Milestone 2 — Car Engine Lifecycle Coding Task

## Step 1 — Why Should Engine Define Both Methods?

If `Car` can call `start()` on an engine but there is no common method to stop it, the car cannot control different engine implementations consistently.

Define both operations in the interface:

```java
public interface Engine {
    void start();

    void stop();
}
```

Every implementation, such as `PetrolEngine`, `DieselEngine`, and `ElectricEngine`, must implement both methods.

**Remember:** An interface defines what an object can do; an implementation defines how it does it.

## Step 2 — What Is Car Responsible For?

The `Car` class should coordinate its engine by calling methods through the `Engine` interface. It should not manage engine internals, create a new engine every time a method is called, or branch on concrete engine types.

Polymorphism allows the same `Car` code to work with different engine implementations.

## Milestone Checklist

Choose your design decisions before coding.

### 1. Engine Interface

- [ ] Only `start()`
- [ ] Both `start()` and `stop()`

### 2. Car Responsibility

- [ ] `startCar()` calls `start()` on its injected engine.
- [ ] `startCar()` creates a new engine every time.
- [ ] `Car` checks the engine type and writes separate logic for each type.

### 3. Testing Strategy

- [ ] Test only `PetrolEngine`.
- [ ] Test both `PetrolEngine` and `DieselEngine` with the same `Car` class.

### 4. Implement the Code

Write these classes yourself:

- `Engine` — declares `start()` and `stop()`.
- `PetrolEngine` — implements both operations.
- `DieselEngine` — implements both operations.
- `Car` — receives an `Engine` through its constructor and provides `startCar()` and `stopCar()`.
- `Main` — tests both engine types using the same `Car` class.

## Completion Criteria

- Both engine classes implement the complete interface.
- `Car` does not depend directly on `PetrolEngine` or `DieselEngine`.
- The engine is injected through the constructor.
- Both engine types can be started and stopped through the same `Car` API.
- The code compiles and runs successfully.

**Challenge rule:** Try implementing this milestone without copying the lesson solution. Submit your code for review when ready.
