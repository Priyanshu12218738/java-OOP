# Lesson 4 — Generate Monthly Payroll

**Phase:** 7 — Payroll Management  
**Status:** 🟡 Solution walkthrough

## Objective
Generate and store one payroll record for a valid employee for a payroll month.

## Workflow
1. Receive or locate the employee.
2. Validate that the employee is available.
3. Calculate base salary through SalaryCalculator.
4. Create a Payroll record with employee ID, calculated salary, and payroll date.
5. Store the record in PayrollService.
6. Return or otherwise expose the created record according to the service design.

## Monthly Payroll Rule
Payroll is generated for a calendar month. The duplicate-prevention lesson uses employee ID plus `YearMonth` to identify an employee's monthly payroll, rather than comparing only the exact date.

## Planned Payroll Extension
Bonus and deductions will be added in Lesson 10. Keep the base salary calculation distinct from the later net-pay adjustment:

`netPay = baseSalary + bonus - deductions`

## Design Rule
Do not reimplement employee-type salary logic inside PayrollService.

## Evidence & Practice
The workflow was explained as a solution walkthrough; independent submitted implementation is not evidenced. Implement the method and test a valid employee and an invalid/missing employee.
