import java.util.Random;

public class MatrixOperations2 {
    public static void main(String[] args) {
        Random rand = new Random();

        int rows = 3;
        int cols = 3;
        int[][] matrix1 = generateRandomMatrix(rows, cols);
        int[][] matrix2 = generateRandomMatrix(rows, cols);

        System.out.println("Matrix 1:");
        displayMatrix(matrix1);

        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);

        System.out.println("\nMatrix Addition:");
        displayMatrix(addMatrices(matrix1, matrix2));

        System.out.println("\nMatrix Subtraction:");
        displayMatrix(subtractMatrices(matrix1, matrix2));

        System.out.println("\nMatrix Multiplication:");
        displayMatrix(multiplyMatrices(matrix1, matrix2));

        System.out.println("\nTranspose of Matrix 1:");
        displayMatrix(transposeMatrix(matrix1));

        System.out.println("\nDeterminant of 2x2 Matrix 1: " + findDeterminant(matrix1));

        System.out.println("\nInverse of 2x2 Matrix 1:");
        displayMatrix(inverseMatrix(matrix1));
    }

    public static int[][] generateRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10);  
            }
        }

        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix2[0].length;
        int commonDim = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = 0;
                for (int k = 0; k < commonDim; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

    public static int findDeterminant(int[][] matrix) {
        if (matrix.length == 2 && matrix[0].length == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }
        return 0;  
    }

    public static int[][] inverseMatrix(int[][] matrix) {
        if (matrix.length == 2 && matrix[0].length == 2) {
            int determinant = findDeterminant(matrix);
            if (determinant != 0) {
                int[][] inverse = new int[2][2];
                inverse[0][0] = matrix[1][1];
                inverse[0][1] = -matrix[0][1];
                inverse[1][0] = -matrix[1][0];
                inverse[1][1] = matrix[0][0];
               
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        inverse[i][j] /= determinant;
                    }
                }
                return inverse;
            }
        }
        return new int[2][2]; 
    }
}
