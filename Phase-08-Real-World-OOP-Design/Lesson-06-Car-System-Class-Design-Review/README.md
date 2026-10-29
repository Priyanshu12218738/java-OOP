# Phase 8 — Lesson 6: Car System Class Design Review

## 1. Why Review the Design?

The Car System has three main parts:

- **Car:** Coordinates engine operations; it should not own the engine's internal state.
- **Engine:** Defines the contract through `start()` and `stop()`.
- **PetrolEngine, DieselEngine, ElectricEngine:** Implement engine-specific behavior and manage their own running state.

Each class should have a clear responsibility. Ideally, changing engine behavior should not require changing `Car`.

## 2. Common Design Mistake: Depending on a Concrete Class

A tightly coupled design might look like this:

```java
public class Car {
    private final DieselEngine engine = new DieselEngine();

    public void startCar() {
        engine.start();
    }
}
```

Here, `Car` directly depends on `DieselEngine`. Switching to an electric engine would require changing `Car`.

### Better Design: Depend on the Interface

See [Car.java](Car.java).

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
        engine.start();
    }
}
```

This design demonstrates:

- **Composition:** A `Car` has an `Engine`.
- **Dependency Injection:** The engine is provided through the constructor.
- **Dependency Inversion Principle (DIP):** `Car` depends on the `Engine` abstraction.
- **Open/Closed Principle (OCP):** New compatible engine implementations can be added without changing `Car`'s source code.

## 3. Where Should State Live?

An engine implementation can own its running state:

```java
private boolean running = false;
```

That is appropriate when the engine is responsible for tracking whether it has started or stopped.

If `Car` also keeps its own independent `running` field, the two values can become inconsistent. For example, the car could report that it is running while the engine is stopped.

For this simple project, **the engine owns engine-running state, and the car sends commands**. A larger system may expose engine status through the interface or a dedicated state model, with one clearly defined source of truth.

## 4. Design Review Checklist

- [ ] Does `Car` depend on `Engine`, not a concrete engine class?
- [ ] Is the engine supplied through constructor injection?
- [ ] Does the constructor reject a null engine?
- [ ] Does each engine implementation own its engine-specific behavior and state?
- [ ] Is duplicate state avoided unless its synchronization is explicitly designed?
- [ ] Can a new `Engine` implementation be used without modifying `Car`?

## Files

- [Engine.java](Engine.java)
- [PetrolEngine.java](PetrolEngine.java)
- [DieselEngine.java](DieselEngine.java)
- [ElectricEngine.java](ElectricEngine.java)
- [Car.java](Car.java)
- [Main.java](Main.java)

## Key Takeaway

Give each class one clear responsibility, depend on abstractions, and define a single source of truth for state. These choices make the system easier to extend and maintain.
