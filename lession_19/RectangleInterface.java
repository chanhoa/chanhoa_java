package lession19;

public class RectangleInterface implements ShapeInterface {
    private int length, width;

    public RectangleInterface(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "RectangleInterface{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public double getArea(){
        return length * width;
    }
}
