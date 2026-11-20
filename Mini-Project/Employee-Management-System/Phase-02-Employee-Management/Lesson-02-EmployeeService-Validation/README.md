# Lesson 2 — EmployeeService Validation

**Status:** ✅ Passed

## Objective
Protect the employee collection from invalid records and duplicate IDs.

## Concepts
- A null reference can be stored in an ArrayList, but later dereferencing it can cause NullPointerException.
- Use `searchEmployee(employee.getEmployeeId())` to detect duplicate IDs.
- Use an early `return` to stop the method after a rejected input.
- Declare the collection using the `List<Employee>` interface and instantiate an `ArrayList` for implementation flexibility.
- Return `Collections.unmodifiableList(employees)` when exposing a read-only view.

## Reviewed implementation
```java
public void addEmployee(Employee employee) {
    if (employee == null) {
        System.out.println("Invalid employee!");
        return;
    }

    if (searchEmployee(employee.getEmployeeId()) != null) {
        System.out.println("Employee ID already exists!");
        return;
    }

    employees.add(employee);
}
```

## Review
| Check | Result |
|---|---|
| Null employee rejected | Pass |
| Duplicate ID rejected | Pass |
| Valid employee added | Pass |
| Early return understood | Pass |

**Score:** 10/10

## Follow-up
Consider using exceptions or a clear result type instead of console messages in service-layer code. This is an improvement idea, not part of the passed exercise.
