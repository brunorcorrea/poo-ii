package main;

import java.util.Scanner;

public class FinalizationBlock {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};

        System.out.print("Insira a posição do vetor: ");
        int pos = scanner.nextInt();

        try {
            if (pos > vetor.length)
                throw new Exception("O tamanho passado é maior que o limite definido!");
            else System.out.println("O valor da posição " + pos + " é: " + vetor[pos]);
        } catch (Exception e) {
            System.out.println("\n\n\nEXCEÇÃO LANÇADA: " + e.getMessage() + "\n\n");
        } finally {
            System.out.println("O vetor completo é:");
            for (int i = 0; i < vetor.length; i++) {
                System.out.print("| " + vetor[i] + " ");
            }
            System.out.println("|\n\n");
        }
    }
}
