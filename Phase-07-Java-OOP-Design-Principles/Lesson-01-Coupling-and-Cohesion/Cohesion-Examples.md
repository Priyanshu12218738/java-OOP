# Cohesion Examples

## Low Cohesion — Problematic Design

The `Employee` class handles three different responsibilities:
1. Salary calculation
2. Database persistence
3. Email sending

Because unrelated responsibilities are grouped in one class, changes to one area can make the class harder to maintain and test.

## High Cohesion — Better Design

Responsibilities are separated into focused classes:
- `SalaryCalculator` — salary calculation
- `EmployeeRepository` — employee persistence
- `EmailService` — email sending

Each class has a clear, closely related responsibility, making the design easier to maintain, test, and extend.

## Key Learning

**High cohesion** means a class's responsibilities are closely related and focused. Separating responsibilities can improve maintainability and testability.

## Status
- Phase: Phase 07 — Java OOP Design Principles
- Lesson: 01 — Coupling and Cohesion
- Topic: Low Cohesion vs High Cohesion
- Status: Recorded
