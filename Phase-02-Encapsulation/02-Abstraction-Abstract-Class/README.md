# Abstraction (Abstract Class & Abstract Methods)

## Problem

1. Create an abstract class named `Appliance`.
2. Declare an abstract method `void turnOn();`.
3. Create a normal class `Fan` that extends `Appliance`.
4. Override `turnOn()` in the `Fan` class and print `Fan is Spinning`.
5. Create a `Fan` object in the main class and call `turnOn()`.

## Solution

The `Appliance` class defines the required behavior through the abstract `turnOn()` method without providing its implementation.

The `Fan` class extends `Appliance` and is required to provide the implementation of `turnOn()`.

## Key Learning

- **Abstract class:** A class declared with the `abstract` keyword that can define abstract methods.
- **Abstract method:** A method declared without a body; subclasses provide its implementation.
- **Inheritance:** `Fan` inherits from `Appliance` using `extends`.
- **Method overriding:** `Fan` provides its own implementation of `turnOn()`.
- An abstract method does not have a method body.

## Output

```text
Fan is Spinning
```

## Status

- Phase: Phase 02
- Topic: Abstraction (Abstract Class & Abstract Methods)
- Problem: Solved
- Status: Completed
