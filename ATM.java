import java.util.Scanner;

public class ATM {
    private double balance;

    // Constructor to initialize balance1
    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method for balance inquiry
    public void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    // Method for deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
            checkBalance();  // Show updated balance
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    // Method for withdrawal
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
            checkBalance();  // Show updated balance
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be greater than zero.");
        }
    }

    // Method to show the ATM menu and process user input
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 4);

        scanner.close();  // Close the scanner at the end
    }

    public static void main(String[] args) {
        // Create an ATM object with an initial balance of $1000
        ATM myATM = new ATM(1000.00);
        myATM.showMenu();  // Show the ATM menu
    }
}
