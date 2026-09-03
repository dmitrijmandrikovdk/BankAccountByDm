public class BankAccount {
    private String ownerName;
    private String accountNumber;
    private double balance;

    public BankAccount(String ownerName, String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0.0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println(" Deposited: $ " + amount + " New balance: $" + this.balance);
        } else {
            System.out.println(" Deposit amount must be positive! ");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println(" No money on your account ");
        } else if (amount > this.balance) {
            System.out.println(" Insufficient funds !" + amount + " Current balance: $" + this.balance);
        } else {
            this.balance -= amount;
            System.out.println(" Withdrew: $" + amount + " Remaining balance: $" + this.balance);
        }
    }

    public double getBalance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return " BankAccount [Owner: " + this.ownerName +
                " Account: " + this.accountNumber +
                " Balance: $" + this.balance + "]";
    }
}
