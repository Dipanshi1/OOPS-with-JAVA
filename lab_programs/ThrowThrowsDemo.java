import java.util.Scanner;

class Validator {
    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Invalid age: must be 18 or above");
        } else {
            System.out.println("Valid age");
        }
    }
}

public class ThrowThrowsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            Validator.checkAge(age);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}