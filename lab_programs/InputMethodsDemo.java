import java.io.*;
import java.util.*;

public class InputMethodsDemo {
    public static void main(String[] args) throws Exception {

        System.out.println("Command Line Arguments:");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter using BufferedReader: ");
        String b = br.readLine();
        System.out.println("You entered: " + b);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter using Scanner: ");
        String s = sc.nextLine();
        System.out.println("You entered: " + s);

        Console c = System.console();
        if (c != null) {
            String con = c.readLine("Enter using Console: ");
            System.out.println("You entered: " + con);
        } else {
            System.out.println("Console not available");
        }
    }
}