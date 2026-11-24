# Lesson 9 — Payroll & Notification Integration

**Phase:** 7 — Payroll Management  
**Status:** 🔄 Task pending

## Objective
Send a notification only after payroll has been successfully generated and stored.

## Implementation Task
1. Add NotificationService as a PayrollService dependency.
2. Inject it through the PayrollService constructor.
3. Generate and validate the payroll record.
4. Store the payroll record successfully.
5. Only then send the salary notification.

## Acceptance Criteria
- Successful payroll generation stores one record and sends one notification.
- A duplicate payroll attempt is rejected.
- A rejected duplicate does not send another notification.
- The payroll record count remains unchanged after the duplicate attempt.

## Design Focus
- DIP: PayrollService depends on a notification abstraction/service rather than constructing a concrete channel.
- Correct operation order: persist the successful payroll record before notifying.
- Failure handling: do not send a success notification when payroll creation fails.

## Current Progress
The source export ends with this task and its expected behaviour. No implementation result was submitted, so Lesson 9 remains pending and Phase 7 remains in progress.
