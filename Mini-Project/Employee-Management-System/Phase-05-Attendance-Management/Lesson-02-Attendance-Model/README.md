# Lesson 2 — Attendance Model

**Phase:** 5 — Attendance Management  
**Status:** 🟡 Design explained; independent implementation not evidenced

## Objective
Represent one employee's attendance for a particular calendar date.

## Model Structure
The Attendance model uses:
- `employeeId` to identify the employee.
- `LocalDate` for the attendance date.
- `AttendanceStatus` enum with `PRESENT` and `ABSENT`.

## Validation Rules
- Employee ID must be positive.
- Date must not be null.
- Attendance status must not be null.

## Implementation Task
Create the `AttendanceStatus` enum and an `Attendance` class with private fields, a constructor, and getters. Use `java.time.LocalDate`; do not store a date as an arbitrary string.

## Evidence
The model design and validation were explained. The conversation does not establish an independently submitted implementation for this lesson.

## Learning Outcome
A typed date and enum make attendance records clearer and safer than loosely typed values.
