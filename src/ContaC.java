public class ContaC extends Conta {

    public ContaC(int numero, int agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    @Override
    void calcularTarifaMensal() {
        setSaldo(getSaldo()-12);
    }
}