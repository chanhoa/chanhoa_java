package lession19;

public class RectangleAsbtract extends ShapeAsbtract {
    private int length, width;

    public RectangleAsbtract(String color, int length, int width){
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        System.out.println("Rectangle unknown! Cannot compute area!");
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

}
