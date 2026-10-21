public class Main {
    public static void main(String[] args) {
        Car petrolCar = new Car(new PetrolEngine());
        Car electricCar = new Car(new ElectricEngine());

        petrolCar.startCar();
        electricCar.startCar();
    }
}
