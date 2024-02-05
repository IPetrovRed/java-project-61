package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Even {
    public static void playEven() {
        String gameQuestion = "\nAnswer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.greetForUser();
        Scanner scanner = new Scanner(System.in);
        String name = Engine.getName();
        Engine.helloUser(name);
        System.out.println(gameQuestion);

        int correctCount = 0;

        while (correctCount < Games.gamesLimit()) {
            int number = (int) (Math.random() * 100) + 1;
            Engine.question(number);
            String userAnswer = scanner.nextLine();

            boolean isEven = number % 2 == 0;
            boolean isCorrectAnswer = (isEven && userAnswer.equals("yes")) || (!isEven && userAnswer.equals("no"));
            String correctAnswer = (isEven ? "yes" : "no");

            if (isCorrectAnswer) {
                Engine.correctAnswer();
                correctCount++;
            } else {
                Engine.wrongAnswerForText(userAnswer, correctAnswer, name);
                break;
            }
        }
        if (correctCount == 3){
            Engine.congrats(name);
        }
    }
}
