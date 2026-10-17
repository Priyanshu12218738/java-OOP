class EmailSender {
    void sendEmail() {
        System.out.println("Email sent");
    }
}

class NotificationService {
    private EmailSender email = new EmailSender();

    void notifyUser() {
        email.sendEmail();
    }
}

class DIPViolationExample {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.notifyUser();
    }
}