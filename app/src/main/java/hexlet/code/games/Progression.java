package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Arrays;
import java.util.Random;

public class Progression {
    public static final int BASE_QUESTION = 0;
    public static final int BASE_ANSWER = 1;
    private static final String GAME_DESCRIPTION = "\nWhat number is missing in the progression?";
    private static final int PROGRESSION_LENGTH = 8; // max limit of progression line.

    private static final int FIRST_NUMBER = 20;
    private static final int STEP = 5;

    public static void playGame() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNTER][2];

        for (String[] questionAnswer : questionsAndAnswers) {
            Random random = new Random();
            int first = Utils.generateNumber(FIRST_NUMBER,1);
            int step = Utils.generateNumber(STEP,1);
            String[] progression = makeProgression(first,step,PROGRESSION_LENGTH);
            int hiddenIndex = random.nextInt(PROGRESSION_LENGTH);
            String correctAnswer = progression[hiddenIndex];
            progression[hiddenIndex] = "..";

            String formattedProgression = Arrays.toString(progression)
                    .replace("-1", "..")
                    .replace(", ", " ")
                    .replace("[", "")
                    .replace("]", "");

            questionAnswer[BASE_QUESTION] = formattedProgression;
            questionAnswer[BASE_ANSWER] = String.valueOf(correctAnswer);
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





