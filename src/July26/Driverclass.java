package July26;

abstract class Bird {
    abstract void layEggs();
}

/*interface Flyable {
    void fly();
}

class July26.Eagle extends July26.Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Eagles fly high");
    }

    @Override
    void layEggs() {
        System.out.println("July26.Eagle lays eggs");
    }
}

class July26.Ostrich extends July26.Bird {
    @Override
    void layEggs() {
        System.out.println("July26.Ostrich lays big eggs");
    }
}
public class Driverclass {
    public static void main(String[] args) {
        July26.Bird eagle = new July26.Eagle();
        July26.Bird ostrich = new July26.Ostrich();

        eagle.layEggs();
        ostrich.layEggs();

        Flyable flyingBird = new July26.Eagle(); // works
        flyingBird.fly();

        // Flyable nonFlyingBird = new July26.Ostrich(); // compile error — and that’s GOOD!
    }
}
*/