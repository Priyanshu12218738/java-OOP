# Phase 08 — Real-World OOP Design: Progress Snapshot

**Status:** In Progress  
**Last reviewed:** 8 November 2026

## Phase Structure

The Phase 08 lesson index now contains **17 entries for Lessons 1–16**. Two distinct submitted topics were both labelled Lesson 4; both are retained without renaming. The list ordinals are sequential from 1 to 17.

## Topic → Code / Problems

| Topic | Repository evidence | Status |
|---|---|---|
| Lesson 1 — Car System Design | Engine abstraction, Petrol/Electric engines, Car composition, Main | Example code present |
| Lesson 2 — Car Engine Lifecycle | Start/stop contract, three engine types, Car, Main, coding task | Example code and task present |
| Lesson 3 — Runtime Polymorphism | Engine interface, three engine types, Car, Main, retained theory | Example code and theory present |
| Lesson 4 — Encapsulation and State | Car/Engine state handling, Main, coding challenge | Example code and task present |
| Lesson 4 — Validation and Error Handling | Constructor validation example and challenge | Example code present; README exception type still needs correction |
| Lesson 5 — Exception Handling | IllegalStateException lifecycle example and try-catch runner | Example code and task present |
| Lesson 6 — Class Design Review | Engine, Petrol/Diesel/Electric engines, Car, Main, checklist | Example code and review checklist present |
| Lesson 7 — Console-Based Car System | Main.java starter and Milestone 7 | Starter contains TODOs; implementation pending |
| Lesson 8 — Engine Selection + DI | Engine selection and constructor injection notes | Documentation present; Main integration pending |
| Lesson 9 — Menu Integration | Start/stop menu-to-Car flow | Documentation present; Main integration pending |
| Lesson 10 — Invalid Inputs and Exceptions | default, InputMismatchException, Scanner input consumption, null validation | Documentation present; robust input handling not integrated in the full example |
| Lesson 11 — Engine State Management & Edge Cases | Boolean start/stop contract, state-transition guards, Car success-message checks | README examples and expected output present; no standalone Java update |
| Lesson 12 — SOLID Principles Refactoring | SRP, OCP, DIP, DI, HAS-A, HybridEngine extension | README examples and refactoring checklist present |
| Lesson 13 — UML Class Diagram & Object Relationships | Mermaid diagram, UML visibility, interface realization, association, constructor DI | Diagram and five practice questions present; notation reviewed |
| Lesson 14 — Complete Car System Integration | Engine, three engine classes, Car, Main, selection and menu | Full six-class example embedded in README; standalone project and runtime tests pending |
| Lesson 15 — Answer Review | Already-stopped edge case, boolean return, void Car method, defensive programming | Review explanation and expected output present |
| Lesson 16 — Final Project Review | Architecture, OOP concepts, all five SOLID principles | Checklist and ten review questions present; completion not yet demonstrated by test evidence |

## Inventory

- 17 lesson entries in the Phase 08 index (Lessons 1–16, with two Lesson 4 entries).
- 36 Java source files across the earlier Lesson 1–7 folders.
- Six lesson README files added this week (Lessons 11–16).
- Lessons 8–16 are documented primarily through README examples and notes; Lesson 14's integrated six-class code is embedded in Markdown, not stored as six separate Java source files.
- Five coding-task/milestone documents and one Lesson 6 design-review checklist.
- No standalone .java files were added or changed during 2–8 November.
- No actual compilation logs, runtime transcripts, or test-result files were found.

## Key Concepts Covered

- Abstraction through the Engine interface.
- Interface realization and runtime polymorphism.
- Encapsulation and engine-owned state transitions.
- Composition/HAS-A and the distinction between association and strict lifecycle-owning composition.
- Constructor Dependency Injection and Programming to an Interface.
- Dependency Inversion and Open/Closed Principles.
- SRP, OCP, LSP, ISP, and DIP review.
- UML class notation and object relationships.
- Defensive programming, input validation, and exception handling.
- Separation of console input from domain behavior.

## Debugging and Design Review

### Resolved during the Week 02 review

1. The Phase 08 list had a duplicated ordinal 13 for Lessons 12 and 13. It now uses sequential list ordinals 1–17 while preserving the lesson labels.
2. The UML diagram used a hollow-diamond aggregation arrow even though the text described a general association. The arrow was changed to a simple association.
3. The Lesson 14 menu example had a doubled backslash in its newline escape, which would print a literal backslash-n. The example was corrected.
4. Lesson 14's relationship table was refined to say Association / HAS-A, consistent with the UML explanation for an externally injected Engine.

### Still to resolve

1. Lesson 4 validation example uses Objects.requireNonNull(), which throws NullPointerException, while its README describes IllegalArgumentException. Align the code and explanation.
2. Lesson 14 Main uses Scanner.nextInt() without catching InputMismatchException. Non-numeric input can terminate the application.
3. DieselEngine, PetrolEngine, and ElectricEngine repeat similar running-state transition logic. Consider refactoring after behavior is verified.
4. No actual compile/test output is recorded.

## Next Phase Milestones

- [x] Document Lessons 11–16 and add them to the Phase 08 index.
- [x] Add the UML diagram and object-relationship explanation.
- [x] Add the integrated six-class Car System example in Lesson 14.
- [ ] Create the six Java classes as actual source files in a runnable project folder.
- [ ] Complete robust engine selection and menu input handling.
- [ ] Compile the integrated application.
- [ ] Test Petrol, Diesel, and Electric start/stop behavior.
- [ ] Test duplicate start/stop, invalid engine selection, invalid menu numbers, and non-numeric input.
- [ ] Commit actual console output or test results.
- [ ] Resolve the Lesson 4 constructor exception mismatch.
- [ ] Answer the UML and final project review questions.
- [ ] Revisit repeated engine state-management code after tests pass.

## Final Status

**Phase 08 is still In Progress.** The lesson sequence is documented through Lesson 16, and the integrated design is shown in Lesson 14. The remaining milestone is to create and verify the runnable application, record actual test output, and close the known documentation/input-handling gaps.

See the [Week 01 report](../weekly/Week-01.md) and [Week 02 report](../weekly/Week-02.md) for dated activity and next steps.
