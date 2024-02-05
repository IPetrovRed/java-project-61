package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void primeGame() {
        Engine.greet4Games();
        String name = Engine.getName();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int correctCount = 0;

        while (correctCount < Games.gamesLimit()) {
            int numberToCheck = (int) (Math.random() * 100) + 1;
            System.out.println("Question: " + numberToCheck);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next().toLowerCase();
            boolean isPrime = isPrime(numberToCheck);

            if ((isPrime && userAnswer.equals("yes")) || (!isPrime && userAnswer.equals("no"))) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                String correctAnswer = isPrime ? "yes" : "no";
                System.out.println("'" + userAnswer + "' is wrong answer ;(." +
                        "Correct answer was '" + correctAnswer + "'. Let's try again!");
                break;
            }
        } if (correctCount == 3){
            System.out.println("Congratulations, " + name + "!");
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
}
