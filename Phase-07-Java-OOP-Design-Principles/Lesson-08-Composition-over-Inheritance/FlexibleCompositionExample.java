interface Engine {
    void start();
}

class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Petrol engine started");
    }
}

class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric engine started");
    }
}

class FlexibleCar {
    private final Engine engine;

    FlexibleCar(Engine engine) {
        this.engine = engine;
    }

    void startCar() {
        engine.start();
    }
}

public class FlexibleCompositionExample {
    public static void main(String[] args) {
        FlexibleCar petrolCar = new FlexibleCar(new PetrolEngine());
        FlexibleCar electricCar = new FlexibleCar(new ElectricEngine());

        petrolCar.startCar();
        electricCar.startCar();
    }
}
