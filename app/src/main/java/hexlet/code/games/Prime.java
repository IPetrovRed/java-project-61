package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void primeGame() {
        String description  = "\nAnswer 'yes' if given number is prime. Otherwise answer 'no'";
        Engine.greetForUser();
        String name = Engine.getName();
        Engine.helloUser(name);
        Engine.gameDescription(description);

//        Random random = new Random();

        int correctCount = 0;

        while (correctCount < Games.gamesLimit()) {
            int numberToCheck = Utils.generateRandomNumber();
            Engine.question("Question: " + numberToCheck);
            Engine.userAnswer();
            String userAnswer = getUserAnswer();
            boolean isPrime = isPrime(numberToCheck);

            if ((isPrime && userAnswer.equals("yes")) || (!isPrime && userAnswer.equals("no"))) {
                Engine.correctAnswer();
                correctCount++;
            } else {
                String correctAnswer = isPrime ? "yes" : "no";
                Engine.wrongAnswer(userAnswer, correctAnswer, name);
                break;
            }
        } if (correctCount == 3) {
            Engine.congrats(name);
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
    private static String getUserAnswer() {
        Engine.userAnswer();
        return Engine.scanner.next();
    }

}
