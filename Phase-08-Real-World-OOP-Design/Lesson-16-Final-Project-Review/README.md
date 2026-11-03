# Phase 8 — Lesson 16: Final Project Review

## Final Lesson of Phase 8

This lesson reviews the Java OOP concepts used throughout the Car System project and checks whether the architecture and responsibilities are understood.

## 1. Complete Car System — Architecture Revision

```text
                 Engine (Interface)
                  /      |       \
                 /       |        \
         DieselEngine PetrolEngine ElectricEngine
                 \       |        /
                  \      |       /
                       Car
                        |
                       Main
```

### Class Responsibilities

| Class | Responsibility |
|---|---|
| `Engine` | Defines the common engine contract. |
| `DieselEngine` | Implements diesel engine behavior. |
| `PetrolEngine` | Implements petrol engine behavior. |
| `ElectricEngine` | Implements electric engine behavior. |
| `Car` | Coordinates car operations and delegates engine operations. |
| `Main` | Handles user input and application execution. |

## 2. OOP Concepts Used

| Concept | Example in the Car System |
|---|---|
| Encapsulation | `private boolean running` keeps engine state private. |
| Abstraction | The `Engine` interface defines the common contract. |
| Inheritance / Interface Implementation | Concrete engine classes use `implements Engine`. |
| Polymorphism | `Engine engine = new DieselEngine();` |
| Composition | Car HAS-A Engine reference. |
| Constructor Dependency Injection | `Car(Engine engine)` receives the dependency from outside. |
| Runtime Polymorphism | Calling an overridden `start()` method through an `Engine` reference. |
| Exception Handling | `IllegalArgumentException` rejects an invalid null dependency. |

## 3. SOLID Principles Used

- **SRP — Single Responsibility Principle:** Each class has a clearly defined responsibility.
- **OCP — Open/Closed Principle:** A new engine implementation can be added without modifying the Car class, as long as it follows the Engine contract.
- **LSP — Liskov Substitution Principle:** Every Engine implementation must honor the behavior expected by the Engine contract.
- **ISP — Interface Segregation Principle:** The Engine interface contains the relevant engine operations rather than unrelated responsibilities.
- **DIP — Dependency Inversion Principle:** Car depends on the Engine abstraction instead of a concrete engine class.

## 4. Final Architecture Review Checklist

### Structure and Responsibilities
- [ ] Engine defines the common operations required by the Car.
- [ ] DieselEngine, PetrolEngine, and ElectricEngine implement the Engine contract.
- [ ] Each concrete engine owns and manages its own running state.
- [ ] Car receives an Engine through constructor injection.
- [ ] Car delegates engine operations instead of implementing engine-specific behavior.
- [ ] Main handles console input, engine selection, and the application menu.

### State and Error Handling
- [ ] Starting an already-running engine does not change its state.
- [ ] Stopping an already-stopped engine does not change its state.
- [ ] Engine methods report whether a state transition occurred.
- [ ] Car prints success messages only when the engine confirms success.
- [ ] Null engine dependencies are rejected by the Car constructor.
- [ ] Invalid menu numbers and non-numeric input are handled safely.

### Extensibility and Design
- [ ] A new engine implementation can be supplied to Car without changing Car itself.
- [ ] The concrete implementations honor the Engine contract.
- [ ] Dependencies are represented using abstractions where appropriate.
- [ ] Classes have focused responsibilities and avoid unnecessary coupling.

## 5. Final Project Questions

Use these questions to test your understanding:

1. Why does Car depend on the Engine interface instead of DieselEngine?
2. Which class should create the selected engine, and why?
3. Why should the Car object be created outside the menu loop?
4. How does runtime polymorphism select the correct engine implementation?
5. Why should an engine return `false` when it is already running and receives another start request?
6. How does constructor validation protect the Car object?
7. How can you add a HybridEngine without modifying the Car class?
8. Which responsibilities belong in Main, Car, and the concrete engine classes?
9. How does the design demonstrate SRP, OCP, LSP, ISP, and DIP?
10. What would become difficult if Car directly created a DieselEngine?

## Phase 8 Completion

Completing this review means you have revisited the core OOP design of the Car System: encapsulation, abstraction, interface implementation, polymorphism, composition, dependency injection, exception handling, and SOLID principles.

**Final design principle:** Main coordinates the application, Car coordinates car operations, and each Engine implementation owns its engine-specific behavior.
