public class PalindromeCheck {
    static boolean isPalindrome(int num){
        int original = num;
        int reverse = 0;
        while (num>0){
            int digit = num%10;
            reverse = reverse*10 + digit;
            num = num/10;
        }
        return original == reverse;
    }
    public static void main (String[] args){
        if (args.length == 0){
            System.out.println("Please provide a number as command line argument: ");
            return;
        }
        int num = Integer.parseInt(args[0]);
        if (isPalindrome(num))
            System.out.println(num + " is a Palindrome Number");
        else
            System.out.println(num + " is not a Palindrome Number");
    }
}
