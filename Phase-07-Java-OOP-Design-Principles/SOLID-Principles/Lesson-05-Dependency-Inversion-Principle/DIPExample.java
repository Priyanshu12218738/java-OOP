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

public class Main {
    public static void main(String[] args) {
        MessageSender sender = new EmailSender();

        NotificationService service = new NotificationService(sender);
        service.notifyUser();
    }
}