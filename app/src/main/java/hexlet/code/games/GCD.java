package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void gcdGame() {
        String description = "\nFind the greatest common divisor of given numbers.";
        Engine.greetForUser();
        String name = Engine.getName();
        Engine.helloUser(name);
        Engine.gameDescription(description);

        int correctCount = 0;

        while (correctCount < Engine.gameLimit()) {
            int num1 = Utils.generateRandomNumber();
            int num2 = Utils.generateRandomNumber();

            Engine.question("Question: " + num1 + " " + num2);
            Engine.userAnswer();
            int userAnswer = getUserAnswer();

            int correctAnswer = calculateGCD(num1, num2);

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

    public static int calculateGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
    private static int getUserAnswer() {
        Engine.userAnswer();
        return Engine.scanner.nextInt();
    }
}
