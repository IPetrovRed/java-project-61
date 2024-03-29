package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {

    private static final int EVEN_GAME = 2;

    private static final int CALC_GAME = 3;

    private static final int GCD_GAME = 4;

    private static final int PROGRESSION_GAME = 5;

    private static final int PRIME_GAME = 6;


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
            case 1: // greet for new player
                Cli.greet();
                break;
            case EVEN_GAME: // run <Even> game
                Even.playGame();
                break;
            case CALC_GAME: // run <Calculator> game
                Calc.playGame();
                break;
            case GCD_GAME: // ru game <NOD>
                GCD.playGame();
                break;
            case PROGRESSION_GAME: // run game <Progression>
                Progression.playGame();
                break;
            case PRIME_GAME: // run game <is number prime?>
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

