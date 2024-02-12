package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static final int BASE_QUESTION = 0;
    public static final int BASE_ANSWER = 1;
    private static final String GAME_DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void playGame() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNTER][2];

        for (String[] questionAnswer : questionsAndAnswers) {
            int x = Utils.generateNumber(100,1);

            questionAnswer[BASE_QUESTION] = String.valueOf(x);
            questionAnswer[BASE_ANSWER] = (isPrime(x)) ? "yes" : "no";
        }
        Engine.playGame(GAME_DESCRIPTION, questionsAndAnswers);
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


