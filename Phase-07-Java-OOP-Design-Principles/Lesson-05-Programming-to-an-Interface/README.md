# Lesson 5 — Programming to an Interface

## Why This Principle Exists

If a notification service directly depends on `EmailSender`, adding SMS or WhatsApp may require changing the service. Programming to an interface means depending on a stable contract describing what an object can do rather than coupling calling code to one concrete implementation.

## Concrete-Class Dependency

See [ConcreteClassDependencyExample.java](ConcreteClassDependencyExample.java). The service creates an `EmailSender` itself, coupling it to that implementation.

## Interface-Based Design

See [ProgrammingToInterfaceExample.java](ProgrammingToInterfaceExample.java).

- `MessageSender` defines the common contract.
- `EmailSender` and `SmsSender` implement that contract.
- `NotificationService` receives a `MessageSender` through constructor injection.
- `sender.send()` invokes the actual object's implementation through polymorphism.

A future `WhatsAppSender` can implement `MessageSender` without changing notification logic.

## How the Concepts Connect

- **Programming to an Interface:** depend on the `MessageSender` contract.
- **DIP:** high-level policy depends on an abstraction rather than a concrete implementation.
- **DI:** supply the sender from outside, here through constructor injection.
- **Composition:** the service holds a sender reference and delegates work to it.
- **OCP:** new implementations can often be added without modifying existing service logic.

These ideas complement one another but are not interchangeable. An interface or constructor injection alone does not automatically guarantee a well-designed SOLID system.

## Interview-Ready Answer

“Programming to an interface means that code depends on an abstraction or contract rather than a concrete implementation. This reduces coupling and makes implementations easier to replace, test, and extend.”
