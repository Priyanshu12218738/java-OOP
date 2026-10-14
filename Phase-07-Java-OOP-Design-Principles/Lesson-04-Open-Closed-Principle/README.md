# Lesson 4 — Open/Closed Principle (OCP)

## Core Idea

The Open/Closed Principle is the “O” in SOLID:

> Software entities should be open for extension, but closed for modification.

- **Open for extension:** New behavior can be added.
- **Closed for modification:** Stable existing logic should not need repeated edits whenever a new variation is introduced.

This does not mean existing code can never be changed. It means the design should minimize changes to stable code when adding new variations.

## Without an OCP-Friendly Design

A `PaymentService` uses a payment-type string and an `if` statement. Every new payment type may require editing this service and adding more conditions.

## With an OCP-Friendly Design

- `Payment` defines a common interface.
- `UpiPayment`, `CardPayment`, and `WalletPayment` provide separate implementations.
- `PaymentService` accepts the abstraction `Payment` and calls `pay()`.

To add another payment type, create a new class that implements `Payment`. The service's processing logic can remain unchanged.

## Comparison

| Without OCP-Friendly Design | With OCP-Friendly Design |
|---|---|
| New payment types may require editing `if-else` logic | Add a new `Payment` implementation |
| Main logic knows payment type strings | Main logic depends on the `Payment` interface |
| More risk of affecting existing conditions | Existing service logic can remain stable |
| Payment behavior is centralized in conditional logic | Each payment class owns its behavior |

## Important Connection

This example uses an interface and passes a `Payment` implementation to the service. That is also a form of dependency injection. An interface alone does not guarantee OCP; the overall design determines whether extensions can be added without repeatedly modifying stable logic.

## Output

```text
Paying through UPI
Paying through Card
Paying through Wallet
```

## Status

- Phase: Phase 07 — Java OOP Design Principles
- Lesson: 04 — Open/Closed Principle
- Examples: Conditional design and extensible design added
- Status: Recorded
