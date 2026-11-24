# Lesson 2 — Attendance Model

**Phase:** 5 — Attendance Management  
**Status:** 🟡 Core model explained; LEAVE extension pending

## Objective
Represent one employee's attendance for a particular calendar date and support present, absent, and leave records.

## Model Structure
The Attendance model uses:
- `employeeId` to identify the employee.
- `LocalDate` for the attendance date.
- `AttendanceStatus` enum with `PRESENT`, `ABSENT`, and `LEAVE`.

## Validation Rules
- Employee ID must be positive.
- Date must not be null.
- Attendance status must not be null.

## Implementation Task
Create the `AttendanceStatus` enum and an `Attendance` class with private fields, a constructor, and getters. Use `java.time.LocalDate`; do not store a date as an arbitrary string. Add LEAVE as a third status and make sure the model accepts it as a valid attendance state.

## Evidence
The earlier model discussion covered PRESENT and ABSENT. Independent implementation is not evidenced, and LEAVE is an additional requirement from the expanded project outline.

## Learning Outcome
A typed date and enum make attendance records clearer and safer than loosely typed values.
