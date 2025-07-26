package July26;

public class Cupboard {
    IProduct product;  // depends on abstraction, not concrete class

    public void addProduct(IProduct product) {
        this.product = product;
    }

    public void customizeProduct() {
        product.seeReviews();
        product.getSample();
    }
}
