package wustemberg.gustavo.models;

public class ContaTerminal {
    private int number;
    private String agency;
    private String name;
    private double balance;

    public ContaTerminal(int number, String agency, String name, double balance) {
        this.number = number;
        this.agency = agency;
        this.name = name;
        this.balance = balance;
    }

    public void Message() {
        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de %.2f já está disponível para saque", name, agency, number, balance));
    }
}
