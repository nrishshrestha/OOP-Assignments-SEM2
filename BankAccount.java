public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (initialBalance >= 0) {
            this.accountBalance = initialBalance;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            return true;
        }
        return false;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", "Alice", 1000.0);
        account.deposit(500.0);
        account.withdraw(300.0);
        System.out.println("Account Balance: $" + account.getAccountBalance());
    }
}
