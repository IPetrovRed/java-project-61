package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int BASE_QUESTION = 0; // saving parameter on zero index of line (question)
    public static final int BASE_ANSWER = 1; // saving parameter on first index of line (answer)
    public static final int ROUNDS_COUNTER = 3; // game rounds limitation by limit of data in array.
    public static void playGame(String task, String[][] questionsAndAnswers) {
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        Scanner console = new Scanner(System.in);
        String username = console.nextLine();
        System.out.println("Hello, "
                + username
                + "!\n");
        System.out.println(task);

        for (String[] questionAnswer : questionsAndAnswers) {
            String correctAnswer = questionAnswer[BASE_ANSWER];
            System.out.println("\nQuestion: "
                    + questionAnswer[BASE_QUESTION]);
            System.out.print("Your answer: ");

            var currentAnswer = console.nextLine();
            boolean isAnswerCorrect = currentAnswer.equals(correctAnswer);

            if (isAnswerCorrect) {
                System.out.println("Correct!");
            } else {
                System.out.println("\n'"
                        + currentAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer
                        + "'.");
                System.out.println("Let's try again, "
                        + username
                        + "!");
                return;
            }
        }
        System.out.println("\nCongratulations, "
                + username
                + "!");
    }
}
