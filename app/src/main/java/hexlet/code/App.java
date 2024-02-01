package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.\n" +
                        "1 - Greet\n" +
                        "2 - Even\n" +
                        "0 - Exit");
        System.out.print("Your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Cli.greet();
                break;
            case 2:
                Engine.playEven();
                break;
            case 0:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}