# Week 01 — Java OOP Progress Report

**Reporting period:** 26 October – 1 November 2026  
**Evidence source:** GitHub commit history and files on the `main` branch  
**Baseline:** First weekly report; no earlier `Week-XX.md` report was present.

## 1. Weekly Summary

The main focus was **Phase 08 — Real-World OOP Design**, extending the Car System from engine lifecycle and object design into a console-driven application.

- Added or refined material for Lessons 3–10.
- Retained the earlier Runtime Polymorphism theory in Lesson 3 instead of replacing it.
- Added a class-design review with Petrol, Diesel, and Electric engine implementations.
- Added a console application starter and milestone for Lesson 7.
- Documented engine selection, constructor Dependency Injection, menu integration, and invalid-input handling in Lessons 8–10.
- Updated the Phase 08 lesson index through Lesson 10.

**Important distinction:** lesson notes and starter files are present, but the repository does not yet contain a completed student implementation of the console menu or test-output evidence.

## 2. Phase → Topic → Code / Problems

### Phase 08 — Real-World OOP Design

The Phase 08 index contains **11 lesson entries**: Lessons 1–10, with two separate topics both originally labelled Lesson 4. Both Lesson 4 entries have been retained.

| Topic | Concepts covered | Code / problems recorded |
|---|---|---|
| Lesson 1 — Car System Design | Engine abstraction, composition, constructor injection, polymorphism, DIP | Engine interface, Petrol/Electric implementations, Car, Main |
| Lesson 2 — Car Engine Lifecycle | Engine start/stop lifecycle, delegation, constructor DI | Petrol/Diesel/Electric implementations, Car, Main, coding task |
| Lesson 3 — Runtime Polymorphism | Interface-based runtime dispatch and interchangeable engines | Engine implementations, Car, Main; earlier theory retained |
| Lesson 4 — Encapsulation and State | Private state, valid state transitions, duplicate-operation prevention | Car/Engine examples and coding challenge |
| Lesson 4 — Validation and Error Handling | Constructor validation, null dependency, validation vs exceptions | Engine, PetrolEngine, Car, Main and validation challenge |
| Lesson 5 — Exception Handling | IllegalStateException, try-catch, invalid lifecycle operations | Car/Engine example and coding challenge |
| Lesson 6 — Class Design Review | Composition, DIP, OCP, responsibility boundaries, one source of truth for state | Engine interface, three engine implementations, Car, Main and review checklist |
| Lesson 7 — Console-Based Car System | Scanner, menu loop, switch, persistent Car instance | Main.java starter skeleton and Milestone 7 |
| Lesson 8 — Engine Selection + DI | User-selected implementation, interface reference, constructor injection | README lesson notes and engine-selection example |
| Lesson 9 — Connect Menu with Selected Engine | Main-to-Car calls, start/stop menu integration, object lifetime | README lesson notes and menu example |
| Lesson 10 — Invalid Inputs and Exceptions | default branch, InputMismatchException, input consumption, null validation | README lesson notes and try-catch example |

### Code inventory

- **36 Java source files** are present across Lesson 1–7 folders.
- Lessons 1–6 contain separate example implementations and runners.
- Lesson 7 contains one `Main.java` starter with TODOs.
- Lessons 8–10 currently contain lesson documentation only; their examples have not yet been integrated into the tracked Java source.
- Five coding-task/milestone documents are present across the earlier lessons and Lesson 7, along with the Lesson 6 design-review checklist.

### Problems / coding tasks

The repository defines practice tasks and test scenarios, but it does not record completed submissions for the Lesson 7 console milestone. The task documents should be treated as assigned work, not as evidence that the exercises have been solved.

## 3. Daily / Topic-wise Progress

Dates below use India local time. GitHub commit timestamps were converted from UTC where necessary.

### 28 October
- Extended the Runtime Polymorphism lesson.
- Added the engine stop operation and an ElectricEngine example.
- Updated the runner to demonstrate interchangeable engine implementations.
- Added a Diesel/Electric polymorphism demonstration.

### 29 October
- Updated the Car API to coordinate engine start and stop.
- Completed Engine interface implementation updates.
- Added the constructor-validation lesson and its example files.
- Preserved the earlier Runtime Polymorphism theory in Lesson 3.
- Added Lesson 6 — Car System Class Design Review, including Petrol/Diesel/Electric implementations, a Car that validates and delegates to Engine, a runner, and a design-review checklist.

### 30 October
- No Phase 08 repository commits were found for this local calendar date.

### 31 October
- Added Lesson 7 — Console-Based Car System.
- Added the `Main.java` menu starter with TODOs and a milestone checklist.
- Added Lesson 8 — Engine Selection + Dependency Injection.
- Updated the Phase 08 index.

### 1 November
- Added Lesson 9 — Connect Start/Stop Menu with Selected Engine.
- Added Lesson 10 — Handle Invalid Inputs and Exceptions.
- Updated the Phase 08 index through Lesson 10.

### 26–27 October
- No Phase 08 repository commits were found for these dates in the reviewed Git history.

## 4. Debugging, Design Review, and Issues

### Confirmed documentation/code mismatch

In `Lesson-04-Validation-Error-Handling/Car.java`, the constructor uses:

```java
this.engine = Objects.requireNonNull(engine, "Engine cannot be null");
```

This throws **NullPointerException** when the argument is null. However, the lesson README says the constructor throws **IllegalArgumentException** and shows a catch block for that exception.

**Recommended correction:** use an explicit null check that throws `IllegalArgumentException`, or update the README and example catch block to consistently describe `NullPointerException`. Do not leave the code and explanation disagreeing.

### Design progression worth retaining

- Lesson 5 demonstrates state checks in Car.
- Lesson 6 moves engine-running state ownership into the Engine implementation and has Car delegate to it.
- This is a useful design evolution: avoid two independent running flags unless synchronization is deliberately designed.

### Input-handling gap

The tracked Lesson 7 `Main.java` still calls `scanner.nextInt()` without a try-catch. Therefore, text input such as `hello` would still throw `InputMismatchException` if the starter were run as-is. Lesson 10 documents the fix, but the fix has not yet been applied to the Java source.

## 5. Coding and Test / Output Status

| Area | Status | Evidence |
|---|---|---|
| Engine abstractions and example implementations | Present in repository | Java files in Lessons 1–6 |
| Class-design review | Documented | Lesson 6 README and checklist |
| Console menu | Starter only | Lesson 7 Main.java contains TODOs |
| Engine selection in Main | Not implemented in tracked starter | TODO remains |
| Start/stop menu wiring | Not implemented in tracked starter | TODO remains |
| InputMismatchException handling | Documented, not integrated | Lesson 10 README; Lesson 7 still uses unguarded nextInt() |
| Runtime compile/test result | Not verified | No test logs or execution transcript found |
| Expected console output | Described in lesson notes | No captured actual run output found |

No claim of successful compilation or runtime testing is made in this report.

## 6. Learning Gaps / Pending Work

1. Complete the Lesson 7 `Main.java` implementation.
2. Connect the engine-selection switch to PetrolEngine, DieselEngine, and ElectricEngine.
3. Validate the selected Engine before constructing Car.
4. Create exactly one Car before the menu loop and reuse it.
5. Connect Start and Stop menu cases to `car.startCar()` and `car.stopCar()`.
6. Add recoverable handling for non-integer input and consume the invalid input.
7. Resolve the Lesson 4 constructor exception mismatch.
8. Run and record the manual test cases; include actual console output in the repository.

## 7. Next Week's Plan

### Priority 1 — Finish the console Car System
- Complete engine selection.
- Construct one Car with the selected Engine.
- Wire Start, Stop, and Exit menu options.
- Keep the same Car object for the entire menu session.

### Priority 2 — Make input handling robust
- Handle unsupported integer choices with `default`.
- Catch `InputMismatchException`.
- Consume invalid input before asking again.
- Reject a null Engine before creating Car.

### Priority 3 — Test and document
Run and record these scenarios:

1. Petrol: start, stop, exit.
2. Diesel: start twice, then stop; verify duplicate-start behavior.
3. Electric: stop while already stopped; verify the designed behavior.
4. Invalid engine selection.
5. Invalid integer menu choice such as `5`.
6. Text input such as `hello`, followed by a valid choice.
7. Null Engine constructor validation.

Add the actual output or a test-results file, then update the milestone checklist based on what was genuinely completed.

## 8. Overall Roadmap / Phase Progress

| Area | Current status |
|---|---|
| Phase 08 lesson coverage | 11 entries indexed; two retain the Lesson 4 label |
| Concepts / notes | Lessons 1–10 documented |
| Java examples | 36 Java source files across Lessons 1–7 |
| Console Car System | In progress; starter skeleton is present |
| Coding tasks | Defined; Lesson 7 implementation not yet submitted |
| Testing | No execution logs or test results recorded |
| Phase status | **In Progress** |

The repository's older Phase 01 progress placeholder remains unchanged because this week's evidence relates to Phase 08. The Phase 08 progress snapshot is maintained in [PHASE-08.md](../phases/PHASE-08.md).

---

**Weekly outcome:** Strong progress on the design and documentation of the Real-World OOP Car System. The next measurable milestone is not another theory note; it is a completed, tested `Main.java` that connects engine selection, dependency injection, menu operations, and exception handling.
