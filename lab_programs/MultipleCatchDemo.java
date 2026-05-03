public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int arr[] = new int[5];

            int result = a / b;
            System.out.println(arr[10]);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}