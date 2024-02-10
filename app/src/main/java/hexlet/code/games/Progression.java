package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Arrays;
import java.util.Random;

public class Progression {
    public static final int BASE_QUESTION = 0;
    public static final int BASE_ANSWER = 1;
    private static final String GAME_DESCRIPTION = "\nWhat number is missing in the progression?";
    public static final int MAX_RANDOM_INT = 100; //предельный показатель случайного числа
    private static final int PROGRESSION_LENGTH = 8; //предельыная длинна прогрессии
    private static final int START_NUMBER = 20;
    private static final int STEP_NUMBER = 5;

    public static void playGame() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNTER][2];

        for (String[] questionAnswer : questionsAndAnswers) {
            Random random = new Random();
            int x = random.nextInt(MAX_RANDOM_INT);
            int y = random.nextInt(MAX_RANDOM_INT);
            int progressionLength = PROGRESSION_LENGTH;
            int[] progression = generateProgression(progressionLength, random);
            int hiddenIndex = random.nextInt(progressionLength);
            int correctAnswer = progression[hiddenIndex];
            progression[hiddenIndex] = -1;

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

    public static int[] generateProgression(int length, Random random) {
        int[] progression = new int[length];
        int start = random.nextInt(START_NUMBER) + 1;
        int step = random.nextInt(STEP_NUMBER) + 1;
        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }
        return progression;
    }
}



