package July26;

public class Books implements IProduct {
    @Override
    public void seeReviews() {
        System.out.println("Books rating: 4.8 stars");
    }

    @Override
    public void getSample() {
        System.out.println("Showing first 5 pages");
    }
}
