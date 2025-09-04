import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Conta cc = new ContaC(101, 1, "Carlos", 5000);
        System.out.println("\nConta nº: " + cc.getNumero());
        System.out.println("Titular: " + cc.getTitular());
        System.out.println("Saldo total: R$" + cc.getSaldo());
        cc.depositar(200.00);
        System.out.println("Deposito: R$200,00");
        cc.exibirSaldo();
        cc.sacar(150.00);
        System.out.println("Saque: R$150.00");
        cc.exibirSaldo();
        cc.calcularTarifaMensal();
        System.out.println("Calculando Tarifa...");
        cc.exibirSaldo();

        Conta cp = new ContaP(202, 2, "Carol", 5000);
        System.out.println("\nConta nº: " + cp.getNumero());
        System.out.println("Titular: " + cp.getTitular());
        System.out.println("Saldo total: R$" + cp.getSaldo());
        cp.depositar(1000.00);
        System.out.println("Deposito: R$1000,00");
        cp.exibirSaldo();
        cp.sacar(500.00);
        System.out.println("Saque: R$500.00");
        cp.exibirSaldo();

        Conta pj = new ContaPJ(303, 3, "Cris", 5000);
        System.out.println("\nConta nº: " + pj.getNumero());
        System.out.println("Titular: " + pj.getTitular());
        System.out.println("Saldo total: R$" + pj.getSaldo());
        pj.depositar(50.00);
        System.out.println("Deposito: R$50,00");
        pj.exibirSaldo();
        pj.sacar(1500.00);
        System.out.println("Saque: R$1500.00");
        pj.exibirSaldo();
        pj.calcularTarifaMensal();
        System.out.println("Calculando Tarifa...");
        pj.exibirSaldo();
    }
}