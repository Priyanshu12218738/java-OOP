# Lesson 2 — EmailNotification & SMSNotification

**Phase:** 6 — Notification System  
**Status:** ✅ Explained

## Objective
Implement two concrete notification channels using the shared Notification interface.

## Implementation
Create:
- `EmailNotification` implementing Notification.
- `SMSNotification` implementing Notification.

Each class provides its own sending behaviour while keeping the same interface contract.

## Concepts
- Interface implementation.
- Method overriding.
- Polymorphic use through a Notification reference.

## Practice
Create both classes and call their send operation through the interface. Keep channel-specific behaviour inside each implementation.
