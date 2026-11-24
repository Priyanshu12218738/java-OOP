# Lesson 6 — Attendance Summary

**Phase:** 5 — Attendance Management  
**Status:** 🟡 Solution walkthrough

## Objective
Calculate an employee's present, absent, and total attendance days.

## Calculation
Maintain counters:
- `presentDays`: increment for PRESENT records.
- `absentDays`: increment for ABSENT records.
- `totalDays`: number of matching attendance records.

Filter records by employee ID before updating the counters.

## Expected Summary
The recorded integration example for employee 101 was:
- Present Days: 2
- Absent Days: 1
- Total Days: 3

## Evidence & Practice
The solution was explained, but independent implementation is not evidenced. Implement the summary method and test an employee with mixed statuses and one with no records.
