package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void progressionGame() {
        String description = "\nWhat number is missing in the progression?";
        Engine.greetForUser();
        String name = Engine.getName();
        Engine.helloUser(name);
        Engine.gameDescription(description);

        Random random = new Random();

        int correctCount = 0;

        while (correctCount < Engine.gameLimit()) {

            int progressionLength = random.nextInt(6) + 5;
            int[] progression = generateProgression(progressionLength, random);
            int hiddenIndex = random.nextInt(progressionLength);
            int correctAnswer = progression[hiddenIndex];
            progression[hiddenIndex] = -1;

            String formattedProgression = Arrays.toString(progression)
                    .replaceAll("-1", "..")
                    .replaceAll(", ", " ");
            Engine.question("Question: " + formattedProgression);
            Engine.userAnswer();
            int userAnswer = new Scanner(System.in).nextInt();

            if (userAnswer == correctAnswer) {
                Engine.correctAnswer();
                correctCount++;
            } else {
                Engine.wrongAnswerNumbers(userAnswer, correctAnswer, name);
                break;
            }
        } if (correctCount == Engine.gameLimit()) {
            Engine.congrats(name);
        }
    }

    public static int[] generateProgression(int length, Random random) {
        int[] progression = new int[length];
        int start = random.nextInt(20) + 1;
        int step = random.nextInt(5) + 1;

        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }

        return progression;
    }
}
