package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    private static final String GAME_DESCRIPTION = "What is the result of the expression?";

    public static final char[] OPERATORS = {'+', '-', '*'};

    private static final int MAX_RANDOM_NUMBER = 100;

    public static void playGame() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNTER][2];
        for (int i = 0; i < questionsAndAnswers.length; i++) {
            int x = Utils.generateNumber(MAX_RANDOM_NUMBER, 1);
            int y = Utils.generateNumber(MAX_RANDOM_NUMBER, 1);
            int setOperator = (int) (Math.random() * OPERATORS.length);
            char operator = OPERATORS[setOperator];
            String answer = String.valueOf(calculate(operator, x, y));
            questionsAndAnswers[i][0] = y + " " + operator + " " + x;
            questionsAndAnswers[i][1] = answer;
        }
        Engine.playGame(GAME_DESCRIPTION, questionsAndAnswers);
    }

    private static int calculate(char operator, int x, int y) {
        switch (operator) {
            case '+':
                return y + x;
            case '-':
                return y - x;
            case '*':
                return y * x;
            default:
                throw new RuntimeException("Unknown operator: " + operator);
        }
    }

}


