# Lesson 8 — Attendance Interface & Interface Segregation Principle

**Phase:** 5 — Attendance Management  
**Status:** 🔄 Planned — implementation pending

## Objective
Introduce a focused attendance interface and apply the Interface Segregation Principle (ISP) to attendance operations.

## Learning Topics
- Define an attendance-related interface around a small, cohesive contract.
- Keep unrelated operations out of an interface when clients do not need them.
- Let the relevant service or implementation provide the required behaviour.
- Depend on the smallest useful abstraction rather than a broad interface.

## Suggested Design Exercise
Review the current AttendanceService responsibilities and identify a small interface that represents an actual client requirement. Avoid creating interfaces only to add more types; the abstraction should have a clear consumer and purpose.

## Acceptance Criteria
- [ ] Interface has a focused set of methods.
- [ ] Implementing class provides the required behaviour.
- [ ] Clients are not forced to implement or depend on unused methods.
- [ ] Explain how the design demonstrates ISP.

## Current Progress
This topic is added to the phase roadmap based on the expanded project outline. No implementation or review result has been submitted yet.
