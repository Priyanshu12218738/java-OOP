# Lesson 4 — Duplicate Attendance Validation

**Status:** ✅ Logic check passed — 10/10

## Business rule
An employee can have at most one attendance record per date.

Duplicate detection requires both conditions:
- Existing record employee ID equals the incoming record employee ID.
- Existing record date equals the incoming record date.

Use `&&`; compare integer IDs with `==` and LocalDate values with `.equals()`. Reject duplicates with `IllegalArgumentException` before adding the record.
