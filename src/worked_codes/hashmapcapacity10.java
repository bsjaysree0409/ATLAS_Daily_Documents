package worked_codes;

import java.util.HashMap;

public class hashmapcapacity10 {
    public static void main(String[] args) {
        // Create a HashMap with initial capacity 10
        HashMap<Integer, String> map = new HashMap<>(10);

        // Add some key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Berry");

        // Display the HashMap
        System.out.println("HashMap contents:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}


