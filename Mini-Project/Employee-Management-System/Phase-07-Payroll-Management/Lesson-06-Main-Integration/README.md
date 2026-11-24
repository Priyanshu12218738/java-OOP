# Lesson 6 — Main.java Payroll Integration

**Phase:** 7 — Payroll Management  
**Status:** ✅ Output passed

## Objective
Connect EmployeeService, SalaryCalculator, and PayrollService in the application entry point.

## Integration Evidence
The submitted output displayed three payroll records:

| Employee ID | Salary | Payroll Date |
|---:|---:|---|
| 101 | 30000.0 | 2026-11-24 |
| 102 | 32000.0 | 2026-11-24 |
| 103 | 10000.0 | 2026-11-24 |

## Review
The integration output was accepted. PayrollService reused SalaryCalculator and displayed records for the three employee types.

## Learning Outcome
The existing employee and salary modules can be composed to perform payroll processing.
