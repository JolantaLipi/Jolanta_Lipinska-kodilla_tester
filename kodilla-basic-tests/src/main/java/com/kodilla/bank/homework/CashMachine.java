package com.kodilla.bank.homework;

public class CashMachine {
    private double[] transactions;

    public CashMachine(int size) {
        this.transactions = new double[size];
    }

    public void addTransaction(int index, double amount) {
        if (index >= 0 && index < transactions.length) {
            transactions[index] = amount;
        }
    }

    public double getBalance() {
        double balance = 0;
        for (double transaction : transactions) {
            balance += transaction;
        }
        return balance;
    }

    public int getTransactionCount() {
        return transactions.length;
    }
}

