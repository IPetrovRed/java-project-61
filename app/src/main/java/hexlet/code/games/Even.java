package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static final int BASE_QUESTION = 0;
    public static final int BASE_ANSWER = 1;
    private static final String GAME_DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void playGame() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNTER][2];

        for (String[] questionAnswer : questionsAndAnswers) {
            int x = Utils.generateNumber(MAX_RANDOM_NUMBER, 1);

            questionAnswer[BASE_QUESTION] = String.valueOf(x);
            questionAnswer[BASE_ANSWER] = (isEven(x)) ? "yes" : "no";
        }
        Engine.playGame(GAME_DESCRIPTION, questionsAndAnswers);
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

