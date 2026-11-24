# Lesson 8 — Payroll Exception Handling

**Phase:** 7 — Payroll Management  
**Status:** ✅ Output passed

## Objective
Handle payroll-generation failures without terminating the rest of the application flow.

## Implementation Outline
- Wrap the payroll operation that may throw an exception in a `try` block.
- Catch the expected exception in Main.
- Display a useful error message.
- Continue with the remaining application flow where appropriate.

## Verified Behaviour
The output showed the error being handled and the existing payroll record remaining available.

## Design Note
Catch exceptions at the layer that can respond meaningfully. Do not silently swallow failures or use broad catches without a clear reason.
