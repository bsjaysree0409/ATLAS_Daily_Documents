package worked_codes;

import java.util.*;

public class HashMapNullAndSyncExample {
    public static void main(String[] args) {
        // Step 1: Create a regular HashMap
        HashMap<String, Integer> hm1 = new HashMap<>();

        // Step 2: Add a null key
        hm1.put(null, 100);
        System.out.println("After adding 1st null key: " + hm1);

        // Step 3: Add another null key (this will overwrite the previous one)
        hm1.put(null, 200); // Replaces value for null key
        System.out.println("After adding 2nd null key: " + hm1);

        // Step 4: Make the HashMap synchronized
        Map<String, Integer> syncMap = Collections.synchronizedMap(hm1);

        // Step 5: Access synchronized map (safe in multi-threaded environments)
        System.out.println("Synchronized HashMap: " + syncMap);

        // Bonus: Add a null value
        syncMap.put("A", null);
        syncMap.put("B", null);
        System.out.println("With null values added: " + syncMap);
    }
}
