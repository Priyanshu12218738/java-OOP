# Phase 8 — Lesson 4: Validation and Error Handling in the Car System

## 1. Why Do We Need Validation?

Consider:

```java
Car car = new Car(null);
```

If the car receives no engine and later calls `engine.start()`, it may cause a `NullPointerException`. Validation identifies invalid input early, when the object is being created.

## 2. Validate the Constructor Argument

See [Car.java](Car.java).

The constructor checks whether the supplied engine is `null`. If it is, the constructor throws `IllegalArgumentException` before assigning the field. This prevents creating a `Car` with a missing engine dependency.

## 3. Validation vs. Exceptions

| Concept | Meaning |
|---|---|
| Validation | Check whether input or state is valid |
| Throwing an exception | Report an invalid or exceptional situation to the caller |
| Catching an exception | Handle an exception that was thrown |

Example:

```java
try {
    Car car = new Car(null);
} catch (IllegalArgumentException e) {
    System.out.println(e.getMessage());
}
```

Expected output:

```text
Engine cannot be null
```

The constructor throws the exception; the `catch` block handles it.

## 4. When Should We Use Exceptions?

Not every problem needs an exception.

- **Null engine in the constructor:** an invalid object configuration; throwing an exception is reasonable.
- **Engine already running:** depending on the design, the operation could be ignored, return a status, or throw an exception.
- **Invalid user menu option:** often better handled by displaying a message and asking for input again.

Use exceptions when the situation should be reported to the calling code as an exceptional condition, rather than using them for every normal control-flow decision.

## Files

- [Engine.java](Engine.java)
- [PetrolEngine.java](PetrolEngine.java)
- [Car.java](Car.java)
- [Main.java](Main.java)
