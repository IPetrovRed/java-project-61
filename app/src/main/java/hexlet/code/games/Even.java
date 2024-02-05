package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Even {
    public static void playEven() {
        Engine.greet4Games();
        String name = Engine.getName();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);

        int correctCount = 0;
        while (correctCount < Games.gamesLimit()) {
            int number = (int) (Math.random() * 100) + 1;
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            boolean isEven = number % 2 == 0;
            boolean isCorrectAnswer = (isEven && answer.equals("yes")) || (!isEven && answer.equals("no"));

            if (isCorrectAnswer) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(."
                        + "Correct answer was '" + (isEven ? "yes" : "no") + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        } if (correctCount == 3){
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
