# Lesson 6 — Attendance Summary

**Phase:** 5 — Attendance Management  
**Status:** 🟡 Existing solution walkthrough; LEAVE extension pending

## Objective
Calculate an employee's present, absent, leave, and total attendance days.

## Calculation
Filter records by employee ID, then maintain counters:
- `presentDays`: increment for PRESENT records.
- `absentDays`: increment for ABSENT records.
- `leaveDays`: increment for LEAVE records.
- `totalDays`: number of matching attendance records.

## Existing Verified Summary
The earlier integration example for employee 101 was:
- Present Days: 2
- Absent Days: 1
- Total Days: 3

## Extension Task
- [ ] Add the `leaveDays` counter.
- [ ] Count LEAVE records separately.
- [ ] Include leave days in the displayed summary.
- [ ] Verify that present + absent + leave equals total recorded days.

## Evidence
The original walkthrough covered present and absent counters. The LEAVE summary is a new requirement and has not yet been implemented or verified.
