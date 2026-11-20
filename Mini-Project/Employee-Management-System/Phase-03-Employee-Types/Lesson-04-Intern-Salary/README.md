# Lesson 4 — Intern Employee Salary

**Status:** 🟡 Mostly correct; validation pending

## Objective
Calculate intern salary using a fixed monthly stipend.

The submitted class:
- Extends `Employee`.
- Stores `monthlyStipend` as a private field.
- Calls the parent constructor with `super(...)`.
- Overrides `calculateSalary()` to return the stipend.

The learner correctly answered that a private field cannot be accessed directly from outside its declaring class.

## Pending correction
The submitted constructor did not yet reject a negative stipend. Add validation before assigning the field:
```java
if (monthlyStipend < 0) {
    throw new IllegalArgumentException("Stipend cannot be negative");
}
```
The export rated the implementation 9/10 and explicitly identified this missing validation.
