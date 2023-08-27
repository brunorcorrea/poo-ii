package src.main;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("Digite um valor para a tabuada:");
        int valor = new Scanner(System.in).nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + (valor * i));
        }
    }
}
