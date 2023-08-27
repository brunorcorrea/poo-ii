package main;

public class ContaBancariaMain {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(0.0);
        System.out.println("Número da conta: " + conta.getNumConta() + "\n");

        conta.sacar(100.0);
        conta.depositar(100.0);

        System.out.println("Saldo atual: " + conta.verificarSaldo());

        conta.sacar(-2.0);
        conta.depositar(-6.0);

        System.out.println("Saldo atual: " + conta.verificarSaldo());

        conta.sacar(50.0);
        System.out.println("Saldo atual: " + conta.verificarSaldo());
    }
}
