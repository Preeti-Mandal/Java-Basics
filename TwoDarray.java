import java.util.*;

public class TwoDarray {
    public static void main(String args[]) {
        // Taking a matrix as an input and printing its element.

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];

        // Input => row x columns
        // rows
        for (int i = 0; i < rows; i++) {

            // Columns
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // Output

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}
