# Phase 8 — Lesson 12: Refactor Car System Using SOLID Principles

## Goal

Review the Car System from a professional software-design perspective and understand how SOLID principles, dependency injection, and composition improve maintainability and extensibility.

## 1. SRP — Single Responsibility Principle

**Meaning:** A class should have one clear responsibility and one focused reason to change.

| Class | Responsibility |
|---|---|
| `Car` | Coordinates car operations |
| `DieselEngine` | Implements diesel engine behavior |
| `PetrolEngine` | Implements petrol engine behavior |
| `ElectricEngine` | Implements electric engine behavior |
| `Main` | Handles user input and application flow |

If the `Car` class also handled console input, engine selection, and menu navigation, it would have multiple responsibilities.

Keep user interaction in `Main`, car coordination in `Car`, and engine-specific behavior in the concrete engine classes.

## 2. OCP — Open/Closed Principle

**Meaning:** Software entities should be open for extension but closed for modification.

Suppose a new `HybridEngine` is required:

```java
class HybridEngine implements Engine {

    @Override
    public boolean start() {
        System.out.println("Hybrid engine started");
        return true;
    }

    @Override
    public boolean stop() {
        System.out.println("Hybrid engine stopped");
        return true;
    }
}
```

It can be supplied to the existing Car class:

```java
Engine engine = new HybridEngine();
Car car = new Car(engine);
```

The `Car` class does not need to know about the new concrete class, provided `HybridEngine` correctly implements the existing `Engine` contract.

**Note:** This example demonstrates extensibility at the Car level. The application’s engine-selection code or menu may still need updating to let users choose Hybrid.

## 3. DIP — Dependency Inversion Principle

**Meaning:** High-level modules should depend on abstractions, not concrete implementations.

The `Car` class should hold an `Engine` reference:

```java
private final Engine engine;
```

Instead of depending directly on a concrete class:

```java
private final DieselEngine engine;
```

Because Car depends on the abstraction, it can work with different engine implementations without being coupled to one specific engine type.

## 4. DI — Dependency Injection

Dependency Injection is a technique for providing an object's dependencies from outside rather than creating them inside that object.

For example:

```java
Car car = new Car(new DieselEngine());
```

The caller creates the engine and passes it to the Car constructor. Car receives the dependency; it does not construct its own DieselEngine.

This is **constructor injection**.

## 5. Composition — Car HAS-A Engine

The Car class contains a reference to an Engine:

```java
class Car {
    private final Engine engine;

    Car(Engine engine) {
        if (engine == null) {
            throw new IllegalArgumentException("Engine cannot be null");
        }

        this.engine = engine;
    }
}
```

This represents a HAS-A relationship: a Car has an Engine and delegates engine-specific operations to it.

Composition favors building behavior by combining objects rather than inheriting implementation from a concrete engine class.

## 6. How the Concepts Work Together

| Concept | Application in the Car System |
|---|---|
| SRP | Main, Car, and engine classes have focused responsibilities. |
| OCP | New Engine implementations can be added without changing Car. |
| DIP | Car depends on the Engine abstraction. |
| DI | The selected Engine is supplied through the Car constructor. |
| Composition | Car contains and delegates to an Engine reference. |

## 7. Design Flow

```text
Main
  |
  | selects and creates an implementation
  v
Engine implementation
  |
  | injected through constructor
  v
Car
  |
  | delegates engine operations
  v
Engine interface contract
```

## 8. Refactoring Checklist

- [ ] Keep console input and menu handling in Main.
- [ ] Keep car-level coordination in Car.
- [ ] Keep engine-specific behavior in each concrete engine.
- [ ] Make Car depend on the Engine interface, not a concrete engine class.
- [ ] Inject Engine through the Car constructor.
- [ ] Ensure every engine implementation follows the same Engine contract.
- [ ] Add a HybridEngine implementation without changing Car.
- [ ] Verify that existing Petrol, Diesel, and Electric behavior still works.

## Key Design Rule

**Keep responsibilities focused, depend on abstractions, inject dependencies from outside, and extend behavior through implementations of the Engine interface.**

These design choices make the Car System easier to extend, test, and maintain.
