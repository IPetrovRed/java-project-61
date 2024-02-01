package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void playEven() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int correctAnswersCount = 0;
        while (correctAnswersCount < 3) {
            int number = (int) (Math.random() * 100) + 1;
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            // Checking if the answer is correct
            boolean isEven = number % 2 == 0;
            boolean isCorrectAnswer = (isEven && answer.equals("yes")) || (!isEven && answer.equals("no"));

            if (isCorrectAnswer) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + (isEven ? "no" : "yes") + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + name + "!");
    }

}