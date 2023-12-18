import java.util.*;

public class QuesArray {
    public static void main(String args[]) {
        // Linear Search => searching in a straight way.

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int number[] = new int[size];

        // Input
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        // Output
        for (int i = 0; i < number.length; i++) {
            if (number[i] == x) {
                System.out.println("x found at index : " + i);

            }

        }

    }
}
