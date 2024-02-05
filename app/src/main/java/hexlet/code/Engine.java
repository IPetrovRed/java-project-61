package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static void greetForUser() {
        System.out.print("\nWelcome to the Brain Games!\n"
                + "May I have your name? ");
    }
    public static void helloUser(String name) {
        System.out.println("Hello, "
                + name
                + "!");
    }
    public static void userAnswer() {
        System.out.print("Your answer: ");
    }
    public static void question(int number) {
        System.out.print("Question: "
                + number
                + "\nYour answer: ");
    }
    public static void correctAnswer() {
        System.out.println("Correct!");
    }
    public static void congrats(String name) {
        System.out.println("Congratulations, "
                + name
                + "!");
    }
    public static void wrongAnswerForText(String answer, String result,String name) {
        System.out.println("'" + answer
                + "' is wrong answer ;(."
                + "Correct answer was '"
                + result
                + "'."
                + "\nLet's try again, "
                + name
                + "!");
    }
    public static void wrongAnswerForNums(int answer, int result, String name) {
        System.out.println("'" + answer
                + "' is wrong answer ;(."
                + "Correct answer was '"
                + result
                + "'."
                + "'."
                + "\nLet's try again, "
                + name
                + "!");
    }

}
