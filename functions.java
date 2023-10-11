import java.util.*;

public class functions {
    public static int calculateSum(int a, int b) { // Function declare
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q-Make a fn to add 2 no. and return the sum.
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("Sum of 2 given numbers is : " + sum); // Function call.

    }
}
