# Lesson 1 — Attendance Design & Class Responsibilities

**Phase:** 5 — Attendance Management  
**Status:** ✅ Design reviewed — 9/10

## Objective
Design attendance tracking as a responsibility separate from employee profile management.

## Design Decisions
- Attendance is a separate domain model.
- Store the employee ID rather than an Employee object for this project design.
- An attendance record represents one employee's attendance on one date.
- Attendance operations belong in an AttendanceService rather than Employee.

## Design Questions
1. Why should attendance not be stored as unrelated fields inside Employee?
2. What identifies one attendance record?
3. Which class should validate and manage attendance records?
4. How can present and absent days be summarized?

## Review Outcome
The design was reviewed and scored **9/10**. The separation of Employee and Attendance responsibilities was accepted.

## Learning Outcome
Attendance has its own model and service boundary, keeping employee profile management focused.
