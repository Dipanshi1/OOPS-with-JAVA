import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        System.out.println("Enter radius");
        int n=S.nextInt();
        System.out.println(3.14*n*n);
        S.close();
    }
}
