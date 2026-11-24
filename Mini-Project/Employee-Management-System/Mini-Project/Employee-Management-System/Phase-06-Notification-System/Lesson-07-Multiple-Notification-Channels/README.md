# Lesson 7 — Multiple Notification Channels

**Status:** ✅ Design check passed — 10/10

The learner chose `List<Notification>` to support multiple channels. The primary benefits are DIP, OCP, and flexibility; List itself is not the reason this follows ISP. The service loops over the injected channel list and sends the message through each channel.
