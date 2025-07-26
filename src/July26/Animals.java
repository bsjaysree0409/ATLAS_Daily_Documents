package July26;
/*
import java.util.*;

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow is the sound of cat");
    }
}

public class Animals {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());

        printAnimalSounds(cats); // ✅ Using ? extends Animal

        List<Animal> animals = new ArrayList<>();
        addCats(animals); // ✅ Using ? super Cat
    }

    // Upper bounded: can read Animal or Cat
    public static void printAnimalSounds(List<? extends Animal> list) {
        for (Animal animal : list) {
            animal.sound();
        }
    }

    // Lower bounded: can add Cat to Animal or Object
    public static void addCats(List<? super Cat> list) {
        list.add(new Cat());
    }
}
*/