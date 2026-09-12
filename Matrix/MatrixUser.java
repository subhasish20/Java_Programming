
import java.util.Scanner;


public class MatrixUser
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the size of the row :");
        int row = sc.nextInt();

        System.out.printf("Enter the size of the column :");
        int column = sc.nextInt();

        System.out.printf("Eneter the element one by one :");

        int[][] matrix = new int[row][column];

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.printf("The given matrix is :\n");
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                System.out.printf("%d\t",matrix[i][j]);
            }
            System.out.printf("\n");
        }
    }
}