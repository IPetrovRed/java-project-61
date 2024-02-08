package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void playEven() {
        String description = "\nAnswer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.greetForUser();
        String name = Engine.getName();
        Engine.helloUser(name);
        Engine.gameDescription(description);

        int correctCount = 0;

        while (correctCount < Engine.gameLimit()) {
            int number = Utils.generateRandomNumber();
            Engine.question("Question: "
                    + number);
            String userAnswer = getUserAnswer();

            boolean isEven = number % 2 == 0;
            boolean isCorrectAnswer = (isEven && userAnswer.equals("yes")) || (!isEven && userAnswer.equals("no"));
            String correctAnswer = (isEven ? "yes" : "no");

            if (isCorrectAnswer) {
                Engine.correctAnswer();
                correctCount++;
            } else {
                Engine.wrongAnswer(userAnswer, correctAnswer, name);
                break;
            }
        }
        if (correctCount == Engine.gameLimit()) {
            Engine.congrats(name);
        }
    }
    private static String getUserAnswer() {
        Engine.userAnswer();
        return Engine.scanner.next();
    }

}
