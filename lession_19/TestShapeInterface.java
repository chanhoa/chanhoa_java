package lession19;

public class TestShapeInterface {
    public static void main(String[] args) {
        ShapeInterface s1 = new RectangleInterface(1, 2);
        System.out.println(s1);
        System.out.println("Area is " + s1.getArea());

        ShapeInterface s2 = new TriangleInterface(3, 4);
        System.out.println(s2);
        System.out.println("Area is " + s2.getArea());
    }
}
