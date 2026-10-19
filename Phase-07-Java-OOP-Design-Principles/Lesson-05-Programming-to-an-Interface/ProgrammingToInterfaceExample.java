interface MessageSender {
    void send();
}

class EmailSender implements MessageSender {
    @Override
    public void send() {
        System.out.println("Email sent");
    }
}

class SmsSender implements MessageSender {
    @Override
    public void send() {
        System.out.println("SMS sent");
    }
}

class NotificationService {
    private final MessageSender sender;

    NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    void notifyUser() {
        sender.send();
    }
}

public class ProgrammingToInterfaceExample {
    public static void main(String[] args) {
        NotificationService emailService =
                new NotificationService(new EmailSender());

        NotificationService smsService =
                new NotificationService(new SmsSender());

        emailService.notifyUser();
        smsService.notifyUser();
    }
}
