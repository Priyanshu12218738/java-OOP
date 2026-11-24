# Lesson 2 — Payroll Model

**Phase:** 7 — Payroll Management  
**Status:** 🟡 Reviewed; validation corrections noted

## Objective
Represent a generated payroll record independently from the Employee object.

## Model Fields
- `employeeId`
- `salary`
- `payrollDate` using `java.time.LocalDate`

## Validation Corrections
- Employee ID must be greater than zero; reject values `<= 0`.
- Salary must not be negative.
- Payroll date must not be null.
- Use the correct `LocalDate` type and import `java.time.LocalDate`.

## Design Note
The record stores the employee ID rather than holding the whole Employee object, keeping the payroll record focused on the generated payroll data.

## Evidence
The model was reviewed and scored **9/10**. The listed validation and naming corrections remain follow-up items.
