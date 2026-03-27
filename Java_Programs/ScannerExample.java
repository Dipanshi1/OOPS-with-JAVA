import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // Reads the number, leaves '\n' in buffer
        
        // This nextLine() consumes the leftover '\n'
        sc.nextLine(); 
        
        System.out.print("Enter your full name: ");
        String name = sc.nextLine(); // Now it waits for actual user input

        System.out.println("Name: " + name + ", Age: " + age);

        sc.close();
    }
}
