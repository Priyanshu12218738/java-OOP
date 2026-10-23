public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(new PetrolEngine());
        Car car2 = new Car(new DieselEngine());

        car1.startCar();
        car2.startCar();
    }
}
