package company.clazz;

public class Funcionario {
    protected String codigo;
    private String cpf;
    Double salario;
    public String nome;

    protected String getCodigo() {
        return codigo;
    }

    protected void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    private String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    Double getSalario() {
        return salario;
    }

    void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
