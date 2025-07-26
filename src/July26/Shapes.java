package July26;

interface ICalcArea {
    void calcArea();
    void calcPerimeter();
}

interface ICalcVolume {
    void calcVolume();
}

class Circle implements ICalcArea {
    @Override
    public void calcArea() {
        System.out.println("Calculating area of a circle");
    }

    @Override
    public void calcPerimeter() {
        System.out.println("Calculating perimeter of a circle");
    }
}

class Sphere implements ICalcArea, ICalcVolume {
    @Override
    public void calcArea() {
        System.out.println("Calculating surface area of a sphere");
    }

    @Override
    public void calcPerimeter() {
        System.out.println("No perimeter for 3D shapes");
    }

    @Override
    public void calcVolume() {
        System.out.println("Calculating volume of a sphere");
    }
}

public class Shapes {
    public static void main(String[] args) {
        ICalcArea circle = new Circle();
        circle.calcArea();
        circle.calcPerimeter();

        Sphere sphere = new Sphere();
        sphere.calcArea();
        sphere.calcPerimeter();
        sphere.calcVolume();
    }
}

