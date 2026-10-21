public class Main {
    public static void main(String[] args) {
        Car petrolCar = new Car(new PetrolEngine());
        Car electricCar = new Car(new ElectricEngine());
        Car dieselCar = new Car(new DieselEngine());

        petrolCar.startCar();
        petrolCar.stopCar();

        electricCar.startCar();
        electricCar.stopCar();

        dieselCar.startCar();
        dieselCar.stopCar();
    }
}
