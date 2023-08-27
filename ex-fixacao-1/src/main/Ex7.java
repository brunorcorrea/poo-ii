package src.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var strings = new ArrayList<String>();

        System.out.println("Digite as strings ('fim' para encerrar):");
        do {
            strings.add(scanner.nextLine());
        } while (!strings.get(strings.size() - 1).endsWith("fim") || strings.size() == 128);

        System.out.println("Strings digitadas em ordem inversa:");

        for (int i = strings.size(); i-- > 0; ) {
            System.out.println(strings.get(i));
        }

        scanner.close();
    }
}
