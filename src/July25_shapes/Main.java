package July25_shapes;

public class Main {
    public static void main(String[] args) {
        Shape square1 = new Square(5);
        Shape square2 = new Square(7);
        Shape circle1 = new Circle(3);
        Shape circle2 = new Circle(4);

        AreaComparator comparator = new AreaComparator();

        System.out.println("Square vs Square: " + comparator.compareArea(square1, square2));
        System.out.println("Circle vs Circle: " + comparator.compareArea(circle1, circle2));
        System.out.println("Square vs Circle: " + comparator.compareArea(square1, circle1));
    }
}
