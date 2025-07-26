package July26.interfaces2;

import java.util.ArrayList;
import java.util.List;

public class Car {
    List<Wheel> wheels = new ArrayList<>();

    public Car() {

    }

    public void init(){
        wheels.add(new Wheel());
        wheels.add(new Wheel());
        wheels.add(new Wheel());
        wheels.add(new Wheel());
        System.out.println("Car is started");
    }
}
