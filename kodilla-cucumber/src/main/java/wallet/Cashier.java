public class Cashier {
    private final CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public boolean withdraw(Wallet wallet, int amount) {
        if (wallet.withdraw(amount)) {
            cashSlot.dispenseCash(amount);
            return true;
        }
        return false;
    }
}