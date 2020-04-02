package lession19;

public class TestShapeAbstract {
    public static void main(String[] args) {
        ShapeAsbtract s1 = new RectangleAsbtract("red", 4, 5);
        System.out.println(s1);
        System.out.println("Area is " + s1.getArea());

        ShapeAsbtract s2 = new TriangleAbstract("blue", 4, 5);
        System.out.println(s2);
        System.out.println("Area is " + s2.getArea());
    }
}
