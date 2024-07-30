
public class ContaPoupanca extends Conta {
    private double taxaDeRendimento = 0.05;

    public ContaPoupanca(String numero, String titular) {
        super(numero, titular);
    }

    public void renderJuros() {
        double juros = saldo * taxaDeRendimento;
        depositar(juros);
    }
}
