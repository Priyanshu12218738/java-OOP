# Lesson 6 — OCP Practical Challenge: PushNotification

**Phase:** 6 — Notification System  
**Status:** ✅ Passed — 10/10

## Objective
Add a PushNotification channel without modifying NotificationService.

## Task
Create `PushNotification` implementing Notification. Supply it to the existing service through the same dependency-injection design.

## Acceptance Criteria
- PushNotification implements the existing interface.
- NotificationService requires no channel-specific change.
- The new channel can be used through a Notification reference.

## Review
The practical OCP challenge passed with **10/10**.

## Learning Outcome
A stable service can support new behaviour by accepting another implementation of its abstraction.
