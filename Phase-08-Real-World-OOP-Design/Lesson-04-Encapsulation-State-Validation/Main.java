public class Main {
    public static void main(String[] args) {
        Car car = new Car(new PetrolEngine());

        car.startCar();
        car.startCar();
        car.stopCar();
        car.stopCar();
    }
}
