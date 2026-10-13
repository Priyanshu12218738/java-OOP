class UpiPayment {
    void pay() {
        System.out.println("UPI payment successful");
    }
}

class ShoppingApp {
    private UpiPayment payment = new UpiPayment();

    void checkout() {
        payment.pay();
    }
}

class TightCouplingExample {
    public static void main(String[] args) {
        ShoppingApp app = new ShoppingApp();
        app.checkout();
    }
}