import java.util.Scanner;

class BankAccount {

    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.printf("Current Balance: ₹%.2f%n", balance);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== BANK ACCOUNT SYSTEM =====");

        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();

        System.out.print("Enter initial balance: ₹");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(name, initialBalance);

        account.displayBalance();

        System.out.print("\nEnter amount to deposit: ₹");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ₹");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        System.out.println("\n===== UPDATED ACCOUNT DETAILS =====");
        account.displayBalance();

        scanner.close();
    }
}
