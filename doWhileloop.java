public class doWhileloop {
    public static void main(String[] args) {
        int i = 12;
        while (i < 11) {
            System.out.println("This code will not run");
        }

        do {
            System.out.println("This code will run atleast one cuz of Do loop");
        } while (i < 11);

    }
}
