package July26.interfaces1;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Jaysree");
        Driver driver1 = new Driver("Hari");

        Car cretaCar = new Car(driver,"Creta");
        cretaCar.drive();

        Car bmwCar = new Car(driver1,"BMW");
        bmwCar.drive();
    }
}
