public class ElectricEngine implements Engine {
    private boolean running = false;

    @Override
    public void start() {
        if (running) {
            System.out.println("Electric engine is already running.");
            return;
        }

        running = true;
        System.out.println("Electric engine started");
    }

    @Override
    public void stop() {
        if (!running) {
            System.out.println("Electric engine is already stopped.");
            return;
        }

        running = false;
        System.out.println("Electric engine stopped");
    }

    @Override
    public boolean isRunning() {
        return running;
    }
}
