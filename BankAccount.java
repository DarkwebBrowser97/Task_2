import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {

    private double balance;
    private final ArrayList<Transaction> transactions; // List to store transactions

    public BankAccount(int accountNumber) {
        this.balance = 0.0;
        this.transactions = new ArrayList<Transaction>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction("Deposit", amount));
            System.out.println("Deposit Successful! New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction("Withdrawal", amount));
            System.out.println("Withdrawal Successful! New balance: $" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    public void printMiniStatement() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions yet!");
        } else {
            System.out.println("Recent Transactions:");
            for (Transaction transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int accountNumber = 123456; // Replace with actual account number generation logic
        BankAccount account = new BankAccount(accountNumber);

        int choice;
        do {
            System.out.println("\nBank Menu");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Mini Statement");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                }
                case 2 -> {
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                }
                case 3 -> account.printMiniStatement();
                case 4 -> System.out.println("Exiting Bank System!");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        scanner.close();
    }
}

class Transaction {
    private final String type;
    private final double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return type + ": $" + amount;
    }
}