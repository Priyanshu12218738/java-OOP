class BasicEngine {
    void start() {
        System.out.println("Engine started");
    }
}

class BasicCar {
    private final BasicEngine engine = new BasicEngine();

    void startCar() {
        engine.start();
        System.out.println("Car is ready");
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        BasicCar car = new BasicCar();
        car.startCar();
    }
}
