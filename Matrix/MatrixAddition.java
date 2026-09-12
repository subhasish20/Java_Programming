import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column size of each matrix :");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] A = new int[row][col];
        System.out.println("Enter the elements of the first matrix :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int[][] B = new int[row][col];
        System.out.println("Enter the elements of the second matrix :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        int[][] sum = new int[row][col];
        System.out.println("The sum of the two matrix is :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = A[i][j] + B[i][j];
                System.out.printf("%d  ", sum[i][j]);
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
