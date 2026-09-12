import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of first matrix: ");
        int row1 = sc.nextInt();

        System.out.print("Enter columns of first matrix: ");
        int col1 = sc.nextInt();

        System.out.print("Enter rows of second matrix: ");
        int row2 = sc.nextInt();

        System.out.print("Enter columns of second matrix: ");
        int col2 = sc.nextInt();

        // Check if multiplication is possible
        if (col1 != row2) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }

        int[][] A = new int[row1][col1];
        int[][] B = new int[row2][col2];
        int[][] product = new int[row1][col2];

        // Input first matrix
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Matrix Multiplication
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                product[i][j] = 0;

                for (int k = 0; k < col1; k++) {
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Display Product Matrix
        System.out.println("\nProduct Matrix:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.printf("%5d", product[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
