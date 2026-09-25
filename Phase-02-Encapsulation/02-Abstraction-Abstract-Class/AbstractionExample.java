abstract class Appliance {
    abstract void turnOn();
}

class Fan extends Appliance {
    @Override
    void turnOn() {
        System.out.println("Fan is Spinning");
    }
}

public class Main {
    public static void main(String[] args) {
        Fan f = new Fan();
        f.turnOn();
    }
}