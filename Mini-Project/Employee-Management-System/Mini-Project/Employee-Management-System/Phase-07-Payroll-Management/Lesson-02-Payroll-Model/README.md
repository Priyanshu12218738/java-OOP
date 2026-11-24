# Lesson 2 — Payroll Model

**Status:** 🟡 Reviewed with corrections

Payroll stores `employeeId`, `salary`, and `payrollDate` rather than holding an entire Employee object. The learner submitted a constructor and getters; review identified fixes: employee ID must use `<= 0` (not merely `< 0`), correct `LocalDate` spelling in getter, and import `java.time.LocalDate`. Salary must not be negative and date must not be null. Score: 9/10.
