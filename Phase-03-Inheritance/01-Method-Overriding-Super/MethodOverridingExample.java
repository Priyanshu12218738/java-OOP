class Appliance {
    void turnOn() {
        System.out.println("Appliance is starting...");
    }
}

class WashingMachine extends Appliance {
    @Override
    void turnOn() {
        super.turnOn();
        System.out.println("Washing Machine is washing clothes...");
    }
}

class Main {
    public static void main(String[] args) {
        WashingMachine w = new WashingMachine();
        w.turnOn();
    }
}