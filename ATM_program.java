import java.util.Scanner;

class ATM {
    private double balance;

    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    public double checkBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. You cannot withdraw more than your current balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
        } else {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        }
    }

    public void transfer(ATM targetAccount, double amount, boolean sameBank) {
        if (amount > balance) {
            System.out.println("Insufficient funds. You cannot transfer more than your current balance.");
        } else {
            double transferCharge = sameBank ? 0 : amount * 0.001;
            if (amount + transferCharge > balance) {
                System.out.println("Insufficient funds to cover the transfer and charges.");
            } else {
                balance -= (amount + transferCharge);
                targetAccount.deposit(amount);
                System.out.println("Transfer successful. New balance: " + balance);
                if (!sameBank) {
                    System.out.println("Transfer charge: " + transferCharge);
                }
            }
        }
    }
}

public class ATMTransactionManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM myAccount = new ATM(1000.00); // Initial balance of 1000
        ATM otherAccount = new ATM(500.00); // Another account for transfer

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Cash");
            System.out.println("3. Transfer Money");
            System.out.println("4. Deposit Money");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + myAccount.checkBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    myAccount.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to transfer: ");
                    double transferAmount = scanner.nextDouble();
                    System.out.print("Is it within the same bank? (true/false): ");
                    boolean sameBank = scanner.nextBoolean();
                    myAccount.transfer(otherAccount, transferAmount, sameBank);
                    break;
                case 4:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    myAccount.deposit(depositAmount);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
