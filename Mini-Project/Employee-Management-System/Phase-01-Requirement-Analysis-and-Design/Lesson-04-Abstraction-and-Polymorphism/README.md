# Lesson 4 — Abstraction & Polymorphism

**Phase:** 1 — Requirement Analysis & Design  
**Status:** ✅ Coding challenge reviewed

## Problem

Different employee categories have different salary structures. The lesson uses these illustrative values:

- Permanent employee: ₹30,000
- Contract employee: ₹20,000
- Intern: ₹10,000

## Abstract Contract

The Employee abstraction defines a salary-calculation contract. Concrete employee types implement their own behavior.

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

## Runtime Polymorphism

```java
Employee employee = new ContractEmployee(102, "Amit");
System.out.println(employee.calculateSalary());
```

The reference type is Employee, while the actual object is ContractEmployee. At runtime, Java invokes the overridden method belonging to the actual object.

## Coding Challenge — InternEmployee

Create InternEmployee extending Employee, call the parent constructor using super(id, name), and override calculateSalary() to return the monthly stipend.

Important Java syntax correction from the review:

```java
return 10000;   // valid
// return 10,000; // invalid Java numeric literal
```

The learner's inheritance, constructor chaining, method overriding, and runtime polymorphism were reviewed as correct after correcting the comma in the numeric literal.

## SOLID Connection

- OCP: add another employee subtype through extension.
- LSP: subtypes must respect the Employee contract.
- SRP: the example demonstrates subtype-specific salary behavior for learning; the final project architecture still keeps SalaryCalculator as a separate service.
