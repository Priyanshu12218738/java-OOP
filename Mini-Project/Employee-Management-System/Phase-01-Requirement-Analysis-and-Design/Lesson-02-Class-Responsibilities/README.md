# Lesson 2 — Class Responsibilities

**Phase:** 1 — Requirement Analysis & Design  
**Status:** ✅ Complete

## Responsibility Mapping

| Class | Primary responsibility |
|---|---|
| Employee | Employee information |
| EmployeeService | Employee CRUD operations |
| SalaryCalculator | Salary calculation |
| AttendanceService | Attendance records |
| PayrollService | Monthly payroll processing |
| NotificationService | Notification handling |
| ReportService | Report generation |

## Key Design Rule

A class should have one primary responsibility. For example, EmployeeService should not also calculate salaries. Salary calculation belongs to SalaryCalculator.

## Payroll Scenario

When processing an employee's monthly salary, PayrollService coordinates the workflow:

1. Obtain employee information.
2. Ask SalaryCalculator to calculate salary.
3. Use attendance information for applicable deductions.
4. Process the final payroll.
5. Send a notification through a notification abstraction.

PayrollService coordinates the process; it should not own every calculation and delivery implementation.

## Dependency Injection Discussion

The learner correctly identified that PayrollService should receive a Notification abstraction rather than directly constructing EmailNotification or SMSNotification.

Conceptual example:

```java
interface Notification {
    void send(String message);
}

class PayrollService {
    private Notification notification;

    public PayrollService(Notification notification) {
        this.notification = notification;
    }
}
```

## Completion Evidence

All three follow-up design answers were evaluated as correct: salary calculation stays in SalaryCalculator, notification is injected through an abstraction, and PayrollService should not need to change merely because salary calculation internals change. A stable contract is important if method signatures evolve.
