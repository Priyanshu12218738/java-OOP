# Lesson 3 — Liskov Substitution Principle (LSP)

## Why LSP Is Needed

If `Penguin` extends a `Bird` class that promises a `fly()` behavior, but its override throws an exception, code that expects a flyable bird can fail when given a penguin. The subtype violates the behavior callers expect from the parent type.

## Principle

The Liskov Substitution Principle is the “L” in SOLID:

> Objects of a subtype should be usable in place of objects of their base type without breaking the program's expected behavior.

Subtypes should respect the meaningful behavioral contract of their parent type.

## Improved Design

- `Bird` defines behavior common to birds: `eat()`.
- `FlyingBird` extends `Bird` and adds `fly()`.
- `Sparrow` implements `FlyingBird`.
- `Penguin` implements only `Bird`.
- `FlightService` accepts a `FlyingBird`, so it only accepts objects that promise flying behavior.

This avoids requiring a penguin to implement an inappropriate flying behavior.

## OCP vs. LSP

| Principle | Main Question |
|---|---|
| Open/Closed Principle (OCP) | Can new behavior be added without repeatedly modifying stable existing code? |
| Liskov Substitution Principle (LSP) | Can a subtype replace its parent type without violating expected behavior? |

Both principles support maintainable designs, but they solve different problems.

## Output for Improved Example

```text
Sparrow flies
Penguin eats
```

## Status

- Phase: Phase 07 — Java OOP Design Principles
- Lesson: 03 — Liskov Substitution Principle
- Examples: LSP violation and improved design added
- Status: Recorded
