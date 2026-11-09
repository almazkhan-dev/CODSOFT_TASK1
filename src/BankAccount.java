public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid deposit amount!");
            return;
        }

        balance += amount;

        System.out.println("Amount deposited successfully!");
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        }
        else if (amount > balance) {
            System.out.println("Insufficient balance!");
        }
        else {
            balance -= amount;

            System.out.println("Please collect your cash.");
            System.out.println("Withdrawal successful!");
        }
    }

    public void checkBalance() {
        System.out.println("Available Balance: Rs. " + balance);
    }
}