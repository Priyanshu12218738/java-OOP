public class Main {
    public static void main(String[] args) {
        Car car = new Car(new PetrolEngine());

        try {
            car.startCar();
            car.startCar();
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            car.stopCar();
            car.stopCar();
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
