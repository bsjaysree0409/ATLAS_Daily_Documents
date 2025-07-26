package July26.interfaces;

public class Car {
    private Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }

    public void drive(){
        engine.Start();
        System.out.println("Car is driving");
    }
}
