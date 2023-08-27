package main;

import java.util.Scanner;

public class InvalidInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("Insira um número inteiro: ");
            int number = Integer.parseInt(scanner.next());
            System.out.println("O número inserido foi: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida!");
        }
    }

}
