# Lesson 2 — Attendance Model

**Status:** 🟡 Model design explained; independent implementation not evidenced

## Required model
- `int employeeId`
- `LocalDate date`
- `AttendanceStatus status`
- Constructor and getters

Validation: employee ID must be positive; date and status must not be null.

`AttendanceStatus` is an enum with `PRESENT` and `ABSENT`, preventing arbitrary string values and spelling inconsistencies.
