# Phase 8 — Lesson 9: Connect Start/Stop Menu with Selected Engine

## Goal

Connect the console menu to the selected engine through one `Car` object. The user should be able to start and stop the selected car repeatedly and exit the application.

## 1. Why Is This Lesson Important?

The earlier lessons introduced the individual parts of the application:

- Engine selection.
- Creating a `Car` object.
- The `startCar()` and `stopCar()` methods.
- Managing the engine's running state.

Now these parts are connected so the user can operate the car through the console.

## 2. Expected Menu Flow

Example: the user selects a Diesel engine.

```text
Select Engine:
1. Petrol
2. Diesel
3. Electric

Choose: 2

Diesel Engine Selected!

1. Start Car
2. Stop Car
3. Exit

Choose: 1
Diesel engine started
Car is ready

Choose: 2
Diesel engine stopped
Car has stopped
```

The exact engine messages depend on the implementation of the selected engine and the `Car` class.

## 3. Main Class Responsibility

The `Main` class is responsible for:

- Reading user input.
- Receiving the selected `Engine` object (created from the engine selection).
- Creating one `Car` object and injecting the engine.
- Displaying the menu repeatedly.
- Calling the appropriate `Car` method based on the user's choice.
- Exiting the loop when the user chooses Exit.

The `Main` class should coordinate the application, not implement engine behavior itself.

## 4. Connect the Menu to Car

Once a valid engine has been selected and created:

```java
Scanner sc = new Scanner(System.in);

Car car = new Car(engine);

boolean exit = false;

while (!exit) {
    System.out.println("1. Start Car");
    System.out.println("2. Stop Car");
    System.out.println("3. Exit");

    int choice = sc.nextInt();

    switch (choice) {
        case 1:
            car.startCar();
            break;

        case 2:
            car.stopCar();
            break;

        case 3:
            exit = true;
            System.out.println("Exiting...");
            break;

        default:
            System.out.println("Invalid choice");
    }
}
```

This is the menu integration structure. Place it after successful engine selection.

## 5. Code Explanation

- `Car car = new Car(engine);` — injects the selected engine into the car through its constructor.
- `while (!exit)` — keeps displaying the menu until the user chooses to exit.
- `switch (choice)` — selects an operation based on the user's input.
- `car.startCar()` — asks the car to start.
- `car.stopCar()` — asks the car to stop.
- `exit = true` — causes the menu loop to terminate.

## 6. Important: Create Car Outside the Loop

Create the `Car` object once, before entering the menu loop.

**Correct:**

```java
Car car = new Car(engine);

while (!exit) {
    // Display menu and operate the same car.
}
```

**Avoid:**

```java
while (!exit) {
    Car car = new Car(engine); // A new Car on every iteration
    // ...
}
```

Creating a new car on every iteration can reset the application's object state and prevent the menu from operating on the same car instance.

## 7. How the Calls Flow Through the Application

```text
User chooses Start or Stop
          |
          v
        Main
          |
          v
   car.startCar() / car.stopCar()
          |
          v
         Car
          |
          v
   Injected Engine reference
          |
          v
Petrol / Diesel / Electric implementation
```

`Main` calls `Car`; `Car` delegates the engine operation to the injected `Engine` implementation. This preserves the separation of responsibilities.

## 8. Implementation Checklist

- [ ] Complete engine selection before creating the car.
- [ ] Handle an invalid engine selection without passing null to the Car constructor.
- [ ] Create exactly one `Car` object before the menu loop.
- [ ] Call `car.startCar()` for Start Car.
- [ ] Call `car.stopCar()` for Stop Car.
- [ ] Keep the same Car object for every menu operation.
- [ ] Handle invalid menu choices.
- [ ] Exit cleanly when the user chooses Exit.
- [ ] Close the Scanner when the application finishes.

## Key Design Rule

**Main handles user interaction. Car coordinates car operations. The selected Engine performs engine-specific behavior.**

This completes the connection between engine selection, constructor dependency injection, and the console menu.
