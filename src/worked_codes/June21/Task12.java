package June21;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task12 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("jaysree hariharan");
        names.add("isha easwaran");
        names.add("sangeetha sanjay");
        names.add("saraswathi venugopal");
        names.add("charan thangarajan");

        names.forEach(System.out::println);

    }
}
