# Milestone 5 — Exception Handling Coding Challenge

## Your Task

Update the Car System so invalid state transitions can be detected by the calling code.

### Requirements

- [ ] Keep `Engine` with `start()` and `stop()`.
- [ ] Keep the engine dependency injected through the `Car` constructor.
- [ ] Throw `IllegalStateException` if `startCar()` is called while the car is already running.
- [ ] Throw `IllegalStateException` if `stopCar()` is called while the car is already stopped.
- [ ] Update `isRunning` only after the engine operation returns successfully.
- [ ] Use `try/catch` in `Main` to handle each invalid operation.
- [ ] Print the exception message using `e.getMessage()`.

## Think About It

1. Why is a printed message different from a thrown exception?
2. Why does `IllegalStateException` not require a `throws` declaration?
3. Why should you catch a specific exception rather than catching every exception indiscriminately?

## Expected Behavior

A valid start/stop operation should call the engine. Repeating the same operation in an invalid state should throw an exception that the caller can catch and report.

Try implementing the challenge yourself before comparing it with the lesson example.
