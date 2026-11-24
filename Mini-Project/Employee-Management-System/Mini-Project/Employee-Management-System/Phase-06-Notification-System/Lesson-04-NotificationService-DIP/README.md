# Lesson 4 — NotificationService & DIP

**Status:** ✅ Design check passed — 10/10

The learner correctly selected the `Notification` abstraction rather than a concrete Email/SMS class. The service receives its dependency through constructor injection and delegates to `send()`.
