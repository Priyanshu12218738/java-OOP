# Lesson 9 — Constructor Validation & Defensive Copy

**Phase:** 6 — Notification System  
**Status:** ✅ Passed — 10/10

## Objective
Protect NotificationService from invalid dependency collections and unintended external modification.

## Validation
The constructor checks:
- The supplied list is not null.
- The list is not empty.
- No element inside the list is null.

## Defensive Copy
Create a new list from the supplied list (for example, `new ArrayList<>(notifications)`) so later changes to the caller's original list do not change the service's internal collection.

## Review
Constructor validation and defensive-copy reasoning passed with **10/10**. The field name should remain consistent with the constructor parameter and service logic.

## Learning Outcome
Validate dependencies at construction time and protect internal state from external mutation.
