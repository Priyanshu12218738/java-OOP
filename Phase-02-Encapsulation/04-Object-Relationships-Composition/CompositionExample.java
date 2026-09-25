class Engine {
    void startEngine() {
        System.out.println("Engine is starting...");
    }
}

class Car {
    Engine e = new Engine();

    void drive() {
        e.startEngine();
        System.out.println("Car is moving...");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}