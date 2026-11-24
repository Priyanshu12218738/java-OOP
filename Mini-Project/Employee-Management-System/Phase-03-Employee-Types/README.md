# Phase 3 — Employee Types

**Status:** ✅ Complete — with two follow-up code fixes

## Goal
Extend the Employee model with permanent and contract employee types, then apply inheritance, runtime polymorphism, and Liskov Substitution Principle fundamentals.

## Lesson Index
| Lesson | Topic | Details | Status |
|---|---|---|---|
| [Lesson 1 — Why Inheritance?](Lesson-01-Why-Inheritance/README.md) | Inheritance motivation | Identify common employee state/behaviour and avoid duplicating it across employee types. | ✅ Passed |
| [Lesson 2 — Create Employee Subclasses](Lesson-02-Create-Employee-Subclasses/README.md) | PermanentEmployee and ContractEmployee | Extend Employee, define subtype constructors, and initialize shared state using super(...). InternEmployee was also introduced in the existing work. | ✅ Passed |
| [Lesson 3 — Permanent & Contract Salary](Lesson-03-Permanent-and-Contract-Salary/README.md) | Different employee salary structures | Implement monthly salary for permanent employees and hours × rate for contract employees. | 🟡 Passed; validation correction noted |
| [Lesson 4 — Intern Salary](Lesson-04-Intern-Salary/README.md) | Intern salary structure | Calculate intern stipend and validate the stipend amount. | 🟡 Mostly correct; validation pending |
| [Lesson 5 — Runtime Polymorphism](Lesson-05-Runtime-Polymorphism/README.md) | Method overriding and dynamic dispatch | Use an Employee reference and allow the actual subtype to determine calculateSalary(). | ✅ Passed |
| [Lesson 6 — Polymorphism with ArrayList](Lesson-06-Polymorphism-with-ArrayList/README.md) | Mixed employee collection | Store different Employee subtypes in one list and process them polymorphically. | ✅ Passed |
| [Lesson 7 — Liskov Substitution Principle](Lesson-07-Liskov-Substitution-Principle/README.md) | LSP implementation | Use subtype objects wherever Employee is expected without breaking the parent contract. | ✅ Fundamentals passed |
| [Lesson 8 — EmployeeService Integration](Lesson-08-EmployeeService-Integration/README.md) | Integrate employee types | Display and calculate salaries for different employee types through the service. | ✅ Integration passed |

## Core Topics Covered
- PermanentEmployee and ContractEmployee.
- Inheritance with extends and constructor chaining with super(...).
- Method overriding and runtime polymorphism.
- Different salary structures for employee subtypes.
- LSP: subtype objects must honour the Employee contract.

## Completion Evidence
The final EmployeeService output for all three employee types matched the expected salaries. The source conversation records Phase 3 complete with a score of **9.5/10**.

## Follow-up Fixes
- Change ContractEmployee validation from && to || so either negative hours or negative rate is rejected.
- Add negative stipend validation to InternEmployee.

The phase remains recorded as complete according to the conversation's final review, with these cleanup items visible.
