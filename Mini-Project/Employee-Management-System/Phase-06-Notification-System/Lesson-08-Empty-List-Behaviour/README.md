# Lesson 8 — Empty List vs Null List Behaviour

**Phase:** 6 — Notification System  
**Status:** 🟡 Concept correction explained

## Objective
Distinguish an empty collection from a null reference when NotificationService processes channels.

## Behaviour
- An empty list contains zero elements; a loop runs zero times and sends no notifications.
- A null list is not a collection; iterating it causes a NullPointerException.
- A null element inside a non-null list causes a failure when the service invokes a method on that element.

## Design Consideration
Decide whether an empty channel list is valid. Validate a null list and null elements at the service boundary if they are not allowed.

## Review
The behavioural distinctions were explained and corrected during the lesson.
