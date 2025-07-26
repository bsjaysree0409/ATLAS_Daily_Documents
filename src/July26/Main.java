package July26;

import java.util.*;

// Base class
class Animal {
    @Override
    public String toString() {
        return "Generic Animal";
    }
}

// Subclass
class Cat extends Animal {
    @Override
    public String toString() {
        return "Cat";
    }
}

public class Main {

    // Task 03: Unbounded wildcard method
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<Cat> clist = new ArrayList<>();
        clist.add(new Cat());
        printList(clist);  // ✅ Accepts List<Cat>, List<Animal>, List<String>, etc.

        List<String> strList = Arrays.asList("Hello", "World");
        printList(strList); // ✅ Also works
    }
}
