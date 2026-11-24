# Lesson 5 — EmployeeService Testing

**Status:** ✅ Knowledge checks passed

## Objective
Verify that EmployeeService supports the core employee search and CRUD operations and rejects invalid operations.

## Test Data
| ID | Name | Department |
|---:|---|---|
| 101 | Rahul | IT |
| 102 | Priya | HR |
| 103 | Aman | Sales |

## Scenarios Reviewed
1. Search for an existing employee ID and retrieve the matching employee.
2. Search for a missing employee ID (999) and receive the not-found result (`null` in the discussed design).
3. Delete employee 102 and confirm that two employees remain.
4. Update a missing ID (999) and return `false`.
5. Add another employee with duplicate ID 101 and reject the duplicate.

All three knowledge-check answers recorded in the original conversation were evaluated as correct. The additional search scenarios are included here to make the full CRUD/search requirement explicit.

## Regression Checklist
- [ ] Search existing ID.
- [ ] Search missing ID.
- [ ] Add valid employee.
- [ ] Reject duplicate ID.
- [ ] Update existing and missing IDs.
- [ ] Delete existing and missing IDs.
- [ ] Verify list contents after each operation.

## Next
The following lesson performs end-to-end integration through Main.java.
