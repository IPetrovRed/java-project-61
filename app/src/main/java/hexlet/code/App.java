package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

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

        System.out.println("");

        switch (choice) {
            case 1: //Привествуем пользователя
                Cli.greet();
                break;
            case 2: //Вызов игры - четное / нечентное
                Even.playGame();
                break;
            case 3: //Вызов игры - калькулятор
                Calc.playGame();
                break;
            case 4: // Вызов игры НОД
                GCD.playGame();
                break;
            case 5: // Вызов игры - Прогрессия
                Progression.playGame();
                break;
            case 6: // Вызов игры - Простое ли число?
                Prime.playGame();
                break;
            case 0:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("'"
                        + choice
                        + "'"
                        + " is invalid choice, please chose between 0 and 6!");
                break;
        }
    }
}

