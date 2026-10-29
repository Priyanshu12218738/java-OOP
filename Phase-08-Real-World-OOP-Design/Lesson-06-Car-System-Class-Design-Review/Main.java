public class Main {
    public static void main(String[] args) {
        Car dieselCar = new Car(new DieselEngine());
        Car electricCar = new Car(new ElectricEngine());

        dieselCar.startCar();
        System.out.println("Diesel car running: " + dieselCar.isRunning());

        dieselCar.stopCar();
        System.out.println("Diesel car running: " + dieselCar.isRunning());

        electricCar.startCar();
        System.out.println("Electric car running: " + electricCar.isRunning());
    }
}
