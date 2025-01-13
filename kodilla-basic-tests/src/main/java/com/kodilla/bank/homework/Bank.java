package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;

    public Bank(int numberOfCashMachines, int sizeOfEachMachine) {
        cashMachines = new CashMachine[numberOfCashMachines];
        for (int i = 0; i < numberOfCashMachines; i++) {
            cashMachines[i] = new CashMachine(sizeOfEachMachine);
        }
    }

    public double getTotalBalance() {
        double totalBalance = 0;
        for (CashMachine machine : cashMachines) {
            totalBalance += machine.getBalance();
        }
        return totalBalance;
    }

    public int getWithdrawalTransactionsCount() {
        int count = 0;
        for (CashMachine machine : cashMachines) {
            for (double transaction : machine.transactions) {
                if (transaction < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public int getDepositTransactionsCount() {
        int count = 0;
        for (CashMachine machine : cashMachines) {
            for (double transaction : machine.transactions) {
                if (transaction > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public double getAverageWithdrawal() {
        double sum = 0;
        int count = 0;
        for (CashMachine machine : cashMachines) {
            for (double transaction : machine.transactions) {
                if (transaction < 0) {
                    sum += transaction;
                    count++;
                }
            }
        }
        return count == 0 ? 0 : sum / count;
    }

    public double getAverageDeposit() {
        double sum = 0;
        int count = 0;
        for (CashMachine machine : cashMachines) {
            for (double transaction : machine.transactions) {
                if (transaction > 0) {
                    sum += transaction;
                    count++;
                }
            }
        }
        return count == 0 ? 0 : sum / count;
}
}
