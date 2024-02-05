package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class GCD {
    public static void gcdGame() {
        String gameQuestion = "\nFind the greatest common divisor of given numbers.";
        Engine.greetForUser();
        Scanner scanner = new Scanner(System.in);
        String name = Engine.getName();
        Engine.helloUser(name);
        System.out.println(gameQuestion);

        int correctCount = 0;

        while (correctCount < Games.gamesLimit()) {
            int num1 = getRandomNumber();
            int num2 = getRandomNumber();

            System.out.println("Question: " + num1 + " " + num2);
            Engine.userAnswer();
            int userAnswer = scanner.nextInt();

            int correctAnswer = calculateGCD(num1, num2);

            if (userAnswer == correctAnswer) {
                Engine.correctAnswer();
                correctCount++;
            } else {
                Engine.wrongAnswerForNums(userAnswer, correctAnswer, name);
                break;
            }
        } if (correctCount == 3){
            Engine.congrats(name);
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
