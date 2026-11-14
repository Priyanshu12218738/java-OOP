# Lesson 3 — Employee Types & LSP

**Phase:** 1 — Requirement Analysis & Design  
**Status:** ✅ Concept covered

## Scenario

The company has different employee categories:

| Type | Example monthly amount | Employment model |
|---|---:|---|
| PermanentEmployee | ₹30,000 | Permanent |
| ContractEmployee | ₹20,000 | Contract |
| InternEmployee | ₹10,000 | Internship stipend |

These are illustrative values from the lesson scenario.

## Shared Employee Abstraction

The employee types share common information such as employee ID, name, and email. The design therefore introduces a common Employee parent abstraction.

```java
abstract class Employee {
    protected int employeeId;
    protected String name;

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public abstract double calculateSalary();
}
```

Each concrete employee type supplies its own salary behavior by overriding calculateSalary().

## OCP — Open/Closed Principle

A future employee category such as InternEmployee should be added as a new subtype, rather than adding employee-type checks throughout PayrollService.

## LSP — Liskov Substitution Principle

A child class should be usable wherever the parent abstraction is expected without breaking expected behavior.

Example:

```java
Employee employee = new ContractEmployee(102, "Amit");
```

The ContractEmployee object should honor the Employee contract.

## Concept Check

1. What should be the common parent abstraction?
2. Why is adding a new employee subtype preferable to scattering new if/else branches through PayrollService?
3. What does it mean for a subtype to be substitutable for Employee?

## Completion Evidence

The lesson introduced PermanentEmployee, ContractEmployee, and InternEmployee, and the learner correctly answered all three MCQs on the parent class, OCP extension, and LSP substitutability.
