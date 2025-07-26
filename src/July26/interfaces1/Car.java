package July26.interfaces1;

public class Car {

    Driver driver;

    String carName;

    Car(Driver driver,String carName){
        this.driver = driver;
        this.carName = carName;
    }

    public void drive(){
        System.out.println(driver.getDriverName() + " is driving the "+ carName + " car");
    }
}
