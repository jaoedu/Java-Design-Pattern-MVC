package view;

public class FinancialView {
    public void printBalance(double balance) {
        System.out.println("Saldo atual: " + balance);
    }

    public void printInsufficientFunds() {
        System.out.println("Saldo insuficiente.");
    }
}

