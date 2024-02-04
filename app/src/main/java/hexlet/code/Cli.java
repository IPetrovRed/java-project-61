package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static void greet() {

        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        String name = getName();
        System.out.println("Hello, " + name + "!");
    }
    public static void greet4Games() {
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
    }
}

