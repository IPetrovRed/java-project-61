package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void progressionGame() {
        String gameQuestion = "What number is missing in the progression?";
        Engine.greetForUser();
        Scanner scanner = new Scanner(System.in);
        String name = Engine.getName();
        Engine.helloUser(name);
        System.out.println(gameQuestion);

        Random random = new Random();

        int correctCount = 0;

        while (correctCount < Games.gamesLimit()) {

            int progressionLength = random.nextInt(6) + 5; // Случайная длинна 5 или 10
            int[] progression = generateProgression(progressionLength, random);
            int hiddenIndex = random.nextInt(progressionLength);
            int correctAnswer = progression[hiddenIndex];
            progression[hiddenIndex] = -1; // -1 для скрытых значений

            System.out.println("Question: " + Arrays.toString(progression).replaceAll("-1", ".."));
            Engine.userAnswer();
            int userAnswer = new Scanner(System.in).nextInt();

            if (userAnswer == correctAnswer) {
                Engine.correctAnswer();
                correctCount++;
            } else {
                Engine.wrongAnswerForNums(userAnswer,correctAnswer,name);
                break;
            }
        } if (correctCount == 3){
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
