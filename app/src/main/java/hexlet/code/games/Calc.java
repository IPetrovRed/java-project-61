package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {
    public static void playCalc() {
        Engine.greet4Games();
        String name = Engine.getName();
        System.out.println("Hello, " + name + "!");
        System.out.println("What is the result of the expression?");
        Scanner scanner = new Scanner(System.in);

        int correctCount = 0;

        while (correctCount < Games.gamesLimit()) {
            int firstNumber = (int) (Math.random() * 100);
            int secondNumber = (int) (Math.random() * 100);
            int operator = (int) (Math.random() * 3);
            String operatorSymbol = "";
            int result = 0;

            switch (operator) {
                case 0:
                    operatorSymbol = "+";
                    result = firstNumber + secondNumber;
                    break;
                case 1:
                    operatorSymbol = "-";
                    result = firstNumber - secondNumber;
                    break;
                case 2:
                    operatorSymbol = "*";
                    result = firstNumber * secondNumber;
                    break;
                default:
                    break;
            }

            System.out.println("Question: " + firstNumber + " " + operatorSymbol + " " + secondNumber);
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();

            if (answer == result) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(."
                        + "Correct answer was '" + result + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        } if (correctCount == 3){
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
