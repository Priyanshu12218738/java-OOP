public class DieselEngine implements Engine {
    private boolean running = false;

    @Override
    public void start() {
        if (running) {
            System.out.println("Diesel engine is already running.");
            return;
        }

        running = true;
        System.out.println("Diesel engine started");
    }

    @Override
    public void stop() {
        if (!running) {
            System.out.println("Diesel engine is already stopped.");
            return;
        }

        running = false;
        System.out.println("Diesel engine stopped");
    }

    @Override
    public boolean isRunning() {
        return running;
    }
}
