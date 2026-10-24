# Milestone 4 — Car State Management Coding Challenge

## Your Task

Implement state management in the `Car` class yourself before checking the lesson example.

### Requirements

- [ ] Keep the engine reference as `private final Engine engine`.
- [ ] Add a private boolean `isRunning`, initially `false`.
- [ ] In `startCar()`, prevent starting when the car is already running.
- [ ] Call `engine.start()` before setting `isRunning = true`.
- [ ] In `stopCar()`, prevent stopping when the car is already stopped.
- [ ] Call `engine.stop()` before setting `isRunning = false`.
- [ ] Test the sequence: start, start again, stop, stop again.

## Design Questions

1. Why should `isRunning` be private?
2. Why should the state change only after the engine operation returns successfully?
3. What could happen if an engine operation throws an exception or changes the real engine state before failing?

## Expected Behavior

The first start and stop should invoke the engine. Duplicate start/stop calls should display a message and return without invoking the engine again.

Try the implementation first, then compare it with the lesson files or submit your code for review.
