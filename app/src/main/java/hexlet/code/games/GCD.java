package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class GCD {
    public static void gcdGame() {
        Engine.greet4Games();
        String name = Engine.getName();
        System.out.println("Hello, " + name + "!");
        System.out.println("Find the greatest common divisor of given numbers.");
        Scanner scanner = new Scanner(System.in);

        int correctCount = 0;

        while (correctCount < Games.gamesLimit()) {
            int num1 = getRandomNumber();
            int num2 = getRandomNumber();

            System.out.println("Question: " + num1 + " " + num2);
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            int correctAnswer = calculateGCD(num1, num2);

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(."
                        + "Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        } if (correctCount == 3){
            System.out.println("Congratulations, " + name + "!");
        }
    }

    public static int getRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }
    public static int calculateGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
