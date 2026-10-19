interface Bird {
    void eat();
}

interface FlyingBird extends Bird {
    void fly();
}

class Sparrow implements FlyingBird {
    @Override
    public void eat() {
        System.out.println("Sparrow eats");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flies");
    }
}

class Penguin implements Bird {
    @Override
    public void eat() {
        System.out.println("Penguin eats");
    }
}

class FlightService {
    void makeFly(FlyingBird bird) {
        bird.fly();
    }
}

public class Main {
    public static void main(String[] args) {
        FlightService service = new FlightService();
        service.makeFly(new Sparrow());

        Bird penguin = new Penguin();
        penguin.eat();
    }
}