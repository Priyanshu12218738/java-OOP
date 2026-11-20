# Lesson 3 — Permanent and Contract Employee Salary

**Status:** 🟡 Passed with correction noted

## Permanent employee
Salary formula: monthly salary.

The submitted `PermanentEmployee` implementation used a private `monthlySalary` field, initialized it in the constructor, and overrode `calculateSalary()` to return it. Reviewed **10/10**.

## Contract employee
Salary formula: working hours × hourly rate.

The submitted `ContractEmployee` implementation correctly stored private `workingHours` and `hourlyRate` fields and returned their product from `calculateSalary()`.

## Correction required
The first validation used:
```java
if (workingHours < 0 && hourlyRate < 0)
```
It must use `||` so either negative value is rejected:
```java
if (workingHours < 0 || hourlyRate < 0) {
    throw new IllegalArgumentException("Salary and hours cannot be negative");
}
```
The learner correctly answered the validation question. Status was recorded as passed (9/10), with the code correction explicitly left to apply.
