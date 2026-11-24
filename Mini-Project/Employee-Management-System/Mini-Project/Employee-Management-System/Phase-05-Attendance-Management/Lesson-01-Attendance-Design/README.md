# Lesson 1 — Attendance Design

**Status:** ✅ Design discussion completed

## Responsibilities
- `Attendance`: store employee ID, date, and attendance status.
- `AttendanceService`: mark, view, and summarize attendance.

This separation keeps attendance concerns out of the Employee entity and supports SRP.

## Design decision
The learner chose to store employeeId rather than an Employee object. This keeps the attendance record lightweight and avoids an unnecessary object dependency. Review: 9/10.
