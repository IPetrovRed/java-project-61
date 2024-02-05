package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {
    public static void playCalc() {
        String gameQuestion = "\nWhat is the result of the expression?";
        Engine.greetForUser();
        Scanner scanner = new Scanner(System.in);
        String name = Engine.getName();
        Engine.helloUser(name);
        System.out.println(gameQuestion);

        int correctCount = 0;

        while (correctCount < Games.gamesLimit()) {
            int firstNumber = (int) (Math.random() * 100);
            int secondNumber = (int) (Math.random() * 100);
            int operator = (int) (Math.random() * 3);
            String operatorSymbol = "";
            int correctAnswer = 0;

            switch (operator) {
                case 0:
                    operatorSymbol = "+";
                    correctAnswer = firstNumber + secondNumber;
                    break;
                case 1:
                    operatorSymbol = "-";
                    correctAnswer = firstNumber - secondNumber;
                    break;
                case 2:
                    operatorSymbol = "*";
                    correctAnswer = firstNumber * secondNumber;
                    break;
                default:
                    break;
            }

            System.out.println("Question: " + firstNumber + " " + operatorSymbol + " " + secondNumber);
            Engine.userAnswer();
            int userAnswer = scanner.nextInt();

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
}
