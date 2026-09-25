# Encapsulation & Data Hiding (Getter and Setter)

## Problem

Create a `User` class with a `private String password`.

Implement:
- A setter `setPassword(String p)` that sets the password only when `p.length() > 5`.
- Print `Password too short!` when the password does not satisfy the rule.
- A getter `getPassword()` that returns the password.
- In the main class, test a short password and a valid longer password, then print the returned password.

## Solution

The `password` field is private, so it cannot be accessed directly from outside the `User` class. The setter controls how the value is changed, while the getter provides controlled access to the value.

## Key Learning

- **Encapsulation:** Bundling data and the methods that operate on it inside a class.
- **Data Hiding:** Keeping sensitive/internal data private.
- **Setter:** Controls how a field is modified.
- **Getter:** Provides controlled access to a field's value.
- The setter can enforce validation rules before changing the object's state.

## Output

```text
Password too short!
Password set successfully!
Current Password: MyPassword123
```

## Status

- Phase: Phase 02
- Topic: Encapsulation & Data Hiding
- Problem: Solved
- Status: Completed
