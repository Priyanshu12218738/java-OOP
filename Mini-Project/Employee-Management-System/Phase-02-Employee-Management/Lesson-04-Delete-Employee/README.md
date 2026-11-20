# Lesson 4 — Delete Employee

**Status:** ✅ Passed

## Objective
Delete an employee using the employee ID.

## Reviewed implementation
```java
public boolean deleteEmployee(int employeeId) {
    Employee emp = searchEmployee(employeeId);

    if (emp == null) {
        System.out.println("Employee not found!");
        return false;
    }

    employees.remove(emp);
    System.out.println("Employee deleted successfully!");
    return true;
}
```

## Concepts
- `ArrayList.remove(index)` removes by index.
- `ArrayList.remove(object)` removes the matching object.
- Returning `false` communicates that the requested employee was not found.
- Returning `true` communicates successful deletion.

## Review
Search, missing-employee handling, object removal, and return values were all reviewed as correct.

**Score:** 10/10
