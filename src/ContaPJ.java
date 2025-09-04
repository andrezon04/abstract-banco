public class ContaPJ extends Conta {

    public ContaPJ(int numero, int agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    @Override
    void calcularTarifaMensal() {
        setSaldo(getSaldo()-12);
    }
    @Override
    public void sacar(double valor) {
        double taxa = 1.50;
        double valorTotal = valor + taxa;

        if (valor > 0 && getSaldo() >- valorTotal){
            setSaldo(getSaldo() - valorTotal);
        }
    }
}