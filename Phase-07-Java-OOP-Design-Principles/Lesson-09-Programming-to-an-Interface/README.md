# Lesson 9 — Programming to an Interface

## Why This Principle Exists

Imagine a notification system that sends email today, SMS tomorrow, and WhatsApp messages later. If the service directly depends on `EmailSender`, adding another sender may require changing the service itself.

Programming to an interface means writing calling code against a stable contract that describes **what** an object can do, rather than coupling it to a particular concrete implementation.

## Concrete-Class Dependency

See [ConcreteClassDependencyExample.java](ConcreteClassDependencyExample.java).

In this design, `NotificationService` creates an `EmailSender` directly. This couples the service to one implementation and makes replacing the sender more difficult.

## Interface-Based Design

See [ProgrammingToInterfaceExample.java](ProgrammingToInterfaceExample.java).

- `MessageSender` defines the shared contract.
- `EmailSender` and `SmsSender` implement that contract.
- `NotificationService` accepts a `MessageSender` through its constructor.
- Calling `sender.send()` invokes the implementation belonging to the actual runtime object through polymorphism.

A future `WhatsAppSender` can implement `MessageSender` without changing the service's notification logic.

## How the Concepts Connect

- **Programming to an Interface:** depend on the `MessageSender` contract.
- **Dependency Inversion Principle (DIP):** high-level policy depends on an abstraction rather than a concrete implementation.
- **Dependency Injection (DI):** provide the sender to the service from outside, here through constructor injection.
- **Composition:** the service holds a sender reference and delegates work to it.
- **Open/Closed Principle (OCP):** new implementations can often be added without modifying the existing service logic.

These ideas complement one another, but they are not interchangeable. Using an interface or constructor injection alone does not automatically guarantee a well-designed SOLID system.

## Interview-Ready Answer

“Programming to an interface means that code depends on an abstraction or contract rather than a concrete implementation. This reduces coupling and makes implementations easier to replace, test, and extend.”
