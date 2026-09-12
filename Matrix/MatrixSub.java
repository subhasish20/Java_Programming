import java.util.Scanner;

public class MatrixSub {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();

        // Declare matrices
        int[][] A = new int[row][col];
        int[][] B = new int[row][col];
        int[][] difference = new int[row][col];

        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                difference[i][j] = A[i][j] - B[i][j];
            }
        }

        // Display the result
        System.out.println("\nDifference of the matrices:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%d ", difference[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
