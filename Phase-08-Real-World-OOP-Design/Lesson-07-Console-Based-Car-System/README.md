# Phase 8 — Lesson 7: Build a Console-Based Car System

## Goal

Connect the concepts from earlier lessons into an interactive console application. Build the application step by step rather than copying a complete solution.

## 1. Why Do We Need a Menu?

Previously, the engine and car were selected directly in code:

```java
Car car = new Car(new DieselEngine());
car.startCar();
```

A console application should let the user:

- Select an engine.
- Start the car.
- Stop the car.
- Exit the application.

## 2. Responsibility of Each Part

- **Main:** Handles user input, engine selection, and the menu.
- **Car:** Coordinates car operations by calling the engine.
- **Engine:** Defines the common engine contract.
- **PetrolEngine, DieselEngine, ElectricEngine:** Implement engine-specific behavior.

This separation makes the code easier to understand and test.

## 3. Step 1 — Menu Pseudocode

```text
START

Display engine choices
Read user's engine choice
Create selected engine
Create Car using that engine

REPEAT
    Display:
        1. Start car
        2. Stop car
        3. Exit

    Read user's choice

    If choice is 1:
        Start car
    Else if choice is 2:
        Stop car
    Else if choice is 3:
        Exit program
    Else:
        Display invalid choice
UNTIL user exits

END
```

**Important:** Create the selected engine and the `Car` object once, before entering the menu loop. Creating a new `Car` on every iteration can reset its state.

## 4. Step 2 — Java Menu Skeleton

Start with the menu loop in [Main.java](Main.java). The start and stop cases are intentionally left for you to complete.

## Key Code Concepts

- `Scanner` reads console input.
- `while (!exit)` repeats the menu until the user chooses to exit.
- `switch` selects an action based on the user's choice.
- `break` exits the current switch case.
- `default` handles an invalid menu choice.

## Milestone 7 — Your Coding Task

- [ ] Display engine choices: Petrol, Diesel, and Electric.
- [ ] Read the engine selection and create the corresponding implementation.
- [ ] Handle an invalid engine selection without creating a car.
- [ ] Create exactly one `Car` object before the menu loop.
- [ ] Implement Start Car and Stop Car menu options.
- [ ] Implement Exit.
- [ ] Display a message for invalid menu choices.
- [ ] Keep the same car instance throughout the menu session.
- [ ] Close the `Scanner` when the program exits.

Try the implementation yourself and submit your code for review.
