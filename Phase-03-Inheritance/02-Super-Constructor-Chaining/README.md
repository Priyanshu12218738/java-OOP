# super() in Constructors (Constructor Chaining)

## Problem

1. Create a parent class `Person` with a parameterized constructor that accepts `String name` and prints `Person name is: ` followed by the name.
2. Create a child class `Employee` that extends `Person`.
3. Create a parameterized `Employee` constructor that accepts `String name` and `int id`.
4. Use `super(name);` as the first statement to call the parent constructor, then print the employee ID.
5. Create an `Employee` object with `"Rahul"` and `101`.

## Key Learning

- **super():** Calls a parent class constructor.
- The call to `super()` must be the first statement in a constructor.
- **Constructor chaining:** Constructor execution moves from the child constructor to the parent constructor through `super()`.
- The parent constructor executes before the remaining statements in the child constructor.

## Output

```text
Person name is: Rahul
Employee ID is: 101
```

## Status

- Phase: Phase 03
- Topic: super() in Constructors
- Problem: Solved
- Status: Completed
