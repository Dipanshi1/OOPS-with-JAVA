import Mathematics.Matrix;

public class MatrixDemo {
    public static void main(String[] args) {

        int[][] a = { {1, 2}, {3, 4} };
        int[][] b = { {5, 6}, {7, 8} };

        Matrix m = new Matrix();

        int[][] sum = m.add(a, b);
        int[][] diff = m.subtract(a, b);

        System.out.println("Addition:");
        m.print(sum);

        System.out.println("Subtraction:");
        m.print(diff);
    }
}