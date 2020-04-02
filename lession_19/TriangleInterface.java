package lession19;
public class TriangleInterface implements ShapeInterface {
    private int base, height;

    public TriangleInterface(int base, int height){
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "TriangleInterface{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }

    public double getArea(){
        return 0.5 * base *height;
    }
}