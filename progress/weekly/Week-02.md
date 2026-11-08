# Week 02 — Java OOP Progress Report

**Reporting period:** 2–8 November 2026  
**Baseline:** Week 01 report (26 October–1 November 2026)  
**Evidence source:** GitHub commit history and the current files on the main branch  
**Review date:** 8 November 2026

## 1. Weekly Summary

This week completed the Phase 08 lesson-documentation sequence through Lesson 16. Six new lesson documents were added:

- Lesson 11 — Engine State Management & Edge Cases
- Lesson 12 — Refactor Car System Using SOLID Principles
- Lesson 13 — UML Class Diagram & Object Relationships
- Lesson 14 — Complete Car System Integration
- Lesson 15 — Answer Review
- Lesson 16 — Final Project Review

The Phase 08 index was extended and its list ordinals were corrected. A review of the integrated examples also found and corrected two small documentation/code-presentation issues: the menu's newline escape and the UML relationship notation.

**Important distinction:** these six lessons contain code examples, diagrams, review questions, and implementation checklists, but they are Markdown lesson documents. No standalone Java source files were added or changed during this reporting period, and no actual compile/run output was committed. Phase 08 is therefore still **In Progress**, even though the lesson sequence is now documented through Lesson 16.

## 2. Phase → Topic → Code / Problems

### Phase 08 — Real-World OOP Design

The phase index now contains **17 entries for Lessons 1–16**. There are two distinct topics originally labelled Lesson 4, and both are preserved. The index list numbering is now sequential from 1 to 17 without changing the lesson labels.

| Topic | Concepts / notes added | Code / problems / evidence |
|---|---|---|
| Lesson 11 — Engine State Management & Edge Cases | Boolean engine state transitions; duplicate start/stop requests; success messages only after a successful transition | Engine interface, DieselEngine, Car, and Main examples in README; task to update PetrolEngine and ElectricEngine; expected output supplied |
| Lesson 12 — SOLID Principles Refactoring | SRP, OCP, DIP, constructor DI, composition/HAS-A | HybridEngine example; refactoring checklist; no standalone Java implementation added |
| Lesson 13 — UML Class Diagram & Object Relationships | UML class notation, visibility, interface realization, association, constructor representation, DI | Mermaid class diagram and five practice questions; diagram notation reviewed and corrected |
| Lesson 14 — Complete Car System Integration | Engine interface, three engine implementations, Car delegation, Main menu, constructor DI, state management | Full six-file Java example embedded in README; integration checklist; no separate .java files or actual run transcript |
| Lesson 15 — Answer Review | Already-stopped edge case, boolean return value, void Car method, defensive programming | Main test sequence and expected output; conceptual answer review |
| Lesson 16 — Final Project Review | Architecture recap, OOP concepts, all five SOLID principles, class responsibilities | Final architecture checklist and ten review questions; no submitted answers or execution evidence recorded |

### Code inventory and change summary

- Six new lesson README files were added for Lessons 11–16.
- Six related Phase 08 index updates were made during lesson publication.
- No standalone Java source files were added or modified in this reporting period.
- The repository inventory remains **36 Java source files**, concentrated in the earlier lesson folders.
- Lesson 14 embeds the complete six-class application as code blocks in its README; this is documentation, not yet a tracked runnable project folder.
- The five earlier coding-task/milestone documents remain in the repository. Completion status is not recorded for all tasks.

## 3. Daily / Topic-wise Progress

Dates below are based on GitHub commit timestamps converted from UTC to India Standard Time.

### 2 November 2026

**Lesson 11 — Engine State Management & Edge Cases**
- Added the stopped/running state-transition explanation.
- Updated the Engine contract to return boolean from start() and stop().
- Added DieselEngine and Car examples that prevent misleading success messages.
- Included a Main test sequence for duplicate start and stop requests.
- Added the Lesson 11 entry to the Phase 08 index.

**Lesson 12 — SOLID Principles Refactoring**
- Added SRP, OCP, and DIP explanations.
- Connected constructor Dependency Injection and the Car HAS-A Engine design to the principles.
- Added a HybridEngine example to demonstrate extension without changing Car.
- Added a refactoring checklist and indexed Lesson 12.

### 3 November 2026

**Lesson 16 — Final Project Review**
- Added the overall architecture revision.
- Mapped encapsulation, abstraction, interface implementation, polymorphism, composition, constructor DI, runtime polymorphism, and exception handling.
- Added a checklist and ten final review questions.
- Indexed Lesson 16.

**Lesson 15 — Answer Review**
- Clarified that engine.stop() returns false when the engine is already stopped.
- Clarified that Car.stopCar() itself is void and does not return false.
- Added the expected output and manual test sequence.
- Indexed Lesson 15.

**Lesson 14 — Complete Car System Integration**
- Added code examples for Engine, DieselEngine, PetrolEngine, ElectricEngine, Car, and Main.
- Added engine selection, constructor injection, menu operations, and a test checklist.
- Recorded repeated engine-state logic as a future refactoring opportunity.
- Indexed Lesson 14.

**Lesson 13 — UML Class Diagram & Object Relationships**
- Added a Mermaid class diagram and UML visibility/operation notation.
- Explained interface realization, the Car-to-Engine HAS-A relationship, and constructor injection.
- Added five practice questions.
- Indexed Lesson 13.

**Review fixes made during this report**
- Corrected the Phase 08 list ordinals so the 17 entries are sequential while retaining the two Lesson 4 labels.
- Corrected the UML Car-to-Engine arrow to a simple association; the injected Engine is not shown as strict lifecycle-owning composition.
- Corrected the Lesson 14 menu newline escape so Java displays a new line rather than the literal characters backslash-n.
- Refined Lesson 14's relationship label to association/HAS-A for consistency with the UML explanation.

### 4–8 November 2026

No additional repository commits were found in the reviewed GitHub history for these dates. This means there is no repository evidence of further code, lesson, or test updates during this part of the reporting window. It does not rule out offline study or work that was not committed.

## 4. Debugging, Design Review, and Issues

### Resolved in this reporting update

1. **Phase index ordinal duplication:** Lesson 12 and Lesson 13 were both displayed as item 13. The list now runs from 1 to 17 while preserving the actual lesson labels.
2. **UML relationship notation:** The diagram used a hollow-diamond aggregation arrow while its explanation described a general association. The diagram now uses a simple association arrow.
3. **Menu newline escape:** The Lesson 14 example contained a doubled backslash, which would print a literal backslash-n. It now uses the Java newline escape.

### Still pending

1. **Non-numeric console input:** Lesson 14's Main example still uses Scanner.nextInt() without catching InputMismatchException. Entering text such as hello can terminate the program. Lesson 10 explains the handling, but it has not been integrated into the Lesson 14 example or a standalone Main.java.
2. **Repeated engine logic:** DieselEngine, PetrolEngine, and ElectricEngine repeat the same running-state transition structure. This is explicitly noted in Lesson 14. Consider a shared abstraction only after the current implementation is compiled and tested.
3. **Earlier constructor-validation mismatch:** The Week 01 issue remains to be resolved: the Lesson 4 validation example uses Objects.requireNonNull(), which throws NullPointerException, while its README describes IllegalArgumentException.
4. **Composition terminology:** The injected Engine is created outside Car. The UML lesson now correctly explains the relationship as an association/HAS-A reference rather than strict lifecycle-owning composition. Keep that distinction consistent in future diagrams and explanations.

## 5. Coding Tasks and Test / Output Status

| Area | Status | Evidence |
|---|---|---|
| Engine boolean state transitions | Example and expected output documented | Lesson 11 README |
| Car success-message guard | Example documented | Lesson 11 README |
| HybridEngine extension | Example documented | Lesson 12 README |
| UML diagram and relationships | Diagram documented; notation corrected | Lesson 13 README |
| Full six-class Car System | Complete code examples embedded in README | Lesson 14 README |
| Duplicate start/stop behavior | Expected output documented | Lessons 11 and 15 |
| Final OOP/SOLID review | Checklist and questions added | Lesson 16 README |
| Standalone integrated Java project | Not present as a new project folder | No .java changes in this period |
| Compilation | Not verified | No compiler output or test log committed |
| Runtime behavior | Not verified | Expected output is instructional, not captured execution evidence |
| Invalid text input | Not yet integrated into the integrated example | Lesson 14 still calls nextInt() directly |

Do not treat expected output shown in lesson notes as proof that the code was executed successfully.

## 6. Learning Gaps / Pending Work

1. Create the integrated Car System as actual Java files rather than only README code blocks.
2. Compile all six classes together and resolve any compiler errors.
3. Integrate InputMismatchException handling or a hasNextInt() input-validation loop in Main.
4. Test all three engine selections.
5. Verify duplicate start and stop behavior for each implementation.
6. Verify invalid engine selection, invalid menu integers, and non-numeric input.
7. Resolve the Lesson 4 Objects.requireNonNull() versus IllegalArgumentException mismatch.
8. Decide whether to retain the repeated engine logic or introduce a shared implementation after tests pass.
9. Attempt the five UML practice questions and ten final review questions; no answer submission is present in the reviewed repository.
10. Add actual console output or test results before marking the integration checklist complete.

## 7. Next Week's Plan

### Priority 1 — Turn the integration example into a runnable project
- Add the six source files: Engine, DieselEngine, PetrolEngine, ElectricEngine, Car, and Main.
- Keep engine state private inside each engine implementation.
- Keep Car dependent on the Engine interface and inject the selected engine through its constructor.
- Keep one Car instance outside the menu loop.

### Priority 2 — Complete input validation
- Handle invalid integer menu choices.
- Catch InputMismatchException or validate tokens before reading integers.
- Consume invalid input so the menu can continue.
- Reject an invalid engine selection before constructing Car.
- Resolve the earlier constructor exception documentation mismatch.

### Priority 3 — Execute and record tests
Run these cases and save actual output:

1. Diesel: start, start again, stop, stop again.
2. Petrol: start and stop.
3. Electric: start and stop.
4. Invalid engine choice.
5. Invalid menu integer such as 5.
6. Text input such as hello at engine selection and at the menu.
7. Exit after multiple menu operations.
8. Null Engine constructor validation.

### Priority 4 — Review and refactor
- Answer the UML and final-review questions.
- Revisit duplicated state-management code after behavior is verified.
- Update checklists only for work that has actually been completed and tested.

## 8. Overall Roadmap / Phase Progress

| Area | Status at 8 November 2026 |
|---|---|
| Phase 08 lesson sequence | Lessons 1–16 documented; 17 index entries because two topics retain the Lesson 4 label |
| Lessons added this week | Lessons 11–16 (six README files) |
| Phase 08 index | Updated; ordinals corrected to 1–17 |
| Java source inventory | 36 files; no new or changed .java files this week |
| Coding tasks | Five earlier task/milestone documents; completion evidence remains incomplete |
| Integrated Car System | Full example is documented in Lesson 14; standalone runnable project not yet added |
| Compilation and runtime testing | Not verified; no actual output logs committed |
| Phase status | **In Progress** |

Phase 08 has reached the end of its documented lesson sequence, but the project should not be marked complete until the integrated source is runnable, tested, and accompanied by actual output evidence.

See [Week 01](Week-01.md) for the previous reporting period and [PHASE-08.md](../phases/PHASE-08.md) for the current phase snapshot.

---

**Weekly outcome:** The theory and design documentation for the Car System now runs through Lesson 16. The next milestone is implementation and verification: convert the documented integration into a runnable Java project, harden input handling, and commit real test output.
