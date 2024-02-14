package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {

    private static final String GAME_DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void playGame() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNTER][2];

        for (String[] questionAnswer : questionsAndAnswers) {
            int x = Utils.generateNumber(MAX_RANDOM_NUMBER, 1);
            int y = Utils.generateNumber(MAX_RANDOM_NUMBER, 1);

            questionAnswer[0] = x + " " + y;
            questionAnswer[1] = String.valueOf(gcd(x, y));
        }
        Engine.playGame(GAME_DESCRIPTION, questionsAndAnswers);
    }
    public static int gcd(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int temp = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = temp;
        }
        return firstNumber;
    }
}




