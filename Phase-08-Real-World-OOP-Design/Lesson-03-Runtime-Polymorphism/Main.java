public class Main {
    public static void main(String[] args) {
        Car dieselCar = new Car(new DieselEngine());
        Car electricCar = new Car(new ElectricEngine());

        dieselCar.startCar();
        electricCar.startCar();
    }
}
