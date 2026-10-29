public class PetrolEngine implements Engine {
    private boolean running = false;

    @Override
    public void start() {
        if (running) {
            System.out.println("Petrol engine is already running.");
            return;
        }

        running = true;
        System.out.println("Petrol engine started");
    }

    @Override
    public void stop() {
        if (!running) {
            System.out.println("Petrol engine is already stopped.");
            return;
        }

        running = false;
        System.out.println("Petrol engine stopped");
    }

    @Override
    public boolean isRunning() {
        return running;
    }
}
