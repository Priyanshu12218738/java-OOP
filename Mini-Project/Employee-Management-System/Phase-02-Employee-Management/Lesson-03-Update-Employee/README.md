# Lesson 3 — Update Employee

**Status:** ✅ Passed

## Objective
Find an employee by ID and update the employee's department.

## Required behaviour
1. Call `searchEmployee(employeeId)`.
2. Return `false` if no employee exists.
3. Call `setDepartment(newDepartment)` when found.
4. Return `true` after a successful update.

## Reviewed implementation
```java
public boolean updateDepartment(int employeeId, String newDepartment) {
    Employee emp = searchEmployee(employeeId);

    if (emp == null) {
        System.out.println("Employee not found!");
        return false;
    }

    emp.setDepartment(newDepartment);
    System.out.println("Department updated successfully!");
    return true;
}
```

The learner correctly identified that a setter changes a field while a getter reads it.

## Review
- Missing employee returns `false`.
- Existing employee's department is updated.
- Successful update returns `true`.

**Score:** 10/10

## Improvement noted
Empty or blank department values should also be rejected; this was suggested as a future improvement and was not shown as implemented in the export.
