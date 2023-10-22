import java.util.Scanner;
import controller.FinancialController;
import model.FinancialModel;
import view.FinancialView;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();

        FinancialModel model = new FinancialModel();
        model.setBalance(saldoInicial);

        FinancialView view = new FinancialView();
        FinancialController controller = new FinancialController(model, view);

        System.out.print("Informe a quantia que deseja retirar: ");
        double quantiaRetirada = scanner.nextDouble();

        if (quantiaRetirada > 0) {
            controller.withdraw(quantiaRetirada);
        } else {
            System.out.println("Quantia inválida.");
        }

        scanner.close();
    }
}
