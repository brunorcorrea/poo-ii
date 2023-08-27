package company;

import company.clazz.Funcionario;

public class FuncionarioMain {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        //funcionario.codigo = "123456"; // Não é possível acessar o atributo pois ele é protected
        //funcionario.cpf = "12345678900"; // Não é possível acessar o atributo pois ele é private
        //funcionario.salario = 1000.0; // Não é possível acessar o atributo pois ele é default
        funcionario.nome = "Mario";

        System.out.println("Nome: " + funcionario.nome);
        //System.out.println("CPF: " + funcionario.cpf); // Não é possível acessar o atributo pois ele é private
        //System.out.println("Salário: " + funcionario.salario); // Não é possível acessar o atributo pois ele é default
        //System.out.println("Código: " + funcionario.codigo); // Não é possível acessar o atributo pois ele é protected

        funcionario.setNome("João");
        System.out.println("Nome: " + funcionario.getNome());

        funcionario.setCpf("12345678900");
        //System.out.println("CPF: " + funcionario.getCpf()); // Não é possível acessar o atributo pois ele é private

        //funcionario.setSalario(1000.0); // Não é possível acessar o atributo pois ele é default
        //System.out.println("Salário: " + funcionario.getSalario()); // Não é possível acessar o atributo pois ele é default

        //funcionario.setCodigo("123456"); // Não é possível acessar o atributo pois ele é protected
        //System.out.println("Código: " + funcionario.getCodigo()); // Não é possível acessar o atributo pois ele é protected
    }
}
