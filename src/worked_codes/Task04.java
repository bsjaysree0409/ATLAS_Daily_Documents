package worked_codes;

public class Task04 {
    public static void main(String[] args) {
        int a = 8;
        int b = 4;
        System.out.println("Main started");
        System.out.println("Sum of 2 numbers is "+ doAddition(a,b));
        System.out.println("Difference of 2 numbers is "+ doDifference(a,b));
        System.out.println("Product of 2 numbers is "+ doProduct(a,b));
        System.out.println("Division of 2 numbers is "+ doDivision(a,b));
        System.out.println("Main ended");
    }

    public static int doAddition(int number1,int number2){
        int sum = number1 + number2;
        return sum;
    }

    public static int doDifference(int number1, int number2){
        int difference = number1 - number2;
        return difference;
    }
    public static int doProduct(int number1, int number2){
        int product = number1 * number2;
        return product;
    }
    public static int doDivision(int number1, int number2){
        int division = number1 / number2;
        return division;
    }
}

