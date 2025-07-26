package July26;

// Low-level modules implementing the abstraction
public class Clothes implements IProduct {
    @Override
    public void seeReviews() {
        System.out.println("Clothes rating: 4.5 stars");
    }

    @Override
    public void getSample() {
        System.out.println("Showing fabric swatch");
    }
}
