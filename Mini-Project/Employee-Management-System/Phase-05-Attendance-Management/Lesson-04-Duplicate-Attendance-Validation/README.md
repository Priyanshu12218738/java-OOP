# Lesson 4 — Duplicate Attendance Validation

**Phase:** 5 — Attendance Management  
**Status:** ✅ Logic passed — 10/10

## Objective
Prevent more than one attendance record for the same employee on the same date.

## Validation Rule
A duplicate exists only when both conditions match:
1. The existing record has the same employee ID.
2. The existing record has the same date.

Use `&&` because both values must match. Compare LocalDate values with `.equals()`.

## Implementation Outline
Before adding a record, iterate through the existing list. If a record has the same employee ID and date, reject the new record with `IllegalArgumentException`. Otherwise, add it.

## Review
The duplicate-detection logic and the use of both conditions were passed with **10/10**.

## Learning Outcome
The uniqueness rule is based on the employee-and-date pair, not employee ID alone.
