# Lesson 10 — Bonus & Deductions

**Phase:** 7 — Payroll Management  
**Status:** 🔄 Planned — implementation pending

## Objective
Extend payroll processing to account for additional earnings and deductions while keeping salary calculation and payroll orchestration responsibilities clear.

## Learning Topics
- Bonus as an additional earning.
- Deductions as amounts subtracted from payable salary.
- Distinguish base salary, bonus, total deductions, and final payable amount.
- Validate monetary values and prevent invalid negative inputs unless a specific deduction/adjustment model explicitly allows them.

## Suggested Calculation
`netPay = baseSalary + bonus - deductions`

## Implementation Tasks
- [ ] Decide where bonus and deduction data should be represented.
- [ ] Add the required fields or value objects to the payroll model.
- [ ] Validate bonus and deduction amounts.
- [ ] Update payroll processing to calculate the final payable amount.
- [ ] Display base salary, bonus, deductions, and net pay.
- [ ] Test zero bonus, zero deductions, and normal payroll cases.

## Design Constraints
Do not put every calculation into Main.java. Keep payroll-specific coordination in PayrollService and keep responsibilities cohesive. Consider whether bonus/deduction calculation needs a separate collaborator if the logic grows.

## Current Progress
Bonus and deductions were not part of the previously verified implementation. This lesson is newly added from the expanded phase requirements and remains pending.
