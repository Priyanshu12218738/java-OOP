# Phase 8 — Lesson 11: Engine State Management & Edge Cases

## Goal

Handle invalid engine actions correctly and ensure the Car reports success only when the engine state actually changes.

## 1. Engine State

The engine has two possible states:

- `running = false` — the engine is stopped.
- `running = true` — the engine is running.

A basic implementation prevents duplicate start and stop operations:

```java
private boolean running = false;

public void start() {
    if (running) {
        System.out.println("Engine is already running");
        return;
    }

    running = true;
    System.out.println("Engine started");
}

public void stop() {
    if (!running) {
        System.out.println("Engine is already stopped");
        return;
    }

    running = false;
    System.out.println("Engine stopped");
}
```

The guard conditions prevent invalid state transitions.

## 2. State Transitions

| Current state | Action | New state | Result |
|---|---|---|---|
| Stopped | `start()` | Running | Engine started |
| Running | `start()` | Running | Already running |
| Running | `stop()` | Stopped | Engine stopped |
| Stopped | `stop()` | Stopped | Already stopped |

Example:

```java
engine.start();
engine.start();
engine.stop();
engine.stop();
```

Expected output:

```text
Engine started
Engine is already running
Engine stopped
Engine is already stopped
```

## 3. The Design Problem in Car

A previous implementation may look like this:

```java
void startCar() {
    engine.start();
    System.out.println("Car is ready");
}
```

The problem is that the engine might already be running. In that case, the engine does not perform a new state transition, but the Car still prints a success message.

The Car needs to know whether the requested operation succeeded.

## 4. Update the Engine Interface to Return boolean

Change the interface so that both operations report whether the state changed:

```java
interface Engine {
    boolean start();
    boolean stop();
}
```

- `true` — the requested state transition succeeded.
- `false` — the engine was already in the requested state, so no transition occurred.

**Important:** Changing the interface requires every implementation — PetrolEngine, DieselEngine, and ElectricEngine — to update both method signatures and return values.

## 5. DieselEngine.java

```java
class DieselEngine implements Engine {

    private boolean running = false;

    @Override
    public boolean start() {
        if (running) {
            System.out.println("Engine is already running");
            return false;
        }

        running = true;
        System.out.println("Diesel engine started");
        return true;
    }

    @Override
    public boolean stop() {
        if (!running) {
            System.out.println("Engine is already stopped");
            return false;
        }

        running = false;
        System.out.println("Diesel engine stopped");
        return true;
    }
}
```

## 6. Car.java

```java
class Car {

    private final Engine engine;

    Car(Engine engine) {
        if (engine == null) {
            throw new IllegalArgumentException("Engine cannot be null");
        }

        this.engine = engine;
    }

    void startCar() {
        if (engine.start()) {
            System.out.println("Car is ready");
        }
    }

    void stopCar() {
        if (engine.stop()) {
            System.out.println("Car has stopped");
        }
    }
}
```

The Car prints its success message only when the engine returns `true`.

## 7. Main.java

```java
public class Main {
    public static void main(String[] args) {

        Engine engine = new DieselEngine();

        Car car = new Car(engine);

        car.startCar();
        car.startCar();

        car.stopCar();
        car.stopCar();
    }
}
```

Expected output:

```text
Diesel engine started
Car is ready
Engine is already running
Diesel engine stopped
Car has stopped
Engine is already stopped
```

## 8. Update All Engine Implementations

PetrolEngine and ElectricEngine must also implement the updated interface:

- Change `void start()` to `boolean start()`.
- Change `void stop()` to `boolean stop()`.
- Return `false` when the engine is already running or already stopped.
- Return `true` only after changing the running state.
- Keep engine-specific messages in the concrete implementation.

## 9. Implementation Checklist

- [ ] Update the Engine interface to return boolean from start and stop.
- [ ] Update PetrolEngine to implement the new contract.
- [ ] Update DieselEngine to implement the new contract.
- [ ] Update ElectricEngine to implement the new contract.
- [ ] Return false for duplicate start and stop requests.
- [ ] Return true only when the state changes.
- [ ] Update Car to print success messages only when the engine operation returns true.
- [ ] Test start twice, then stop twice.
- [ ] Confirm the output matches the expected behavior.

## Key Design Rule

**The engine owns its running state and reports whether a transition occurred. The Car coordinates the operation and reports success only when the engine confirms it.**

This avoids misleading success messages and keeps state-transition responsibility inside the engine implementation.
