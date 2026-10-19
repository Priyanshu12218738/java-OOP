# Lesson 4 — Interface Segregation Principle (ISP)

## Why ISP Is Needed

A broad `Worker` interface with both `work()` and `eat()` forces every implementing class to provide both methods. A `RobotWorker` does not eat, so implementing `eat()` is unnecessary.

## Principle

The Interface Segregation Principle states that clients should not be forced to depend on methods they do not use.

## Improved Design

Split the broad interface into focused interfaces:
- `Workable` — defines `work()`.
- `Eatable` — defines `eat()`.

Then:
- `HumanWorker` implements both `Workable` and `Eatable`.
- `RobotWorker` implements only `Workable`.

## Real-World Analogy

A restaurant may separate `Cookable` and `Billable` interfaces. A worker can implement only the role(s) they actually perform.

## ISP vs. SRP

| Principle | Focus |
|---|---|
| SRP | A class or module's responsibilities |
| ISP | Interface methods and the needs of the classes that implement or use them |

They are related but not the same principle.

## Output

```text
Human is working
Human is eating
Robot is working
```

## Status

- Phase: Phase 07 — Java OOP Design Principles
- Lesson: 04 — Interface Segregation Principle
- Violation and improved examples: Added
- Ordering: Before Lesson 07 — Dependency Inversion Principle
- Status: Recorded
