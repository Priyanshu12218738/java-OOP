# Phase 2 — Lesson 1: Employee Class & Encapsulation

**Project:** Employee Management System  
**Language:** Java  
**Learning style:** Step-by-step, Hinglish  
**Status:** In Progress

## 1. Where We Are

Phase 1 mein humne requirements, class responsibilities, employee hierarchy, abstraction, polymorphism, UML relationships aur SOLID fundamentals cover kiye.

Ab hum design se practical Java implementation ki taraf move kar rahe hain.

Is lesson mein sirf `Employee` model class banayenge. Abhi CRUD operations, salary calculation, attendance, payroll ya notifications implement nahi karne hain.

## 2. Lesson Objective

By the end of this lesson, you should be able to:

- Create an `Employee` class.
- Keep employee data private using encapsulation.
- Initialize an employee through a constructor.
- Access data through getters.
- Update data through controlled setters.
- Explain why employee details should not be directly modified from outside the class.

## 3. Understand the Employee Data

Earlier design discussion identified these employee details:

| Attribute | Suggested Java type | Purpose |
|---|---|---|
| employeeId | `int` | Unique employee identifier |
| name | `String` | Employee name |
| email | `String` | Employee email |
| department | `String` | Employee department |

Employee type (Permanent, Contract, Intern) belongs to the employee hierarchy discussed in Phase 1. We will connect the concrete employee types in the relevant implementation lessons.

## 4. Concept — Encapsulation

Encapsulation ka simple meaning hai: data ko class ke andar protect karna aur controlled methods ke through access/update karna.

**Without encapsulation:**

```java
class Employee {
    public String name;
}
```

Outside code can directly change the value:

```java
employee.name = "";
```

Is design mein class apne data ko protect nahi kar paati.

**With encapsulation:**

- Fields ko `private` rakho.
- Constructor se initial values set karo.
- Getter se value read karo.
- Setter se value update karo, aur update se pehle validation karo.

## 5. Expected Class Shape

Use this as a design guide, not as a complete solution:

```java
public class Employee {

    private int employeeId;
    private String name;
    private String email;
    private String department;

    // TODO: Constructor

    // TODO: Getters

    // TODO: Setters with validation
}
```

For this first implementation exercise, create a regular `Employee` class. We will connect it to the abstract employee hierarchy and employee subtypes in the next relevant implementation lesson, keeping the responsibilities from our Phase 1 design in view.

## 6. Your Coding Task

Create a Java file named `Employee.java`.

### Task A — Fields

- [ ] Declare `employeeId` as `private int`.
- [ ] Declare `name` as `private String`.
- [ ] Declare `email` as `private String`.
- [ ] Declare `department` as `private String`.

### Task B — Constructor

Create a constructor that accepts all four values and initializes the object.

### Task C — Getters

Create getter methods for all four fields.

### Task D — Setters

Create setter methods with basic validation:

- [ ] `employeeId` must be greater than zero.
- [ ] `name` must not be null or blank.
- [ ] `email` must not be null or blank.
- [ ] `department` must not be null or blank.

Choose a suitable exception for invalid values and be ready to explain your choice.

### Task E — Test in Main

Create an object with sample data and print its details using getters.

Use sample data such as:

- Employee ID: `101`
- Name: `Rahul Sharma`
- Email: `rahul@example.com`
- Department: `Engineering`

Then try updating the department through its setter and print the updated value.

## 7. Expected Output (Illustrative)

```text
Employee ID: 101
Name: Rahul Sharma
Email: rahul@example.com
Department: Engineering

Updated Department: Platform Engineering
```

Your exact output formatting may differ.

## 8. Concept Check

Answer these in your own words:

1. Why are the Employee fields declared `private`?
2. What is the difference between a getter and a setter?
3. Why should validation happen inside the setter or constructor instead of trusting every caller?
4. What problem can occur if `employeeId` is allowed to be zero or negative?
5. Does encapsulation mean that no other class can access Employee data at all? Explain.

## 9. Completion Criteria

This lesson will be marked complete after:

- [ ] `Employee.java` compiles successfully.
- [ ] Constructor initializes all fields.
- [ ] Getters return the expected values.
- [ ] Setters update valid values.
- [ ] Invalid values are rejected.
- [ ] You submit your code and concept-check answers for review.

## Next Lesson

**Phase 2 — Lesson 2: Employee Validation & Object State**

We will review your implementation, improve validation where needed, and make sure an Employee object cannot enter an invalid state.

---

**Rule:** Write the code yourself. Submit your `Employee.java` and `Main.java`; the implementation will be reviewed line by line before moving ahead.
