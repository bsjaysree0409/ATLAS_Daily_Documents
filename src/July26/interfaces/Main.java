package July26.interfaces;

public class Main {
    public static void main(String[] args) {

        Engine petrolEngine = new PetrolEngine();
        Car petrolCar = new Car(petrolEngine);

        Engine electricEngine = new ElectricEngine();
        Car electricCar = new Car(electricEngine);

        petrolCar.drive();
        electricCar.drive();



    }
}
