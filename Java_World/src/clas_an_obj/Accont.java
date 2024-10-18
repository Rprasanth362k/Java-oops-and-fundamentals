package clas_an_obj;


	import java.util.Scanner;

	// Abstract class to demonstrate Abstraction
	abstract class Account {
	    protected String accountNumber;
	    protected double balance;

	    public Account(String accountNumber) {
	        this.accountNumber = accountNumber;
	        this.balance = 0.0;
	    }

	    public abstract void deposit(double amount); // Abstract method

	    public abstract void withdraw(double amount); // Abstract method

	    public void displayBalance() {
	        System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
	    }
	}

	// Inheritance: SavingsAccount inherits from Account
	class SavingsAccount extends Account {
	    private double interestRate;

	    public SavingsAccount(String accountNumber, double interestRate) {
	        super(accountNumber); // Call to the superclass constructor
	        this.interestRate = interestRate;
	    }

	    @Override
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited: $" + amount);
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            System.out.println("Withdrew: $" + amount);
	        } else {
	            System.out.println("Insufficient balance for withdrawal of: $" + amount);
	        }
	    }

	    public void addInterest() {
	        balance += balance * interestRate / 100;
	        System.out.println("Interest added. New Balance: $" + balance);
	    }
	}

	// Inheritance: CurrentAccount inherits from Account
	class CurrentAccount extends Account {
	    public CurrentAccount(String accountNumber) {
	        super(accountNumber);
	    }

	    @Override
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited: $" + amount);
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            System.out.println("Withdrew: $" + amount);
	        } else {
	            System.out.println("Insufficient balance for withdrawal of: $" + amount);
	        }
	    }
	}

	// Main class to run the program
	public class BankSystem {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter account number: ");
	        String accountNumber = scanner.nextLine();

	        System.out.print("Enter account type (1 for Savings, 2 for Current): ");
	        int accountType = scanner.nextInt();

	        Account account = null;
	        if (accountType == 1) {
	            System.out.print("Enter interest rate for savings account: ");
	            double interestRate = scanner.nextDouble();
	            account = new SavingsAccount(accountNumber, interestRate);
	        } else if (accountType == 2) {
	            account = new CurrentAccount(accountNumber);
	        } else {
	            System.out.println("Invalid account type selected.");
	            scanner.close();
	            return;
	        }

	        while (true) {
	            System.out.println("\nChoose an operation:");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Display Balance");
	            System.out.println("4. Exit");

	            int operation = scanner.nextInt();
	            switch (operation) {
	                case 1:
	                    System.out.print("Enter amount to deposit: ");
	                    double depositAmount = scanner.nextDouble();
	                    account.deposit(depositAmount);
	                    break;
	                case 2:
	                    System.out.print("Enter amount to withdraw: ");
	                    double withdrawAmount = scanner.nextDouble();
	                    account.withdraw(withdrawAmount);
	                    break;
	                case 3:
	                    account.displayBalance();
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid operation selected.");
	            }
	        }
	    }
	}


}
