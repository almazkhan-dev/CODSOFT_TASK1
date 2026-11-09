import java.util.Scanner;

public class ATM {

    private BankAccount account;
    private Scanner sc;

    public ATM(BankAccount account) {
        this.account = account;
        this.sc = new Scanner(System.in);
    }

    public void start() {

        int choice = 0;

        do {

            System.out.println("\n====== ATM MACHINE ======");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
                continue;
            }

            switch (choice) {

                case 1:
                    account.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");

                    try {
                        double depositAmount = Double.parseDouble(sc.nextLine());
                        account.deposit(depositAmount);

                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid amount!");
                    }

                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");

                    try {
                        double withdrawAmount = Double.parseDouble(sc.nextLine());
                        account.withdraw(withdrawAmount);

                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid amount!");
                    }

                    break;

                case 4:
                    System.out.println("Thank you for using our ATM!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount(10000);

        ATM atm = new ATM(account);

        atm.start();
    }
}