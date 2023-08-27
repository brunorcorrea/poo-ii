package src.main;

import java.util.Scanner;

public class Ex8 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void askClientLunchPreference() {
        System.out.println("Digite o número correspondente à sua preferência de almoço:");
    }

    public static int getClientLunchPreference() {
        return scanner.nextInt();
    }

    public static String chooseLunchOption(int userOption) {
        return switch (userOption) {
            case 1 -> "salada";
            case 2 -> "arroz e feijão";
            case 3 -> "espaguete ao sugo";
            case 4 -> "misto quente";
            case 5 -> "misto frio";
            case 6 -> "arroz e ovo frito";
            default -> "Prato indisponível";
        };
    }

    public static void printLunchOption(String chosenLunchOption) {
        System.out.println("Você escolheu " + chosenLunchOption + " para o almoço.");
    }

    public static void main(String[] args) {
        askClientLunchPreference();
        var clientOption = getClientLunchPreference();
        var chosenLunchOption = chooseLunchOption(clientOption);
        printLunchOption(chosenLunchOption);

        scanner.close();
    }
}
