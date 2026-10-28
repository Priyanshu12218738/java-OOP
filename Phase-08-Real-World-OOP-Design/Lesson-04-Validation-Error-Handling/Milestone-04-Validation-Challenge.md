# Milestone — Constructor Validation Challenge

## Your Task

Implement and test constructor validation in the Car System.

- [ ] Ensure `Car` cannot be constructed with a `null` engine.
- [ ] Throw an `IllegalArgumentException` with the message `Engine cannot be null`.
- [ ] Assign the engine field only after the null check succeeds.
- [ ] Catch the exception in `Main` and print its message.
- [ ] Verify that a valid engine still allows the car to start and stop.

## Design Questions

1. Why is it better to reject a null engine in the constructor than to wait until `startCar()`?
2. What is the difference between validating input, throwing an exception, and catching an exception?
3. Why might an invalid menu option be better handled with a user-facing message instead of an exception?

Try the implementation yourself, then compare it with the lesson files.
