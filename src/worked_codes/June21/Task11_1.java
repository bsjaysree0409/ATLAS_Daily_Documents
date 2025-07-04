package June21;


@FunctionalInterface
interface MyInterface11 {

    // abstract method
    String reverse(String n);
}

public class Task11_1 {

    public static void main( String[] args ) {

        // declare a reference to MyInterface
        // assign a lambda expression to the reference
        MyInterface11 ref = (str) -> {

            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--)
                result += str.charAt(i);
            return result;
        };

        // call the method of the interface
        System.out.println("Lambda reversed = " + ref.reverse("Lambda"));
    }

}
