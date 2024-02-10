package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GCD {
    public static final int BASE_QUESTION = 0;
    public static final int BASE_ANSWER = 1;
    public static String gameDescription = "Find the greatest common divisor of given numbers.";
    public static final int MAX_RANDOM_INT = 100; //предельный показатель случайного числа

    public static void playGame() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNTER][2];

        for (String[] questionAnswer : questionsAndAnswers) {
            Random random = new Random();
            int x = random.nextInt(MAX_RANDOM_INT);
            int y = random.nextInt(MAX_RANDOM_INT);

            questionAnswer[BASE_QUESTION] = x + " " + y;
            questionAnswer[BASE_ANSWER] = String.valueOf(calculateGCD(x, y));
        }
        Engine.playGame(gameDescription, questionsAndAnswers);
    }
    public static int calculateGCD(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int temp = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = temp;
        }
        return firstNumber;
    }
}




