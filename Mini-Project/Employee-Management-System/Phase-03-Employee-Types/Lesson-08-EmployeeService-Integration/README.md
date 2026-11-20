# Lesson 8 — Integrate Employee Types with EmployeeService

**Status:** ✅ Integration output passed

## Objective
Use the existing `EmployeeService` to manage all employee subtypes and display their salaries without subtype-specific `if/else` checks.

The learner's submitted final output:
```text
ID: 101, Name: Rahul, Dept: IT, Salary: 30000.0
ID: 102, Name: Priya, Dept: HR, Salary: 32000.0
ID: 103, Name: Aman, Dept: IT, Salary: 10000.0
```

The export records Phase 3 as completed with a score of **9.5/10**.

## Pending cleanup
- Add negative stipend validation to `InternEmployee`.
- Replace `&&` with `||` in `ContractEmployee` validation.
These two fixes were explicitly called out after the phase review.
