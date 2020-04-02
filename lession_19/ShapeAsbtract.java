package lession19;
abstract public class ShapeAsbtract {
    private String color;

    public ShapeAsbtract(String color){
        this.color = color;
    }

    abstract public double getArea();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}