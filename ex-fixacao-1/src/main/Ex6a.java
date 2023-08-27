package src.main;

import java.util.Scanner;

public class Ex6a {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        float number, number2;

        System.out.println("Digite o primeiro número:");
        number = scanner.nextFloat();
        System.out.println("Digite o segundo número:");
        number2 = scanner.nextFloat();

        var message = "O maior número é: ";
        if(number >= number2)
            System.out.println(message + number);
        else
            System.out.println(message + number2);

        scanner.close();
    }
}
