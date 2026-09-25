# Object Relationships (Composition - Strong HAS-A)

## Problem

Create an `Engine` class with a `startEngine()` method. Create a `Car` class that contains an `Engine` object and uses it inside its `drive()` method. Then create only a `Car` object in the main class and call `drive()`.

## Solution

The `Car` class contains an `Engine` object:

```java
Engine e = new Engine();
```

This represents a **HAS-A** relationship: a `Car` has an `Engine`.

The `drive()` method first starts the engine and then prints that the car is moving.

## Key Learning

- **Composition:** A strong HAS-A relationship between objects.
- `Car` contains an `Engine` object.
- `Car` uses the `Engine` object's behavior through `e.startEngine()`.
- The main class only needs to create a `Car` object.

## Output

```text
Engine is starting...
Car is moving...
```

## Status

- Phase: Phase 02
- Topic: Object Relationships — Composition
- Problem: Solved
- Status: Completed
