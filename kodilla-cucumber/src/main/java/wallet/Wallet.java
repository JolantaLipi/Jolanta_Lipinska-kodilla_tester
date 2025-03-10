public class Wallet {
    private int balance;

    public Wallet() {
        this.balance = 0;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public boolean withdraw(int amount) {
        if (amount > balance) {
            return false; // Not enough money
        }
        this.balance -= amount;
        return true;
    }

    public int getBalance() {
        return balance;
    }
}
