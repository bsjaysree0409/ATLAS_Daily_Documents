package June21;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task13 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("sql");
        names.add("python");
        names.add("html");
        names.add("java");
        names.add("css");


        names.forEach(num->System.out.println(num));
    }
}
