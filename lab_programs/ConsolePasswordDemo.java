import java.io.Console;

public class ConsolePasswordDemo {
    public static void main(String[] args) {

        Console c = System.console();

        if (c != null) {
            String username = c.readLine("Enter Username: ");
            char[] password = c.readPassword("Enter Password: ");

            System.out.println("Username: " + username);
            System.out.println("Password: " + String.valueOf(password));
        } else {
            System.out.println("Console not available");
        }
    }
}
