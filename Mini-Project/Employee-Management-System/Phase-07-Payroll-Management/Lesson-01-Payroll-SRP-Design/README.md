# Lesson 1 — Payroll Responsibility & SRP Design

**Phase:** 7 — Payroll Management  
**Status:** ✅ Passed — 10/10

## Objective
Design payroll processing without mixing employee management, salary calculation, and payroll-record responsibilities.

## Responsibility Separation
- EmployeeService manages employee records.
- SalaryCalculator calculates an employee's salary.
- PayrollService coordinates payroll generation and stores payroll records.

## SRP Connection
Each service has a focused reason to change. PayrollService should coordinate payroll work rather than duplicate employee CRUD or employee-specific salary formulas.

## Review
The separation and SRP reasoning passed with **10/10**.

## Learning Outcome
Payroll is a separate business responsibility that reuses existing employee and salary services.
