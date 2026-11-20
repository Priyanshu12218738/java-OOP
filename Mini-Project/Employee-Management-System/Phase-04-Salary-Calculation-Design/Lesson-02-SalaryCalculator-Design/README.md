# Lesson 2 — SalaryCalculator Design

**Status:** ✅ Passed (9/10)

## Objective
Create a separate `SalaryCalculator` class that delegates calculation to the employee object.

## Reviewed design
```java
public class SalaryCalculator {
    public double calculate(Employee employee) {
        return employee.calculateSalary();
    }
}
```

The learner correctly understood that `SalaryCalculator` does not need subtype checks: runtime polymorphism invokes the correct overridden method.

## Review notes
- The `calculate(Employee employee)` method was logically correct.
- An unnecessary static field and a misspelled `Emoloyee` type appeared in the first submission; the corrected design removes that field.
- The corrected class was marked passed.

## Design outcomes
- SRP: salary-calculation coordination is separated from employee management.
- Polymorphism: the concrete employee implementation supplies the formula.
- Low coupling: the calculator depends on `Employee`, not individual subclasses.
