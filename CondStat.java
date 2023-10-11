import java.util.*;

public class CondStat {
    public static void main(String args[]) {
        /*
         * Conditional Statements are
         * if else
         * else if
         * switch
         * break
         */

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not adult");
        }

    }
}
