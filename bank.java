public class BankAccount {
    private double balance;

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn.");
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }

    // Check balance
    public double getBalance() {
        return balance;
    }

    // Main method to test the class
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1000);  // Start with 1000 balance

        myAccount.deposit(500);
        myAccount.withdraw(200);
        System.out.println("Current balance: " + myAccount.getBalance());
    }
}
