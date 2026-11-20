# Lesson 7 — Liskov Substitution Principle (LSP)

**Status:** ✅ Positive-case understanding passed

## Principle
A child-class object should be usable wherever the parent-class type is expected without breaking the program's expected behaviour.

The conversation checked that a `ContractEmployee` stored in an `Employee` reference can correctly return its salary through `calculateSalary()`.

The learner correctly identified this as a positive LSP example.

## Important qualification
The conversation also notes that one successful call is only a positive example; full LSP compliance requires child classes to respect all applicable parent-class contracts.
