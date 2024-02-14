package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static final String GAME_DESCRIPTION = "What is the result of the expression?";
    public static final char[] OPERATORS = {'+', '-', '*'};
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void playGame() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNTER][2];

        for (String[] questionAnswer : questionsAndAnswers) {
            int x = Utils.generateNumber(MAX_RANDOM_NUMBER, 1);
            int y = Utils.generateNumber(MAX_RANDOM_NUMBER, 1);
            int setOperator = (int) (Math.random() * OPERATORS.length);
            char operator = OPERATORS[setOperator];
            calculate(operator, x, y, questionAnswer);
        }
        Engine.playGame(GAME_DESCRIPTION, questionsAndAnswers);
    }
    private static void calculate(char operator, int x, int y, String[] questionAnswer) {
        switch (operator) {
            case '+':
                questionAnswer[1] = String.valueOf(y + x);
                break;
            case '-':
                questionAnswer[1] = String.valueOf(y - x);
                break;
            case '*':
                questionAnswer[1] = String.valueOf(y * x);
                break;
            default:
                throw new RuntimeException("Unknown operator: " + operator);
        }
        questionAnswer[0] = y + " " + operator + " " + x;
    }
}


