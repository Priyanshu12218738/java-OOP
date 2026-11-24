# Lesson 4 — FreelanceEmployee & OCP Challenge

**Status:** ✅ Passed — 10/10

## Task
Add a new `FreelanceEmployee` with salary = hourly rate × total hours.

## Reviewed outcome
The learner correctly concluded that only a new subclass and its overridden `calculateSalary()` method are required. `SalaryCalculator` remains unchanged because it depends on the `Employee` abstraction and delegates through polymorphism.

## Integration evidence
The conversation records a FreelanceEmployee (ID 104, Amit) with rate 500 and 40 hours producing **20000.0** through the existing calculator.

## Phase outcome
Phase 4 completed: SRP separation, polymorphic salary calculation, OCP extension, and null validation were covered. The conversation then moves to Phase 5.
