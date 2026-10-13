# Lesson 2 — Dependency Injection (DI)

## Implementation

The `ShoppingApp` receives a `Payment` implementation through its constructor instead of creating a concrete payment object itself.

## Key Concepts

- **Abstraction:** `ShoppingApp` depends on the `Payment` interface.
- **Dependency Injection:** The caller creates `UpiPayment` and passes it to `ShoppingApp`.
- **Constructor Injection:** The dependency is provided through `ShoppingApp(Payment payment)`.
- **Flexibility:** The caller can pass `CardPayment` instead of `UpiPayment` without changing `ShoppingApp`.

## Output

```text
UPI payment successful
```

## Status

- Phase: Phase 07 — Java OOP Design Principles
- Lesson: 02 — Dependency Injection
- Implementation: Added
- Status: Recorded
