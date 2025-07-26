package July26;

public class DriverClass2 {
    public static void main(String[] args) {
        Cupboard cupboard1 = new Cupboard();
        cupboard1.addProduct(new Clothes());
        cupboard1.customizeProduct();

        System.out.println("---");

        Cupboard cupboard2 = new Cupboard();
        cupboard2.addProduct(new Books());
        cupboard2.customizeProduct();
    }
}
