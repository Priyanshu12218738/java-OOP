# Phase 2 — Lesson 1: Employee Class & Encapsulation

**Project:** Employee Management System  
**Language:** Java  
**Status:** In Progress

## 1. Connection to Phase 1

Phase 1 established the system requirements and conceptual design. Phase 2 begins implementation. In this lesson, create the Employee model and practice encapsulation.

Do not implement CRUD, salary, attendance, payroll, or notifications yet.

## 2. Employee Attributes

| Attribute | Java type | Purpose |
|---|---|---|
| employeeId | int | Employee identifier |
| name | String | Employee name |
| email | String | Employee email |
| department | String | Employee department |

Employee category (Permanent, Contract, Intern) is part of the hierarchy discussed in Phase 1 and will be implemented in the relevant phase.

## 3. Encapsulation

Encapsulation keeps data inside the class and exposes controlled operations to read or update it.

- Declare fields private.
- Initialize the object through a constructor.
- Use getters to read values.
- Use setters to update values with validation.

## 4. Starter Structure

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

## 5. Coding Tasks

### Task A — Fields

- [ ] Declare all four fields as private.

### Task B — Constructor

- [ ] Create a constructor accepting all four attributes.
- [ ] Initialize every field.

### Task C — Getters

- [ ] Create getters for all four fields.

### Task D — Setters and Validation

- [ ] employeeId must be greater than zero.
- [ ] name must not be null or blank.
- [ ] email must not be null or blank.
- [ ] department must not be null or blank.
- [ ] Reject invalid values using a suitable exception.

### Task E — Main Method Test

Create an Employee with:

- ID: 101
- Name: Rahul Sharma
- Email: rahul@example.com
- Department: Engineering

Print the values using getters. Update the department using its setter and print it again.

## 6. Expected Output (Illustrative)

```text
Employee ID: 101
Name: Rahul Sharma
Email: rahul@example.com
Department: Engineering
Updated Department: Platform Engineering
```

## 7. Concept Check

1. Why are Employee fields private?
2. What is the difference between a getter and a setter?
3. Why should validation happen inside the constructor or setter?
4. What issue can arise from a zero or negative employee ID?
5. Does encapsulation mean other classes cannot access Employee data at all?

## 8. Completion Criteria

- [ ] Employee.java compiles.
- [ ] Constructor initializes all fields.
- [ ] Getters return expected values.
- [ ] Setters update valid values.
- [ ] Invalid values are rejected.
- [ ] Code and concept-check answers are reviewed.

**Next:** Lesson 2 — Employee Validation & Object State.
