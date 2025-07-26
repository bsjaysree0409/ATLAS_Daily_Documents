package July26;

// Abstract base class for birds that can fly
abstract class BirdsThatFly {
    abstract void fly();
}

// Abstract base class for birds that can't fly
abstract class BirdsThatDontFly {
    abstract void speciality();
}

// Concrete subclass representing a flying bird
class Eagle extends BirdsThatFly {
    @Override
    public void fly() {
        System.out.println("Eagles fly high");
    }
}

// Concrete subclass representing a non-flying bird
class Ostrich extends BirdsThatDontFly {
    @Override
    public void speciality() {
        System.out.println("July26.Ostrich lays big eggs");
    }
}

// Driver class to test functionality
class DriverClass {
    public static void main(String[] args) {
        BirdsThatFly eagle = new Eagle();
        eagle.fly();

        BirdsThatDontFly ostrich = new Ostrich();
        ostrich.speciality();
    }
}
