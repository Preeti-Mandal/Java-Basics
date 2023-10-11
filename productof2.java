import java.util.Scanner;

public class productof2 {
    public static int calculateProduct(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q-Make a fn calculate product of 2 no. and return the product.
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Product of 2 numbers is : " + calculateProduct(a, b));

    }
}
