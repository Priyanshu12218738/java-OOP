# Lesson 1 — SOLID Principles: Single Responsibility Principle (SRP)

## Wrong Design

The original `Employee` class handles employee data, salary calculation, database persistence, payslip generation, and email sending. These are separate responsibilities, so changes in one area can force changes to the same class.

## SRP-Compliant Design

Responsibilities are separated into focused classes:

- `Employee` — stores employee data and exposes the required values.
- `SalaryCalculator` — calculates/displays salary.
- `EmployeeRepository` — handles employee persistence.
- `PayslipGenerator` — generates payslip output.
- `EmailService` — handles email sending.

## What Improved?

| Aspect | Wrong Design | SRP-Compliant Design |
|---|---|---|
| Responsibilities | One class handles several unrelated tasks | Each class has one focused responsibility |
| Maintainability | Changes can affect a large, mixed-purpose class | Changes are localized to the relevant class |
| Testing | Individual behaviors are harder to test in isolation | Each responsibility can be tested separately |
| Reusability | Employee operations are bundled together | Services can be reused independently |
| Readability | Employee class has many unrelated methods | Class names communicate their purpose clearly |

## Key Principle

**Single Responsibility Principle (SRP):** A class should have one reason to change. It should have one focused responsibility.

## Status

- Phase: Phase 07 — Java OOP Design Principles
- Lesson: 01 — SOLID: Single Responsibility Principle
- Wrong and improved examples: Added
- Status: Recorded
