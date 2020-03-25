package session2345;

public class TestWhileEmptyBody {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 30;
        // An empty while loop with no statements
        while (++num1 < --num2) ;
        // The statement executes after the while loop is completed
        System.out.println("Midpoint is: "+num1);
    }
}