package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite o caminho completo do arquivo:");
        String filePath = scanner.next();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String data = reader.readLine();

            do {
                System.out.println(data);
                data = reader.readLine();
            } while (data != null);
            reader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo");
        }
    }
}
