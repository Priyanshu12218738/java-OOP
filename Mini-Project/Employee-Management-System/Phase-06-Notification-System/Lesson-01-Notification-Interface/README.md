# Lesson 1 — Notification Interface & SRP

**Phase:** 6 — Notification System  
**Status:** ✅ Passed

## Objective
Define a common abstraction for sending notifications through different channels.

## Design
Create a `Notification` interface with a notification operation (for example, `send(String message)`). The interface describes what a notification channel does, not how a specific channel sends it.

## Concepts
- Interface-based abstraction.
- Single Responsibility Principle: notification sending is separate from employee and payroll responsibilities.
- Future channels can implement the same contract.

## Review
The interface design and SRP reasoning passed with **10/10**.

## Learning Outcome
Client code can work with the Notification abstraction instead of depending on one concrete channel.
