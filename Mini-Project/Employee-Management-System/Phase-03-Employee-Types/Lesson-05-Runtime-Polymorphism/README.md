# Lesson 5 — Runtime Polymorphism

**Status:** ✅ Concept check passed

## Objective
Understand how a parent-class reference can refer to a child object and execute the child's overridden method.

Example:
```java
Employee employee = new PermanentEmployee(...);
employee.calculateSalary();
```

The actual object type determines which overridden `calculateSalary()` implementation runs at runtime. The learner correctly identified `PermanentEmployee.calculateSalary()` as the invoked method.
