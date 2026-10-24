public class Car {
    private final Engine engine;
    private boolean isRunning = false;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {
        if (isRunning) {
            System.out.println("Car is already running.");
            return;
        }

        engine.start();
        isRunning = true;
        System.out.println("Car started successfully.");
    }

    public void stopCar() {
        if (!isRunning) {
            System.out.println("Car is already stopped.");
            return;
        }

        engine.stop();
        isRunning = false;
        System.out.println("Car stopped successfully.");
    }
}
