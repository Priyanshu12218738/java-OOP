# Lesson 4 — Generate Payroll

**Phase:** 7 — Payroll Management  
**Status:** 🟡 Solution walkthrough

## Objective
Generate and store a payroll record for a valid employee.

## Workflow
1. Receive or locate the employee.
2. Validate that the employee is available.
3. Calculate salary through SalaryCalculator.
4. Create a Payroll record with employee ID, calculated salary, and `LocalDate.now()`.
5. Store the record in PayrollService.
6. Return or otherwise expose the created record according to the service design.

## Design Rule
Do not reimplement employee-type salary logic inside PayrollService.

## Evidence & Practice
The workflow was explained as a solution walkthrough; independent submitted implementation is not evidenced. Implement the method and test a valid employee and an invalid/missing employee.
