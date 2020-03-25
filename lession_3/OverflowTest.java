public class OverflowTest {
    public static void main(String[] args) {
        int i1 = 214783647;
        System.out.println(i1 + 1);
        System.out.println(i1 + 2);
        System.out.println(i1 + 3);
        System.out.println(i1 * 2);
        System.out.println(i1 * 1);

        int i2 = -214783647;
        System.out.println(i2 - 1);
        System.out.println(i2 - 2);
        System.out.println(i2 * i2);
    }
}
