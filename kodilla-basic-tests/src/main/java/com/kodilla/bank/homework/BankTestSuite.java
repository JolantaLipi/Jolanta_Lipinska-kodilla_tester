package com.kodilla.bank.homework.;

public class BankTestSuite {
    public static void main(String[] args) {

        Bank bank = new Bank(2, 5);

        bank.cashMachines[0].addTransaction(0, 200);
        bank.cashMachines[0].addTransaction(1, -100);
        bank.cashMachines[0].addTransaction(2, -50);
        bank.cashMachines[0].addTransaction(3, 300);
        bank.cashMachines[0].addTransaction(4, -200);

        bank.cashMachines[1].addTransaction(0, 500);
        bank.cashMachines[1].addTransaction(1, -300);
        bank.cashMachines[1].addTransaction(2, -150);
        bank.cashMachines[1].addTransaction(3, 100);
        bank.cashMachines[1].addTransaction(4, -250);



        System.out.println("Całkowity bilans: " + bank.getTotalBalance());
        System.out.println("Liczba transakcji wypłat: " + bank.getWithdrawalTransactionsCount());
        System.out.println("Liczba transakcji wpłat: " + bank.getDepositTransactionsCount());
        System.out.println("Średnia wartość wypłaty: " + bank.getAverageWithdrawal());
        System.out.println("Średnia wartość wpłaty: " + bank.getAverageDeposit());
    }
}
}
