class EmailSender {
    void send() {
        System.out.println("Email sent");
    }
}

class ConcreteNotificationService {
    private final EmailSender sender = new EmailSender();

    void notifyUser() {
        sender.send();
    }
}

public class ConcreteClassDependencyExample {
    public static void main(String[] args) {
        ConcreteNotificationService service =
                new ConcreteNotificationService();
        service.notifyUser();
    }
}
