# Lesson 5 — Understanding Dependency Injection

**Phase:** 6 — Notification System  
**Status:** 🟡 Correction explained

## Objective
Understand which object creates a dependency and which object receives it.

## Correct Object Flow
- The application entry point / composition root creates the concrete notification object.
- Main passes that object to NotificationService's constructor.
- NotificationService receives and uses the dependency; it should not create the concrete channel itself.

## Key Distinction
Dependency Injection is the act of supplying an object's dependency from outside. Constructor Injection is the technique used here.

## Review
A correction was explained: Main creates and injects the dependency; the service receives it.

## Practice
Trace object creation and constructor calls in your Main method. Identify the composition root and the dependent service.
