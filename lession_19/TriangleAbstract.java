package lession19;
public class TriangleAbstract extends ShapeAsbtract {
    private int base, height;

    public TriangleAbstract(String color, int base, int height){
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
