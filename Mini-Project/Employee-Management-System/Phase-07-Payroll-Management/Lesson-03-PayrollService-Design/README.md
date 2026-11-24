# Lesson 3 — PayrollService Design & Dependency Injection

**Phase:** 7 — Payroll Management  
**Status:** ✅ Passed — 10/10

## Objective
Design PayrollService to coordinate salary calculation and maintain payroll records.

## Dependencies
- Receive the existing SalaryCalculator through constructor injection.
- Maintain payroll records in a `List<Payroll>`.
- Use the calculator rather than duplicating salary formulas.

## Responsibility
PayrollService coordinates the workflow and stores Payroll records. SalaryCalculator remains responsible for calculating salary.

## Review
The service structure and dependency-injection design passed with **10/10**.

## Learning Outcome
Reusing SalaryCalculator keeps payroll processing consistent with the salary design from Phase 4.
