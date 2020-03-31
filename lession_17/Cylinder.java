package lession17;
import lession17.Circle;
public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
        super();
        height = 1.0;
    }
    public Cylinder(double height){
        super();
        this.height = height;
    }
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + "height=" + height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return getArea()*height;
    }
}
