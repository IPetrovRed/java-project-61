package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static final int BASE_QUESTION = 0;
    public static final int BASE_ANSWER = 1;
    private static final String GAME_DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void playGame() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNTER][2];

        for (String[] questionAnswer : questionsAndAnswers) {
            int x = Utils.generateNumber(MAX_RANDOM_NUMBER, 1);
            int y = Utils.generateNumber(MAX_RANDOM_NUMBER, 1);

            questionAnswer[BASE_QUESTION] = x + " " + y;
            questionAnswer[BASE_ANSWER] = String.valueOf(calculateGCD(x, y));
        }
        Engine.playGame(GAME_DESCRIPTION, questionsAndAnswers);
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




