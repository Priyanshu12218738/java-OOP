interface Payment {
    void pay();
}

class UpiPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Paying through UPI");
    }
}

class CardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Paying through Card");
    }
}

class WalletPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Paying through Wallet");
    }
}

class PaymentService {
    void processPayment(Payment payment) {
        payment.pay();
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        Payment upi = new UpiPayment();
        service.processPayment(upi);

        Payment card = new CardPayment();
        service.processPayment(card);

        Payment wallet = new WalletPayment();
        service.processPayment(wallet);
    }
}