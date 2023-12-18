public class stringComp {
    public static void main(String args[]) {
        // Comparison btw strings

        String name1 = "Hello";
        String name2 = "Hello";

        /*
         * 1. s1 > s2 : +ve value
         * 2. s1 == s2 : equal(0)
         * 3. s1 < s2 : -ve value
         */

        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // In Alphabets the comparison of strings order are in ascending order i.e
        // A<B<C...<Z. Ex- BELL<CELL<Zell

        /*
         * // We should use compareTo instead of ==
         * 
         * if (new String("Hello") == new String("Hello")) {
         * System.out.println("Strings are equal");
         * } else {
         * System.out.println("Strings are Not equal");
         * }
         * // This will give output as NOT EQUAL.
         */

    }
}
