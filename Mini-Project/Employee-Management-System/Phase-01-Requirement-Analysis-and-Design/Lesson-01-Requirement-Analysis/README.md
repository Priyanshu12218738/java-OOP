# Lesson 1 — Requirement Analysis

**Phase:** 1 — Requirement Analysis & Design  
**Status:** ✅ Complete

## Why Are We Building This Project?

Imagine a company with 100 employees. HR needs to:

- Maintain employee details.
- Calculate each employee's salary.
- Track attendance.
- Process monthly payroll.
- Send salary notifications.
- Generate reports for management.

Putting all these responsibilities into one class would make it large and difficult to maintain. We will separate responsibilities using OOP and SOLID principles.

## Main Requirements

| Feature | Responsibility |
|---|---|
| Employee Management | Add, update, remove, and view employees |
| Salary Calculation | Calculate employee salary |
| Attendance | Track present, absent, and leave |
| Notifications | Send email/SMS messages |
| Payroll | Process monthly salary |
| Reporting | Generate employee and salary reports |

## Design Questions

1. Which attributes should belong to Employee?
2. Which class should calculate salary?
3. Should attendance be managed separately from Employee? Why?
4. Should email and SMS notifications use separate implementations?
5. How can WhatsApp notification be added later with minimal changes?

## Learning Outcome

The discussion identified employee identity/details as Employee data, while attendance, salary calculation, and payroll are separate responsibilities. It also introduced interface-based notification extension.

## Completion Evidence

The learner answered the initial requirement questions. The review identified SRP, OCP, and DIP concepts, and corrected the terminology: aim for **low coupling** and **high cohesion**, not high coupling.
