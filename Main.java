public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("12345", "João");
        ContaPoupanca cp = new ContaPoupanca("67890", "Maria");

        cc.depositar(1000);
        cp.depositar(2000);

        System.out.println("Saldo CC: " + cc.getSaldo());
        System.out.println("Saldo CP: " + cp.getSaldo());

        cc.sacar(100);
        cp.renderJuros();

        System.out.println("Saldo CC após saque: " + cc.getSaldo());
        System.out.println("Saldo CP após rendimento: " + cp.getSaldo());

        cc.transferir(200, cp);

        System.out.println("Saldo CC após transferência: " + cc.getSaldo());
        System.out.println("Saldo CP após receber transferência: " + cp.getSaldo());
    }
}
