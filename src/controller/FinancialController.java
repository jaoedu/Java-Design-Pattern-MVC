package controller;
import model.FinancialModel;
import view.FinancialView;


public class FinancialController {
    private FinancialModel model;
    private FinancialView view;

    public FinancialController(FinancialModel model, FinancialView view) {
        this.model = model;
        this.view = view;
    }

    public void deposit(double amount) {
        model.deposit(amount);
        view.printBalance(model.getBalance());
    }

    public void withdraw(double amount) {
        if (model.getBalance() >= amount) {
            model.withdraw(amount);
            view.printBalance(model.getBalance());
        } else {
            view.printInsufficientFunds();
        }
    }
}