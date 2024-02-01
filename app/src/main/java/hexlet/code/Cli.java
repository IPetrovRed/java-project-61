package hexlet.code;

import java.util.Scanner;

class Cli {

public static void brainGames() {

    System.out.println("Please enter the game number and press Enter\n1 - Greet\n2 - Even\n3 - Calc\n0 -Exit");
    Scanner scanner = new Scanner (System.in);
    String name = "";
    int gameNumber = scanner.nextInt();
    System.out.println("Your choice is " + gameNumber +"\n");


    if (gameNumber >= 1 && gameNumber <= 3) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        name = scanner.next(); // Assign a value here
        System.out.println("Hello, " + name + "\n");
    }

    if (gameNumber == 2) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");
        playGame(scanner);
        System.out.println("Congratulations, " + name);
    }
    if (gameNumber == 3) {
        System.out.println("What is the result of the expression?");
        playCalculatorGame(scanner, name);
        System.out.println("Congratulations, " + name +"!");
    }

    scanner.close();
}

    public static void playGame(Scanner scanner) {
        int correctCount = 0;

        while (correctCount < 3) {
            int number = (int) (Math.random() * 10);
            System.out.println("Number: " + number);
            String answer = scanner.next();

            if ((number % 2 == 0 && answer.equals("yes")) || (number % 2 != 0 && answer.equals("no"))) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                System.out.println("Wrong!");
                correctCount = 0;
            }
        }
    }
    public static void playCalculatorGame(Scanner scanner, String name) {
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
    }

}
