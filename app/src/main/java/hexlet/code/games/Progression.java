package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    private static final String GAME_DESCRIPTION = "\nWhat number is missing in the progression?";

    private static final int PROGRESSION_LENGTH = 8; // max limit of progression line.

    private static final int FIRST_NUMBER = 20;

    private static final int STEP = 5;

    public static void playGame() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNTER][2];

        for (String[] questionAnswer : questionsAndAnswers) {
            int first = Utils.generateNumber(FIRST_NUMBER, 1);
            int step = Utils.generateNumber(STEP, 1);
            var hiddenIndex = Utils.generateNumber(0, PROGRESSION_LENGTH - 1);
            String[] progression = makeProgression(first, step, PROGRESSION_LENGTH);
            var correctAnswer = progression[hiddenIndex];
            progression[hiddenIndex] = "..";
            var question = String.join(" ", progression);
            questionAnswer[0] = question;
            questionAnswer[1] = String.valueOf(correctAnswer);
        }
        Engine.playGame(GAME_DESCRIPTION, questionsAndAnswers);
    }

    private static String[] makeProgression(int first, int step, int length) {
        String[] progression = new String[length];

        for (int i = 0; i < length; i += 1) {
            progression[i] = Integer.toString(first + i * step);
        }

        return progression;
    }
}





