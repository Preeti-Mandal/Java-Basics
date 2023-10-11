import java.util.*;

public class switchs {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int variable = sc.nextInt();

        switch (variable) {
            case 1:
                System.out.println("Hello!!");
                break;
            case 2:
                System.out.println("Bonjour!!");
                break;
            case 3:
                System.out.println("Namastey!!");
                break;
            case 4:
                System.out.println("HOLA!!");
                break;
            default:
                System.out.println("Invalid button");
        }

    }

}
