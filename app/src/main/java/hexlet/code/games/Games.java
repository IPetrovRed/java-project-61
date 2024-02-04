package hexlet.code.games;

import java.util.Scanner;

import hexlet.code.Cli;

public class Games {
    public static void playEven() {
        Cli.greet4Games();
        String name = Cli.getName();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);

        int correctAnswersCount = 0;
        int consecutiveCorrectAnswersCount = 0;
        while (consecutiveCorrectAnswersCount < 3) {
            int number = (int) (Math.random() * 100) + 1;
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            // Checking if the answer is correct
            boolean isEven = number % 2 == 0;
            boolean isCorrectAnswer = (isEven && answer.equals("yes")) || (!isEven && answer.equals("no"));

            if (isCorrectAnswer) {
                System.out.println("Correct!");
                consecutiveCorrectAnswersCount++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + (isEven ? "yes" : "no") + "'.");
                System.out.println("Let's try again, " + name + "!");
                consecutiveCorrectAnswersCount = 0;
            }
        }

        System.out.println("Congratulations, " + name + "!");
    }
    public static void playCalc(){
        Cli.greet4Games();
        String name = Cli.getName();
        System.out.println("Hello, " + name + "!");
        System.out.println("What is the result of the expression?");
        Scanner scanner = new Scanner(System.in);

        int correctCount = 0;

        while (correctCount < 3) {
            int firstNumber = (int) (Math.random() * 10);
            int secondNumber = (int) (Math.random() * 10);
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
            }

            System.out.println("Question: " + firstNumber + " " + operatorSymbol + " " + secondNumber);
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();

            if (answer == result) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
                System.out.println("Let's try again, " + name + "!");
                correctCount = 0;
            }
        }
        System.out.println("Congratulations, " + name + "!");

    }


}
