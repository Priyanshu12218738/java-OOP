# Lesson 1 — Salary Requirements and SRP

**Status:** ✅ Concept check passed

## Objective
Separate employee management from salary-calculation responsibility.

The learner correctly identified that a class responsible for employee CRUD operations and salary calculation would violate the Single Responsibility Principle.

Responsibilities identified:
- `EmployeeService`: add, search, update, delete, and display employees.
- Salary calculation: a separate responsibility, handled through a dedicated design.
- Employee subclasses: retain their employee data and type-specific salary behaviour.
