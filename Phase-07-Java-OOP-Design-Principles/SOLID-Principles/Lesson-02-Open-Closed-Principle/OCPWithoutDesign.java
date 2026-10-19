class PaymentService {
    void pay(String type) {
        if (type.equals("UPI")) {
            System.out.println("Paying through UPI");
        }
    }
}

class OCPWithoutDesign {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        service.pay("UPI");
    }
}