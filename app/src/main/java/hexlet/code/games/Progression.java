package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void progressionGame() {
        Engine.greet4Games();
        String name = Engine.getName();
        System.out.println("Hello, " + name + "!");
        System.out.println("What number is missing in the progression?");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int correctCount = 0;

        while (correctCount < Games.gamesLimit()) {

            int progressionLength = random.nextInt(6) + 5; // Random length between 5 and 10
            int[] progression = generateProgression(progressionLength, random);
            int hiddenIndex = random.nextInt(progressionLength);
            int correctAnswer = progression[hiddenIndex];
            progression[hiddenIndex] = -1; // Using -1 to represent hidden value

            System.out.println("Question: " + Arrays.toString(progression).replaceAll("-1", ".."));
            System.out.print("Your answer: ");
            int userAnswer = new Scanner(System.in).nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(."
                        + "Correct answer was '" + correctAnswer + "'. Let's try again!");
                break;
            }
        } if (correctCount == 3){
            System.out.println("Congratulations, " + name + "!");
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
