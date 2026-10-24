public class Car {
    private final Engine engine;
    private boolean isRunning = false;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {
        if (isRunning) {
            throw new IllegalStateException("Car is already running");
        }

        engine.start();
        isRunning = true;
        System.out.println("Car started successfully.");
    }

    public void stopCar() {
        if (!isRunning) {
            throw new IllegalStateException("Car is already stopped");
        }

        engine.stop();
        isRunning = false;
        System.out.println("Car stopped successfully.");
    }
}
