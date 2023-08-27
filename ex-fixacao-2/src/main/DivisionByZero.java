package main;

import java.util.Scanner;

public class DivisionByZero {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insira o primeiro número: ");
        double number1 = scanner.nextDouble();
        System.out.println("Insira o segundo número: ");
        double number2 = scanner.nextDouble();

        try {
            System.out.println("O resultado da divisão é: " + divide(number1, number2));
        } catch (ArithmeticException e) {
            System.out.println("\n\n" + e.getMessage());
        }
    }

    public static double divide(double number1, double number2) throws ArithmeticException {
        if (number2 == 0.0) throw new ArithmeticException("DIVISÃO POR ZERO NÃO É PERMITIDA!");

        return number1 / number2;
    }
}
