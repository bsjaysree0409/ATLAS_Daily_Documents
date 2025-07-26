package July25_shapes;

public class AreaComparator {
    public int compareArea(Shape a, Shape b) {
        return Double.compare(a.area(), b.area());
    }
}
