# Lesson 7 — Dependency Inversion Principle (DIP)

## Why DIP Is Needed

If `NotificationService` creates an `EmailSender` directly, the high-level notification logic becomes tied to a specific low-level implementation. Switching to SMS can require modifying the service.

## Principle

The Dependency Inversion Principle states:

1. High-level modules should not depend directly on low-level modules. Both should depend on abstractions.
2. Abstractions should not depend on implementation details. Implementations should follow the abstraction's contract.

In this example:
- **High-level module:** `NotificationService` — decides when to send a notification.
- **Low-level modules:** `EmailSender` and `SmsSender` — implement how messages are sent.
- **Abstraction:** `MessageSender` interface.

## Improved Design

`NotificationService` depends on the `MessageSender` interface and receives a sender through its constructor. To use SMS instead of email, pass `new SmsSender()` from the calling code; `NotificationService` remains unchanged.

## DIP vs. Dependency Injection (DI)

- **DIP:** A design principle that structures dependencies around abstractions.
- **DI:** A technique for supplying a dependency from outside a class.
- This example uses both: `MessageSender` is the abstraction, and constructor injection supplies the implementation.

## Output

```text
Email sent
```

If `new SmsSender()` is passed instead, the output is:

```text
SMS sent
```

## Status

- Phase: Phase 07 — Java OOP Design Principles
- Lesson: 07 — Dependency Inversion Principle
- Violation and improved examples: Added
- Status: Recorded
