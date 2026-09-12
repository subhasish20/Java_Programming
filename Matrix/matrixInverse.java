public class MatrixInverse {

    public static void main(String[] args) {
        double[][] matrix = { { 4, 7 }, { 2, 6 } };

        int n = matrix.length;

        double[][] augmented = new double[n][2 * n];

        // Create augmented matrix [A | I]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                augmented[i][j] = matrix[i][j];
            }

            augmented[i][i + n] = 1;
        }

        // Gauss-Jordan Elimination
        for (int i = 0; i < n; i++) {
            double pivot = augmented[i][i];

            for (int j = 0; j < 2 * n; j++) {
                augmented[i][j] /= pivot;
            }

            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = augmented[k][i];

                    for (int j = 0; j < 2 * n; j++) {
                        augmented[k][j] -= factor * augmented[i][j];
                    }
                }
            }
        }

        // Extract inverse
        double[][] inverse = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inverse[i][j] = augmented[i][j + n];
            }
        }

        // Print inverse
        System.out.println("Inverse Matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%.2f ", inverse[i][j]);
            }
            System.out.println();
        }
    }
}
