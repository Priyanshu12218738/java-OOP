# Lesson 7 — Multiple Notification Channels

**Phase:** 6 — Notification System  
**Status:** ✅ Passed — 10/10

## Objective
Allow NotificationService to send one message through multiple configured channels.

## Design
- Accept a `List<Notification>` through the constructor.
- Store the supplied channels.
- Iterate through the list and call the notification operation on each element.

## Concepts
- Polymorphism with collections.
- Constructor injection of multiple implementations.
- Open/Closed extension through additional list elements.

## Review
The multiple-channel design passed with **10/10**.

## Important Note
Using a list supports multiple implementations, but a collection by itself does not prove an ISP violation or compliance. Interface design still depends on whether the contract is focused.
