import java.util.Scanner;

public class MatrixAddition {

    static void readMatrix(int[][] matrix, int rows, int cols, Scanner sc) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    static int[][] addMatrices(int[][] a, int[][] b, int rows, int cols) {
        int[][] sum = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

    static void displayMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        System.out.println("Enter elements of first matrix:");
        readMatrix(matrix1, rows, cols, sc);

        System.out.println("Enter elements of second matrix:");
        readMatrix(matrix2, rows, cols, sc);

        int[][] result = addMatrices(matrix1, matrix2, rows, cols);

        System.out.println("Sum of matrices:");
        displayMatrix(result, rows, cols);

        sc.close();
    }
}