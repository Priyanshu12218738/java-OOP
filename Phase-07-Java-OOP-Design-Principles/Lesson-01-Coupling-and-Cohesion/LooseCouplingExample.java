interface Payment {
    void pay();
}

class UpiPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("UPI payment successful");
    }
}

class CardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Card payment successful");
    }
}

class ShoppingApp {
    private final Payment payment;

    ShoppingApp(Payment payment) {
        this.payment = payment;
    }

    void checkout() {
        payment.pay();
    }
}

class LooseCouplingExample {
    public static void main(String[] args) {
        Payment payment = new UpiPayment();
        ShoppingApp app = new ShoppingApp(payment);
        app.checkout();
    }
}