import java.util.Scanner;

public class findGreater {
    public static void returnGreaterValue(int num1, int num2) {
        // Q- Write a function which takes in 2 numbers and returns the greater of those
        // two.

        if (num1 > num2) {
            System.out.println(num1);

        } else {
            System.out.println(num2);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        returnGreaterValue(num1, num2);

    }
}
