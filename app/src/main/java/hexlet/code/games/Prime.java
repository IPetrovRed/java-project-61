package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    private static final String GAME_DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void playGame() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNTER][2];

        for (String[] questionAnswer : questionsAndAnswers) {
            int x = Utils.generateNumber(MAX_RANDOM_NUMBER, 1);

            questionAnswer[0] = String.valueOf(x);
            questionAnswer[1] = (isPrime(x)) ? "yes" : "no";
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


