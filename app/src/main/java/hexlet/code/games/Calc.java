package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static final int BASE_QUESTION = 0;
    public static final int BASE_ANSWER = 1;
    private static final String GAME_DESCRIPTION = "What is the result of the expression?";
    public static final char[] OPERATORS = {'+', '-', '*'};

    public static void playGame() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNTER][2];

        for (String[] questionAnswer : questionsAndAnswers) {
            int x = Utils.generateNumber(100,1);
            int y = Utils.generateNumber(100,1);
            int setOperator = (int) (Math.random() * OPERATORS.length);
            char operator = OPERATORS[setOperator];
            switch (operator) {
                case '+':
                    questionAnswer[BASE_ANSWER] = String.valueOf(y + x);
                    break;
                case '-':
                    questionAnswer[BASE_ANSWER] = String.valueOf(y - x);
                    break;
                case '*':
                    questionAnswer[BASE_ANSWER] = String.valueOf(y * x);
                    break;
                default:
                    throw new RuntimeException("Unknown operator: " + operator);
            }
            questionAnswer[BASE_QUESTION] = y + " " + operator + " " + x;
        }
        Engine.playGame(GAME_DESCRIPTION, questionsAndAnswers);
    }

}

