public class BankAccount {
    String ownerName;
    double balance;

    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return String.format("Deposited %s", amount);
        }
        return String.format("Insufficient funds %s", amount);
    }

    public String withdraw(double amount) {
        if (amount > 0) {
            this.balance -= amount;
            return String.format("Withdrawn %s", amount);
        }
        return String.format("Insufficient funds %s", amount);
    }

    public String printBalance() {
        return "Balance: " + this.balance;
    }
}
