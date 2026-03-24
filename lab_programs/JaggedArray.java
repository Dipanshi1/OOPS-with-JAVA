import java.util.Scanner;
public class JaggedArray {
    static int[][] createJaggedArray(int rows, Scanner sc){
       int[][] jagged = new int[rows][];
       for (int i=0; i<rows; i++){
           System.out.println("Enter number of columns for row " + (i+1) + ": ");
           int cols = sc.nextInt();
           jagged[i] = new int[cols];
        }
       return jagged;
    }
    static void readElements(int[][] jagged, Scanner sc){
        System.out.println("Enter elements of jagged array: ");
        for (int i=0; i<jagged.length; i++){
            for (int j=0; j<jagged[i].length; j++){
                jagged[i][j] = sc.nextInt();
            }
        }
    }
    static void displayArray(int[][] jagged){
        System.out.println("jagged array elements: ");
        for (int i=0; i<jagged.length; i++){
            for (int j=0; j<jagged[i].length; j++){
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        int[][] jagged =createJaggedArray(rows, sc);
        readElements(jagged, sc);
        displayArray(jagged);
        sc.close();
    }
}
