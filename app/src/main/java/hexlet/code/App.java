package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calc;

import hexlet.code.games.Even;

import hexlet.code.games.GCD;

import hexlet.code.games.Prime;

import hexlet.code.games.Progression;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");
        System.out.print("Your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Cli.greet();
                break;
            case 2:
                Even.playEven();
                break;
            case 3:
                Calc.playCalc();
                break;
            case 4:
                GCD.gcdGame();
                break;
            case 5:
                Progression.progressionGame();
                break;
            case 6:
                Prime.primeGame();
                break;
            case 0:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("'" + choice + "'" + " is invalid choice, please chose between 0 and 6!");
                break;
        }
    }
}

