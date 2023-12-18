import java.util.*;

public class Avgof3 {
    // Q- Enter 3 numbers from user & make a fn to print their Average.
    public static double avgOfThree(int a, int b, int c) {
        double avg = (a + b + c) / 3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(avgOfThree(a, b, c));

    }
}
