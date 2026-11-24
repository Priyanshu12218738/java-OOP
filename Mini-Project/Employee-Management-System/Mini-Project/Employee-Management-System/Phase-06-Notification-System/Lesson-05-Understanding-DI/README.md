# Lesson 5 — Understanding Dependency Injection

**Status:** 🟡 Correction explained

For `new NotificationService(new EmailNotification())`, the composition root/caller (Main) creates and injects the dependency. NotificationService receives and uses it; it does not perform the injection itself. The learner initially chose the service; the correct distinction was explained.
