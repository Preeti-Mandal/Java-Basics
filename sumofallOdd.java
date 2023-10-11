import java.util.Scanner;

public class sumofallOdd {
    // Q- Write a function to print the sum of all odd numbers from 1 to n.
    public static void sumOfOddno(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (n % 2 != 0) {
                sum = sum + i;

            }
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sumOfOddno(n);
    }

}