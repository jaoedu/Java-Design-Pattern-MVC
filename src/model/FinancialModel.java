package model;

public class FinancialModel {
    private double balance = 0;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) { // Adicionar um método para definir o saldo inicial
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Retirada bem-sucedida. Saldo restante: " + balance);
        } else {
            System.out.println("Saldo insuficiente. Saldo atual: " + balance);
        }
    }
}