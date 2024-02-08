package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static Scanner scanner = new Scanner(System.in);

    public static String getName() {
        return scanner.nextLine();
    }

    public static void greetForUser() {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
    }

    public static void helloUser(String name) {
        System.out.println("Hello, " + name + "!");
    }
    public static void gameDescription(String description) {
        System.out.println(description);
    }

    public static void userAnswer() {
        System.out.print("Your answer: ");
    }

    public static void question(String question) {
        System.out.println(question);
    }

    public static void correctAnswer() {
        System.out.println("Correct!");
    }

    public static void congrats(String name) {
        System.out.println("Congratulations, " + name + "!");
    }

    public static void wrongAnswer(String answer, String result, String name) {
        System.out.println("'" + answer
                + "' is wrong answer ;(."
                + " Correct answer was '"
                + result
                + "'."
                + "\nLet's try again, "
                + name
                + "!");
    }
    public static void wrongAnswerNumbers(int answer, int result, String name) {
        System.out.println("'" + answer
                + "' is wrong answer ;(."
                + " Correct answer was '"
                + result
                + "'."
                + "\nLet's try again, "
                + name
                + "!");
    }
    public static int gameLimit() {
        return 3;
    }
}
