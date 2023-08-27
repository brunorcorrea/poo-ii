package src.main;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        float number, number2;

        System.out.println("Digite o primeiro número:");
        number = scanner.nextFloat();
        System.out.println("Digite o segundo número:");
        number2 = scanner.nextFloat();

        System.out.println("O maior número é: " + Math.max(number, number2));

        scanner.close();
    }
}
