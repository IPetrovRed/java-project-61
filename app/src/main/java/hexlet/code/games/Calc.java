package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static final int BASE_QUESTION = 0;
    public static final int BASE_ANSWER = 1;
    public static String gameDescription = "What is the result of the expression?";
    public static final int MAX_RANDOM_INT = 100; //предельный показатель случайного числа
    public static final char[] OPERATORS = {'+', '-', '*'};

    public static void playGame() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNTER][2];

        for (String[] questionAnswer : questionsAndAnswers) {
            Random random = new Random();
            int x = random.nextInt(MAX_RANDOM_INT);
            int y = random.nextInt(MAX_RANDOM_INT);
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
                    break;
            }
            questionAnswer[BASE_QUESTION] = y + " " + operator + " " + x;
        }
        Engine.playGame(gameDescription, questionsAndAnswers);
    }

}

