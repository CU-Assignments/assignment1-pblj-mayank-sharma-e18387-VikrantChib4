import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get dimensions of the matrices
        System.out.print("Enter the number of rows of the matrices: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns of the matrices: ");
        int cols = scanner.nextInt();

        // Initialize the matrices
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        // Input elements for the first matrix
        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input elements for the second matrix
        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Perform and display matrix addition
        System.out.println("Addition:");
        int[][] additionResult = addMatrices(matrix1, matrix2, rows, cols);
        printMatrix(additionResult);

        // Perform and display matrix subtraction
        System.out.println("Subtraction:");
        int[][] subtractionResult = subtractMatrices(matrix1, matrix2, rows, cols);
        printMatrix(subtractionResult);

        // Perform and display matrix multiplication (only if dimensions are valid)
        if (rows == cols) { // Matrix multiplication requires square matrices or compatible sizes
            System.out.println("Multiplication:");
            int[][] multiplicationResult = multiplyMatrices(matrix1, matrix2, rows, cols);
            printMatrix(multiplicationResult);
        } else {
            System.out.println("Matrix multiplication is not possible with the given dimensions.");
        }
    }

    // Function to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Function to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Function to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < cols; k++) { // Iterate over rows and columns for multiplication
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Function to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
