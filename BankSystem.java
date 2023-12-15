import java.util.*;

class BankAccount {
    private double balance;     // cannot be access by anyone expect class member

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}

class ATM {
    // Methods now take a BankAccount parameter directly
    public static void withdraw(BankAccount userAccount, double amount)             //created and passed object for access of required data
    {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            userAccount.withdraw(amount);
        }
    }

    public static void deposit(BankAccount userAccount, double amount) {
        if (amount <= 0) {
            System.out.println("Enter proper deposit amount.");
        } else {
            userAccount.deposit(amount);
        }
    }

    public static void checkBalance(BankAccount userAccount) {
        userAccount.checkBalance();
    }
}

public class BankSystem {
    public static void main(String[] args) {

        System.out.println("*********************Welcome to the ATM*****************************");

        BankAccount userAccount = new BankAccount(1000.0);      // Initially bank balance must be 1000
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose your choice  : ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    ATM.withdraw(userAccount, withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    ATM.deposit(userAccount, depositAmount);
                    break;
                case 3:
                    ATM.checkBalance(userAccount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
