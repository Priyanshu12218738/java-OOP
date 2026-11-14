# Employee Management System

**Module:** Mini Projects  
**Project type:** Java Console Application  
**Design focus:** OOP, SOLID, Low Coupling, High Cohesion

## Objective

Build an Employee Management System that manages employee records, salary calculation, attendance, notifications, monthly payroll, and reports.

## Project Modules

| Module | Responsibility |
|---|---|
| Employee Management | Add, update, remove, and view employee records |
| Salary Calculation | Calculate salary using employee-specific salary rules |
| Attendance | Track present, absent, and leave |
| Notifications | Send email/SMS notifications |
| Payroll | Process monthly salary, bonuses, and deductions |
| Reporting | Generate employee, attendance, and salary reports |

## Project Roadmap

| Phase | Name | Lessons | Status |
|---|---|---:|---|
| [Phase 1](Phase-01-Requirement-Analysis-and-Design/README.md) | Requirement Analysis & Design | 5 + Final Design Review | ✅ Complete |
| [Phase 2](Phase-02-Employee-Management/README.md) | Employee Management | To be developed | 🔄 In Progress |
| Phase 3 | Employee Types | Planned | ⬜ Not Started |
| Phase 4 | Salary Calculation | Planned | ⬜ Not Started |
| Phase 5 | Attendance Management | Planned | ⬜ Not Started |
| Phase 6 | Notification System | Planned | ⬜ Not Started |
| Phase 7 | Payroll Management | Planned | ⬜ Not Started |
| Phase 8 | Reporting System | Planned | ⬜ Not Started |
| Phase 9 | SOLID Refactoring & Integration | Planned | ⬜ Not Started |
| Phase 10 | Testing & Final Review | Planned | ⬜ Not Started |

## Proposed Architecture

```text
EmployeeManagementSystem
├── model
│   ├── Employee
│   ├── PermanentEmployee
│   ├── ContractEmployee
│   └── InternEmployee
├── interfaces
│   ├── Payable
│   ├── Attendable
│   └── Notifiable
├── employee
│   └── EmployeeService
├── salary
│   ├── SalaryCalculator
│   └── BonusCalculator
├── attendance
│   └── AttendanceService
├── payroll
│   └── PayrollService
├── notification
│   ├── Notification
│   ├── EmailNotification
│   └── SMSNotification
├── reporting
│   └── ReportService
└── Main
```

This is the initial conceptual structure. Detailed class relationships will be finalized as implementation progresses.

## Learning Rules

- Implement the Java code yourself.
- Work through one lesson at a time.
- Submit answers and code for review before moving forward.
- Do not treat a design discussion as proof that implementation or testing is complete.
- Track completed concepts, code, and tests separately.
