# Method Overriding & super Keyword

## Problem

1. Create a parent class `Appliance` with a `turnOn()` method that prints `Appliance is starting...`.
2. Create a child class `WashingMachine` that extends `Appliance`.
3. Override the `turnOn()` method in `WashingMachine`.
4. Use the `super` keyword to call the parent class's `turnOn()` method first, then print `Washing Machine is washing clothes...`.
5. Create a `WashingMachine` object in the main class and call `turnOn()`.

## Key Learning

- **Inheritance:** `WashingMachine` inherits from `Appliance`.
- **Method Overriding:** The child class provides its own implementation of `turnOn()`.
- **super:** Used to access the parent class implementation of an overridden method.
- The child can extend the parent behavior by calling `super.turnOn()` before its own logic.

## Output

```text
Appliance is starting...
Washing Machine is washing clothes...
```

## Status

- Phase: Phase 03
- Topic: Method Overriding & super Keyword
- Problem: Solved
- Status: Completed
