# Lesson 4 — NotificationService & DIP

**Phase:** 6 — Notification System  
**Status:** ✅ Passed — 10/10

## Objective
Create a service that sends notifications without depending on a specific channel class.

## Design
NotificationService receives a Notification dependency through its constructor and invokes the interface operation.

## Concepts
- Dependency Inversion Principle.
- Constructor injection.
- Programming to an interface.
- Low coupling between service and channel implementation.

## Review
The service design and DIP explanation passed with **10/10**.

## Learning Outcome
NotificationService can work with Email, SMS, WhatsApp, or another implementation without channel-specific branches.
