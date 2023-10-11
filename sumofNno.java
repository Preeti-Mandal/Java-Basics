import java.util.*;

public class sumofNno {
    public static void main(String[] args) {
        // Q- Print sum of First n Natural No.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of First " + n + " Natural number is " + sum);

    }
}
