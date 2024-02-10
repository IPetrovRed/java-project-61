package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    public static final int BASE_QUESTION = 0;
    public static final int BASE_ANSWER = 1;
    public static String gameDescription = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int MAX_RANDOM_INT = 100; //предельный показатель случайного числа

    public static void playGame() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNTER][2];

        for (String[] questionAnswer : questionsAndAnswers) {
            Random random = new Random();
            int x = random.nextInt(MAX_RANDOM_INT);

            questionAnswer[BASE_QUESTION] = String.valueOf(x);
            questionAnswer[BASE_ANSWER] = (isPrime(x)) ? "yes" : "no";
        }
        Engine.playGame(gameDescription, questionsAndAnswers);
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}


