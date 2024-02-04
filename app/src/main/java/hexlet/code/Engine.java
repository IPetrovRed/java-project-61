package hexlet.code;

import hexlet.code.games.Games;

import java.util.Scanner;

public class Engine {

    public static void gameChoicer() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Cli.greet();
                break;
            case 2:
                Games.playEven();
                break;
            case 3:
                Games.playCalc();
                break;
            case 4:
                Games.gcdGame();
                break;
            case 5:
                Games.progressionGame();
                break;
            case 6:
                Games.primeGame();
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
