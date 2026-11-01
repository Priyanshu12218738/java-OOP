# Phase 08 — Real-World OOP Design: Progress Snapshot

**Status:** In Progress  
**Last reviewed:** 1 November 2026

## Phase Structure

The Phase 08 lesson index contains 11 entries covering Lessons 1–10. Two distinct submitted topics were both labelled Lesson 4; both remain separate and have not been renumbered.

## Topic → Code / Problems

| Topic | Repository evidence | Status |
|---|---|---|
| Lesson 1 — Car System Design | Engine abstraction, Petrol/Electric engines, Car composition, Main | Example code present |
| Lesson 2 — Car Engine Lifecycle | Start/stop contract, three engine types, Car, Main, coding task | Example code and task present |
| Lesson 3 — Runtime Polymorphism | Engine interface, three engine types, Car, Main, retained theory | Example code and theory present |
| Lesson 4 — Encapsulation and State | Car/Engine state handling, Main, coding challenge | Example code and task present |
| Lesson 4 — Validation and Error Handling | Constructor validation example and challenge | Example code present; README exception type needs correction |
| Lesson 5 — Exception Handling | IllegalStateException lifecycle example and try-catch runner | Example code and task present |
| Lesson 6 — Class Design Review | Engine, Petrol/Diesel/Electric engines, Car, Main, checklist | Example code and review checklist present |
| Lesson 7 — Console-Based Car System | Main.java starter and Milestone 7 | Implementation pending |
| Lesson 8 — Engine Selection + DI | Engine selection and constructor injection notes | Documentation present; Main integration pending |
| Lesson 9 — Menu Integration | Start/stop menu-to-Car flow | Documentation present; Main integration pending |
| Lesson 10 — Invalid Inputs and Exceptions | default, InputMismatchException, Scanner input consumption, null validation | Documentation present; Main integration pending |

## Inventory

- 11 lesson entries indexed.
- 36 Java source files across Lesson 1–7 folders.
- Five coding-task/milestone documents.
- One Lesson 6 design-review checklist.
- Lessons 8–10 currently have README documentation only.
- Lesson 7 Main.java is an intentionally incomplete starter with TODOs.

## Key Concepts Covered

- Abstraction through the Engine interface.
- Composition: Car has an Engine.
- Runtime polymorphism and interchangeable implementations.
- Encapsulation and state transitions.
- Constructor validation and exception handling.
- Dependency Injection and Programming to an Interface.
- Dependency Inversion Principle and Open/Closed Principle.
- Separation of console input from domain behavior.
- Single source of truth for engine-running state.

## Issues to Resolve

1. `Lesson-04-Validation-Error-Handling/Car.java` uses `Objects.requireNonNull`, which throws `NullPointerException`, while its README says `IllegalArgumentException`. Align the implementation and explanation.
2. Lesson 7 `Main.java` still contains TODOs and calls `nextInt()` without handling text input.
3. No actual compile/test logs or console output are recorded yet.

## Next Phase Milestones

- [ ] Complete engine selection in Main.
- [ ] Validate selection and construct one Car using constructor injection.
- [ ] Connect Start, Stop, and Exit menu actions.
- [ ] Add InputMismatchException handling and consume invalid input.
- [ ] Test Petrol, Diesel, and Electric flows.
- [ ] Test invalid engine choices, invalid integer choices, and text input.
- [ ] Add actual output/test evidence and update task checklists.
- [ ] Review the constructor exception mismatch.

## Final Status

**Phase 08 is not complete yet.** The design notes and example code provide a strong base, but the integrated console application and its tests remain the next required deliverables.

See the [Week 01 progress report](../weekly/Week-01.md) for the dated activity log and detailed next-week plan.
