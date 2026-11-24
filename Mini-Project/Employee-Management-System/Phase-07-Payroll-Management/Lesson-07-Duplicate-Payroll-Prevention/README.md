# Lesson 7 — Duplicate Payroll Prevention

**Phase:** 7 — Payroll Management  
**Status:** ✅ Verified

## Objective
Prevent more than one payroll record for the same employee in the same calendar month.

## Uniqueness Rule
A payroll duplicate is identified by:
- Matching employee ID.
- Matching calendar month and year of payroll date.

Use `YearMonth` to compare the month and year while ignoring the day of the month.

## Expected Behaviour
If a payroll already exists for the same employee and YearMonth, reject the new attempt with `IllegalArgumentException`. Otherwise, allow payroll generation.

## Verification
The expected exception was produced for a duplicate attempt. The duplicate-prevention behaviour was verified.
