# Lesson 1 — Coupling and Cohesion

## Goal
Understand tight coupling and loose coupling through a shopping checkout example.

## Tight Coupling — Inflexible Code
In the tight-coupling example, `ShoppingApp` directly creates a `UpiPayment` object. This makes the app depend on a specific payment implementation and makes switching payment methods harder.

## Loose Coupling — Flexible Code
In the loose-coupling example, `ShoppingApp` depends on the `Payment` interface and receives its implementation through its constructor. The caller can provide `UpiPayment` or `CardPayment` without changing the checkout class.

## Key Concepts
- **Coupling:** How strongly one class depends on another.
- **Tight coupling:** A class depends directly on a concrete implementation.
- **Loose coupling:** A class depends on an abstraction, such as an interface.
- **Cohesion:** How closely the responsibilities within a class relate to one another. These examples primarily demonstrate coupling; cohesion should also be evaluated when designing class responsibilities.
- **Dependency injection:** Supplying a dependency from outside, as shown by `ShoppingApp(Payment payment)`.

## Example Output
Tight coupling:
```text
UPI payment successful
```

Loose coupling (with `new UpiPayment()`):
```text
UPI payment successful
```

## Status
- Phase: Phase 07 — Java OOP Design Principles
- Lesson: 01 — Coupling and Cohesion
- Examples: Tight coupling and loose coupling added
- Status: Recorded
