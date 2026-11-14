# Lesson 5 — UML Class Diagram

**Phase:** 1 — Requirement Analysis & Design  
**Status:** ✅ Complete

## Purpose

Represent the main Employee Management System classes and their relationships before implementation.

## Important Relationships Discussed

- PayrollService uses SalaryCalculator.
- PayrollService uses AttendanceService.
- PayrollService depends on a Notification abstraction.
- EmailNotification implements Notification.
- SMSNotification implements Notification.

The design discussion also separates Employee information, employee subtypes, and supporting services.

## Payroll Dependencies

PayrollService needs employee information and salary-calculation behavior. The lesson's conceptual example injects SalaryCalculator through the constructor and passes Employee to processPayroll:

```java
class PayrollService {
    private SalaryCalculator salaryCalculator;

    public PayrollService(SalaryCalculator salaryCalculator) {
        this.salaryCalculator = salaryCalculator;
    }

    public void processPayroll(Employee employee) {
        double salary = salaryCalculator.calculateSalary(employee);
        System.out.println("Salary: " + salary);
    }
}
```

## Design Decisions Reviewed

1. Salary calculation belongs in a separate SalaryCalculator class (SRP).
2. PayrollService needs Employee data and SalaryCalculator functionality.
3. Constructor injection supplies the SalaryCalculator dependency; Employee is supplied as a method argument in the example.

## UML Deliverable

Create or maintain a class diagram showing:

- Employee as the common abstraction.
- PermanentEmployee, ContractEmployee, and InternEmployee as employee subtypes.
- Separate service classes for employee management, salary, attendance, payroll, notifications, and reporting.
- Notification abstraction and its concrete implementations.

The source conversation labels the architecture as conceptual; detailed relationships are to be finalized during implementation.
