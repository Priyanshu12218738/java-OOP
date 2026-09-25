# Interface (The Rulebook of Java)

## Problem

1. Create an interface named `Camera`.
2. Declare the method `void takePhoto();`.
3. Create a `MobilePhone` class that implements the `Camera` interface.
4. Override `takePhoto()` in `MobilePhone` and print `Clicking a photo!`.
5. Create a `MobilePhone` object in the main class and call `takePhoto()`.

## Solution

The `Camera` interface defines a rule that implementing classes must follow. `MobilePhone` implements the interface and provides the required implementation of `takePhoto()`.

Because interface methods are public by default, the overriding method in `MobilePhone` must also be declared `public`.

## Key Learning

- **Interface:** Defines a contract/rule that implementing classes must follow.
- **implements:** Used when a class implements an interface.
- **Method overriding:** `MobilePhone` provides the implementation of `takePhoto()`.
- Interface methods are public by default.
- An overriding method cannot reduce the visibility of the method it overrides.

## Output

```text
Clicking a photo!
```

## Status

- Phase: Phase 02
- Topic: Interface
- Problem: Solved
- Status: Completed
