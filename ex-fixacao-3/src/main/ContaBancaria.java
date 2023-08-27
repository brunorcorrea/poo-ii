package main;

public class ContaBancaria {
    private static Integer QUANTIDADE_CONTAS = 0;
    private final String numConta;
    private Double saldo;

    public ContaBancaria(Double saldo) {
        this.saldo = saldo;

        QUANTIDADE_CONTAS++;
        this.numConta = QUANTIDADE_CONTAS.toString().formatted("%06d");
    }

    public void sacar(Double valor) {
        if (valor <= 0.0 || valor > saldo) {
            System.out.println("Não foi possível realizar o saque, valor não permitido!");
            return;
        }

        this.saldo -= valor;
        System.out.println("Saque realizado com sucesso!");
    }

    public void depositar(Double valor) {
        if (valor <= 0.0) {
            System.out.println("Não foi possível realizar o depósito, valor não permitido!");
            return;
        }

        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
    }

    public Double verificarSaldo() {
        return this.saldo;
    }

    public String getNumConta() {
        return numConta;
    }
}
