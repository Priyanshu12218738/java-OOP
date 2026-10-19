class EngineForInheritance {
    void start() {
        System.out.println("Engine started");
    }
}

class CarExtendsEngine extends EngineForInheritance {
    // Compiles, but a car is not a type of engine.
}

public class InheritanceMisuseExample {
    public static void main(String[] args) {
        CarExtendsEngine car = new CarExtendsEngine();
        car.start();
    }
}
