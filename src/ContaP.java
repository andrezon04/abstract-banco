public class ContaP extends Conta {

    public ContaP(int numero, int agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    @Override
    void calcularTarifaMensal() {
    }
}