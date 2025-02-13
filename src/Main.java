import wustemberg.gustavo.models.ContaTerminal;
import wustemberg.gustavo.models.Inputs;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Inputs input = new Inputs();
        int number = 0;
        String agency = "";
        String name = "";
        double balance = 0;

        while (true) {
            System.out.println("Digite o número da sua conta");
            try {
                number = input.IntInput();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Insira um valor válido");
            }
        }

        System.out.println("Digite o número da agência");
        try {
            agency = input.Input();
        } catch (InputMismatchException e) {
            System.out.println("Insira um valor válido");
        }

        System.out.println("Digite seu nome da mesma maneira escrita no cartão");
        try {
            name = input.Input();
        } catch (InputMismatchException e) {
            System.out.println("Insira um valor válido");
        }

        while (true) {
            System.out.println("Digite o valor a ser depositado");
            try {
                balance = input.DoubleInput();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Insira um valor válido");
            }
        }

        ContaTerminal conta = new ContaTerminal(number, agency, name, balance);
        conta.Message();
    }
}