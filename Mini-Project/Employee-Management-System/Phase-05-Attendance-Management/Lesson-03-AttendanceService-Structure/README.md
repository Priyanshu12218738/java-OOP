# Lesson 3 — AttendanceService Structure

**Phase:** 5 — Attendance Management  
**Status:** ✅ Concept passed — 10/10

## Objective
Create a service responsible for maintaining attendance records.

## Concepts
- AttendanceService owns the attendance collection.
- Declare the field using `List<Attendance>`.
- Instantiate the collection with `new ArrayList<>()`.
- Keep storage and attendance operations outside the Employee model.

## Implementation Task
Create an AttendanceService with a private list of Attendance records. Keep the collection encapsulated and add service methods in the following lessons.

## Review
The learner correctly identified `List<Attendance>` as the abstraction and `ArrayList` as its implementation. Concept check passed with **10/10**.

## Learning Outcome
The service layer manages attendance records while the model represents a single record.
