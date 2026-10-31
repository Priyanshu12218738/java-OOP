# Phase 8 — Lesson 10: Handle Invalid Inputs and Exceptions

## Goal

Make the console-based Car System more robust so that invalid user input is handled gracefully instead of unexpectedly terminating the application.

## 1. Why Do We Need Error Handling?

The menu offers these options:

```text
1. Start Car
2. Stop Car
3. Exit
```

Two different invalid-input situations can occur:

- The user enters an integer that is not a supported menu option, such as `5`.
- The user enters text instead of an integer, such as `hello`.

These situations require different handling.

## 2. Situation 1 — Invalid Integer Menu Choice

Use the `default` branch of a `switch` statement:

```java
switch (choice) {
    case 1:
        car.startCar();
        break;

    case 2:
        car.stopCar();
        break;

    case 3:
        exit = true;
        break;

    default:
        System.out.println("Invalid choice! Try again.");
}
```

If the user enters an integer other than 1, 2, or 3, the `default` branch executes.

This is ordinary input validation; an exception is not required for this case.

## 3. Situation 2 — User Enters Text Instead of a Number

When using `Scanner.nextInt()`, entering text such as `hello` causes Java to throw an `InputMismatchException`.

Handle it with `try-catch`:

```java
try {
    int choice = sc.nextInt();

} catch (InputMismatchException e) {
    System.out.println("Please enter a valid number.");
    sc.nextLine();
}
```

### Important Concepts

- **try:** Contains code that may throw an exception.
- **catch:** Handles a matching exception if one is thrown.
- **InputMismatchException:** Can occur when the next input token does not match the expected type.
- **sc.nextLine():** Consumes the remaining input on the current line. This prevents the same invalid token from being read repeatedly by the next input attempt.

Import the exception with:

```java
import java.util.InputMismatchException;
```

Alternatively, `import java.util.*;` includes it.

### Important Scanner Detail

After `nextInt()` successfully reads an integer, the newline remains in the input buffer. If the program later uses `nextLine()` to read a full line, consume that pending newline when appropriate.

## 4. Situation 3 — Null Engine Validation

The `Car` constructor should reject a null engine dependency:

```java
Car(Engine engine) {
    if (engine == null) {
        throw new IllegalArgumentException("Engine cannot be null");
    }

    this.engine = engine;
}
```

If an invalid dependency is supplied, the constructor throws an exception and the invalid `Car` object is not created.

This validation protects the class from being constructed in an invalid state.

## 5. Validation, Throwing, and Catching

| Concept | Responsibility |
|---|---|
| Validation | Checks whether an input or dependency is acceptable. |
| throw | Reports an exceptional situation by throwing an exception. |
| catch | Handles an exception thrown by code in the associated try block. |

These concepts are related, but they are not interchangeable. A normal invalid menu number can be handled with a `default` branch, while a type mismatch from `nextInt()` requires exception handling.

## 6. Implementation Checklist

- [ ] Handle unsupported integer menu choices using `default`.
- [ ] Catch `InputMismatchException` when the user enters text instead of a number.
- [ ] Consume invalid input so the menu can ask again.
- [ ] Keep the menu running after recoverable invalid input.
- [ ] Validate the selected engine before constructing the Car.
- [ ] Ensure the Car constructor rejects a null Engine dependency.
- [ ] Test valid choices, invalid integers, and text input.

## Key Design Rule

**Handle expected invalid user input at the input boundary, and protect class invariants through constructor validation.**

This keeps the console interaction resilient while ensuring the `Car` object is only created with a valid engine dependency.
