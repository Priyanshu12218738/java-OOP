# Lesson 8 — Composition over Inheritance

## Why This Principle Exists

A car is not an engine; a car has an engine. This is a **HAS-A** relationship, so composition is a more natural design than making `Car` extend `Engine`.

- **IS-A** relationship → inheritance
- **HAS-A** relationship → composition

## Misusing Inheritance

Inheritance can compile and work technically while still modeling the domain incorrectly. If `Car extends Engine`, a car becomes a subtype of engine, which is not true in the real world. Inheritance also inherits a parent class's behavior and contract, so it should not be used only to reuse code.

See [InheritanceMisuseExample.java](InheritanceMisuseExample.java).

## Composition

A class can keep another object's reference in a field and delegate work to it. In the basic example, `Car` owns an `Engine` reference and calls its `start()` method.

See [CompositionExample.java](CompositionExample.java).

## Flexible Composition with an Interface

The car can depend on an `Engine` interface instead of a concrete engine class. Constructor injection allows different implementations, such as petrol and electric engines, to be supplied without changing `Car`.

See [FlexibleCompositionExample.java](FlexibleCompositionExample.java).

## Composition vs. Inheritance

| Inheritance | Composition |
|---|---|
| Models an IS-A relationship | Models a HAS-A relationship |
| Uses `extends` | Keeps another object in a field |
| Inherits parent behavior and contract | Uses or delegates to another object's behavior |
| Can create tight coupling to a parent class | Often makes components easier to replace |
| Best for genuine subtype relationships | Useful for combining replaceable components and behaviors |

## Interview-Ready Answer

“Composition over inheritance means preferring to build classes by combining objects rather than inheriting implementation unnecessarily. It generally improves flexibility and reduces coupling, especially when behavior needs to be replaceable.”

**Important:** This principle does not mean inheritance should never be used. Inheritance remains useful when there is a genuine IS-A relationship and the subtype correctly follows the parent type's contract.
