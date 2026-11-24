# Lesson 5 — Display Payroll Records

**Phase:** 7 — Payroll Management  
**Status:** 🟡 Solution walkthrough

## Objective
Display the payroll records maintained by PayrollService.

## Behaviour
- If the payroll list is empty, display a clear no-records message.
- Otherwise, iterate through the records.
- Display employee ID, salary, and payroll date for each record.

## Encapsulation
Keep the internal list private. Expose a read-only view or a service method for displaying records rather than allowing callers to modify the internal collection directly.

## Evidence & Practice
The display flow was explained, but independent implementation is not evidenced. Implement it and test both empty and populated payroll lists.
