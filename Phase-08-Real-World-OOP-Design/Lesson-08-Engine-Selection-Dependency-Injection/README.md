# Phase 8 — Lesson 8: Engine Selection + Dependency Injection

## Goal

Implement engine selection in the console-based Car System. The user chooses Petrol, Diesel, or Electric, and Main creates the selected engine and injects it into Car through the constructor.

## 1. Why Do We Need Engine Selection?

When we write:

```java
Car car = new Car(new DieselEngine());
```

the engine type is hard-coded. The user cannot choose which engine the car should use.

We want to:
- Let the user select an engine.
- Let Main create the selected engine object.
- Pass that object to Car through its constructor.
- Keep Car independent of concrete engine classes.

This is a practical example of **Dependency Injection (DI)** and **Programming to an Interface**.

## 2. Engine Selection Flow

1. **Main:** Reads the user's engine choice.
2. **Selected implementation:** Creates a PetrolEngine, DieselEngine, or ElectricEngine.
3. **Car:** Receives the selected object through its Engine constructor parameter.

```text
User input
    |
    v
Main reads engine choice
    |
    v
Creates selected Engine implementation
    |
    v
Passes Engine to Car constructor
    |
    v
Car uses the Engine interface
```

## 3. Create the Selected Engine

Use this logic inside Main after reading the user's engine choice:

```java
Engine engine = null;

switch (choice) {
    case 1:
        engine = new PetrolEngine();
        break;

    case 2:
        engine = new DieselEngine();
        break;

    case 3:
        engine = new ElectricEngine();
        break;

    default:
        System.out.println("Invalid engine choice");
}
```

### Code Explanation

- Engine engine = null; — declares a reference using the common interface type.
- new PetrolEngine() — creates a PetrolEngine object.
- engine = ... — assigns the selected implementation object to the interface reference.
- break — exits the current switch case.
- default — handles an invalid selection.

**Important:** If the selection is invalid, engine remains null. Do not call new Car(engine) until you have confirmed that a valid engine was selected.

## 4. Inject the Engine into Car

After a valid engine has been selected:

```java
Car car = new Car(engine);
```

The Car class should depend on the Engine interface, not on PetrolEngine, DieselEngine, or ElectricEngine directly.

Do not create a concrete engine inside Car, for example:

```java
// Avoid this inside Car:
this.engine = new DieselEngine();
```

That would hard-code the implementation and remove the benefit of constructor injection.

## 5. Key OOP Concepts

| Concept | How this lesson uses it |
|---|---|
| Abstraction | Engine defines the common contract. |
| Polymorphism | The Engine reference can refer to any supported engine implementation. |
| Dependency Injection | Main passes the selected engine to Car. |
| Programming to an Interface | Car uses the Engine type rather than a concrete class. |
| Separation of Responsibilities | Main handles selection; Car handles car operations. |

## 6. Implementation Checklist

- [ ] Display Petrol, Diesel, and Electric engine options.
- [ ] Read the user's engine choice.
- [ ] Create the selected implementation using a switch statement.
- [ ] Handle invalid input without constructing a Car with a null engine.
- [ ] Pass the selected engine to the Car constructor.
- [ ] Create the Car object once, before the menu loop.
- [ ] Keep the same Car instance while the user starts and stops it.

## Important Design Rule

**Main chooses and creates the dependency. Car receives and uses the dependency.**

This keeps the Car class loosely coupled and makes it easier to add another engine implementation later without changing the car's constructor or internal logic.
