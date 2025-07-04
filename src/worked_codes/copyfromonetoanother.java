package worked_codes;

import java.util.HashMap;

public class copyfromonetoanother {
    public static void main(String[] args) {
        // Original map
        HashMap<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "Apple");
        originalMap.put(2, "Banana");
        originalMap.put(3, "Cherry");

        // New map to copy into
        HashMap<Integer, String> copiedMap = new HashMap<>();

        // Copy data using putAll
        copiedMap.putAll(originalMap);

        // Display copied map
        System.out.println("Copied Map:");
        for (Integer key : copiedMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + copiedMap.get(key));
        }
    }
}
