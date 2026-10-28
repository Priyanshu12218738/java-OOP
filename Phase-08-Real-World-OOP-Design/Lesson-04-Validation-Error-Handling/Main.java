public class Main {
    public static void main(String[] args) {
        try {
            Car car = new Car(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Car validCar = new Car(new PetrolEngine());
        validCar.startCar();
        validCar.stopCar();
    }
}
