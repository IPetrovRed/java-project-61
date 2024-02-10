package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    public static final int BASE_QUESTION = 0;
    public static final int BASE_ANSWER = 1;
    private static final String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final int MAX_RANDOM_INT = 100; //предельный показатель случайного числа

    public static void playGame() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNTER][2];

        for (String[] questionAnswer : questionsAndAnswers) {
            Random random = new Random();
            int x = random.nextInt(MAX_RANDOM_INT);

            questionAnswer[BASE_QUESTION] = String.valueOf(x);
            questionAnswer[BASE_ANSWER] = (isEven(x)) ? "yes" : "no";
        }
        Engine.playGame(gameDescription, questionsAndAnswers);
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

