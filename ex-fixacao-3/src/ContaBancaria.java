public class ContaBancaria {
    private String numConta;
    private Double saldo;

    public ContaBancaria(String numConta) {
        this.numConta = numConta;
        this.saldo = 0.0;
    }

    public void sacar(Double valor) throws Exception {
        validarSaque(valor);
        efetuarSaque(valor);
    }

    public boolean depositar(Double valor) {
        return false;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    private void validarSaque(Double valor) throws Exception {
        if (valor <= 0.0)
            throw new Exception("O valor para saque não pode ser negativo!");

        if (valor > saldo)
            throw new Exception("O valor para saque não pode ser maior que o saldo atual da conta!");

    }

    private void efetuarSaque(Double valor) {
        setSaldo(saldo - valor);
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
