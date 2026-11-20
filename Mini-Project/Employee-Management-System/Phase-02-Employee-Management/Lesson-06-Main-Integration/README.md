# Lesson 6 — Main.java EmployeeService Integration

**Status:** ✅ Integration output passed

## Workflow
- Create `EmployeeService`.
- Create Rahul (ID 101) and Priya (ID 102).
- Add both employees.
- Display employees.
- Search for employee 101.
- Update Rahul's department from IT to Finance.
- Delete Priya (ID 102).
- Display the final list.

## Submitted console output
```text
ID: 101, Name: Rahul, Dept: IT
ID: 102, Name: Priya, Dept: HR
Department updated successfully!
Employee deleted successfully!
ID: 101, Name: Rahul, Dept: Finance
```

The output matched the expected workflow and Phase 2 was declared complete in the source conversation.

## Verification note
The export shows the successful add/display/update/delete flow. It recommends additionally checking `searchEmployee(102)` after deletion; that specific post-delete lookup is not evidenced as run.
