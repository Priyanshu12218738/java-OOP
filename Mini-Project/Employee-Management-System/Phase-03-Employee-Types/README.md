# Phase 3 — Employee Types

**Status:** ✅ Complete — with two follow-up code fixes

## Goal
Model permanent, contract, and intern employees using inheritance, method overriding, runtime polymorphism, and LSP fundamentals.

## Lesson Index

| Lesson | Topic | Status |
|---|---|---|
| [Lesson 1 — Why Inheritance?](Lesson-01-Why-Inheritance/README.md) | Shared employee state and inheritance | ✅ Passed |
| [Lesson 2 — Create Employee Subclasses](Lesson-02-Create-Employee-Subclasses/README.md) | PermanentEmployee, ContractEmployee, InternEmployee | ✅ Passed |
| [Lesson 3 — Permanent & Contract Salary](Lesson-03-Permanent-and-Contract-Salary/README.md) | Salary formulas, overriding, validation | 🟡 Passed; correction noted |
| [Lesson 4 — Intern Salary](Lesson-04-Intern-Salary/README.md) | Stipend calculation and encapsulation | 🟡 Mostly correct; validation pending |
| [Lesson 5 — Runtime Polymorphism](Lesson-05-Runtime-Polymorphism/README.md) | Parent reference and overridden method dispatch | ✅ Passed |
| [Lesson 6 — Polymorphism with ArrayList](Lesson-06-Polymorphism-with-ArrayList/README.md) | Store and process mixed employee types | ✅ Passed |
| [Lesson 7 — Liskov Substitution Principle](Lesson-07-Liskov-Substitution-Principle/README.md) | Parent contract and substitutability | ✅ Fundamentals passed |
| [Lesson 8 — EmployeeService Integration](Lesson-08-EmployeeService-Integration/README.md) | Display each subtype's salary through EmployeeService | ✅ Integration passed |

## Completion evidence
The final EmployeeService output for all three employee types matched the expected salaries. The source conversation records Phase 3 complete with a score of **9.5/10**.

## Follow-up fixes
- Change ContractEmployee validation from `&&` to `||` so either negative hours or negative rate is rejected.
- Add negative stipend validation to InternEmployee.

The phase is recorded as complete according to the conversation's final review, while these specific cleanup items remain visible.
