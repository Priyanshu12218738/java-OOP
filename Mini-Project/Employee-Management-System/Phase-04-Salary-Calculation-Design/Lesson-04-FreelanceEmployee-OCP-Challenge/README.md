# Lesson 4 — FreelanceEmployee & OCP Challenge

**Phase:** 4 — Salary Calculation Design  
**Status:** ✅ Complete — 10/10

## Objective
Extend the salary model with a new employee type without modifying the existing salary-calculation service.

## Concepts
- Open/Closed Principle (OCP): extend behaviour through new implementations rather than repeatedly editing stable code.
- Polymorphism: the calculator works with the Employee abstraction.
- Salary calculation remains separate from employee-specific salary rules.

## Implementation Task
Create `FreelanceEmployee` as an Employee subtype. Store the hourly rate and hours worked, then override `calculateSalary()` to return:

`hourlyRate * hoursWorked`

Pass the new employee to the existing `SalaryCalculator`. The calculator should not need a FreelanceEmployee-specific condition.

## Reviewed Result
- Freelance calculation: 500 × 40 = **20000.0**.
- Existing SalaryCalculator remained unchanged.
- The challenge was reviewed and passed with **10/10**.

## Learning Outcome
A new employee subtype can be introduced through the existing abstraction without changing the calculator.
