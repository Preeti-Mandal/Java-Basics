import java.util.*;

public class Strings {
    public static void main(String args[]) {
        // Concatenation => to join/add 2 strings.

        String firstName = "Preeti";
        String lastName = "Mandal";
        String fullName = firstName + "@" + lastName;
        System.out.println(fullName); // Preeti@Mandal
        System.out.println(fullName.length());

        // charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

    }

}
