package July26;

import java.util.*;

// Superclass
class Animal {
    void sound() {
        System.out.println("Some animal sound");
    }
}

// Subclass
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class Mainn {

    // Task 04: Upper bounded wildcard
    public static void animalSound(List<? extends Animal> animalList) {
        for (Animal element : animalList) {
            element.sound();
        }
    }

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());

        animalSound(cats); // ✅ Works due to upper bound
    }
}
