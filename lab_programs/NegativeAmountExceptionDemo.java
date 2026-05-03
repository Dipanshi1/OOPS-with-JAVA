class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

class Bank {
    public void deposit(double amount) throws NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Error: Negative amount entered!");
        } else {
            System.out.println("Amount deposited successfully: " + amount);
        }
    }
}

public class NegativeAmountExceptionDemo {
    public static void main(String[] args) {
        Bank b = new Bank();

        try {
            b.deposit(-500);
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        }

        try {
            b.deposit(1000);
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}