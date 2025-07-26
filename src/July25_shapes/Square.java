package July25_shapes;

public class Square implements Shape {
    private int height;

    public Square(int height) {
        this.height = height;
    }

    @Override
    public double area() {
        return height * height;
    }
}
