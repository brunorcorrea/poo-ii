package src.main;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        byte age = scanner.nextByte();

        System.out.println("Enter current year: ");
        short year = scanner.nextShort();

        System.out.println("Enter an integer number: ");
        int intNumber = scanner.nextInt();

        System.out.println("Enter a bigger integer number: ");
        long longNumber = scanner.nextLong();

        System.out.println("Enter a decimal number: ");
        float floatNumber = scanner.nextFloat();

        System.out.println("Enter a number with more decimals places: ");
        double doubleNumber = scanner.nextDouble();

        System.out.println("Enter a character: ");
        char letter = scanner.next().charAt(0);

        System.out.println("Enter a boolean value: ");
        boolean isTrue = scanner.nextBoolean();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Your age is " + age);
        System.out.println("The current year is " + year);
        System.out.println("The integer number is " + intNumber);
        System.out.println("The bigger integer number is " + longNumber);
        System.out.println("The decimal number is " + floatNumber);
        System.out.println("The number with more decimals places is " + doubleNumber);
        System.out.println("The character is " + letter);
        System.out.println("The boolean value is " + isTrue);
        System.out.println("Your name is " + name);

        scanner.close();
    }
}
