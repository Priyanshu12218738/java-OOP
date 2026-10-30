# Milestone 7 — Console-Based Car System

## Your Task

Complete the console application using the existing `Engine` and `Car` design.

### Engine Selection

- [ ] Display options for Petrol, Diesel, and Electric engines.
- [ ] Read the user's selection.
- [ ] Create the matching engine object.
- [ ] Handle invalid selections and do not create a car for an invalid choice.

### Menu Loop

- [ ] Create one `Car` object after engine selection and before the loop.
- [ ] Option 1 calls `startCar()`.
- [ ] Option 2 calls `stopCar()`.
- [ ] Option 3 exits the loop.
- [ ] Invalid menu choices display a helpful message.
- [ ] Reuse the same `Car` object for every menu operation.

### Testing

Test at least these scenarios:

1. Select Petrol, start, stop, and exit.
2. Select Diesel, start twice, stop, and exit.
3. Select Electric, stop while already stopped, then exit.
4. Enter an invalid engine selection.
5. Enter an invalid menu option.

## Design Questions

1. Why should engine selection happen before the menu loop?
2. Why should the `Car` object be created only once?
3. Which class should handle user input?
4. Why should `Car` not contain menu or `Scanner` logic?

Submit your completed `Main.java` for review before moving to the next milestone.
