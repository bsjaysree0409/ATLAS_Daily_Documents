package Task30;

public class AdvancedCalculator extends BasicCalculator {
    public void doMultiplication(int num1,int num2){
        int mul = num1 * num2;
        System.out.println("product is " + mul);
    }

    public void doDivision(int num1,int num2){
        int div = num1 / num2;
        System.out.println("division is " + div);
    }
}
