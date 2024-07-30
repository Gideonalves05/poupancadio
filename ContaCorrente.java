public class ContaCorrente extends Conta {
    private double taxaDeOperacao = 0.10;

    public ContaCorrente(String numero, String titular) {
        super(numero, titular);
    }

    @Override
    public boolean sacar(double valor) {
        double valorComTaxa = valor + taxaDeOperacao;
        return super.sacar(valorComTaxa);
    }

    @Override
    public boolean transferir(double valor, Conta destino) {
        double valorComTaxa = valor + taxaDeOperacao;
        return super.transferir(valorComTaxa, destino);
    }
}
