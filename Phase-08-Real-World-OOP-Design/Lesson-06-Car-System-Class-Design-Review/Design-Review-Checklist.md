# Car System — Class Design Review Checklist

Review the design before adding more features.

- [ ] `Car` depends on the `Engine` interface rather than a concrete engine.
- [ ] The engine is provided through constructor injection.
- [ ] The constructor rejects a null engine.
- [ ] Each engine implementation owns its engine-specific running state.
- [ ] The `Car` class delegates engine operations rather than duplicating engine logic.
- [ ] There is one source of truth for whether the engine is running.
- [ ] A new engine implementation can be passed into `Car` without editing `Car`.
- [ ] The sample runner demonstrates more than one engine implementation.

## Review Questions

1. Why is `private final Engine engine` more flexible than `private DieselEngine engine`?
2. Which class should own engine-running state, and why?
3. What problem can arise if `Car` and the engine keep independent running flags?
4. How do composition, dependency injection, DIP, and OCP relate in this example?

**Challenge:** Add another engine implementation that implements `Engine`. Confirm that no change to `Car` is required.
