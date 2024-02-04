package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

import hexlet.code.Cli;

public class Games {
    public static int gamesLimit(){
        // ограничиваем кол-во раундов
        return 3;
    }
    public static void playEven() {
        Cli.greet4Games();
        String name = Cli.getName();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);

        int correctCount = 0;
        while (correctCount < gamesLimit()) {
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
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + (isEven ? "yes" : "no") + "'.");
                System.out.println("Let's try again, " + name + "!");
                correctCount = 0;
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

        while (correctCount < gamesLimit()) {
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

    public static void GCD (){
        Cli.greet4Games();
        String name = Cli.getName();
        System.out.println("Hello, " + name + "!");
        System.out.println("Find the greatest common divisor of given numbers.");
        Scanner scanner = new Scanner(System.in);

        int correctCount = 0;

        while (correctCount < gamesLimit()) {
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
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                correctCount = 0;
            }
        }

        System.out.println("Congratulations, " + name + "!");
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
    public static void progressionGame(){
        Cli.greet4Games();
        String name = Cli.getName();
        System.out.println("Hello, " + name + "!");
        System.out.println("What number is missing in the progression?");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int correctCount = 0;

        while (correctCount < gamesLimit()) {

            int progressionLength = random.nextInt(6) + 5; // Random length between 5 and 10
            int[] progression = generateProgression(progressionLength, random);
            int hiddenIndex = random.nextInt(progressionLength);
            int correctAnswer = progression[hiddenIndex];
            progression[hiddenIndex] = -1; // Using -1 to represent hidden value

            System.out.println("Question: " + Arrays.toString(progression).replaceAll("-1", ".."));
            System.out.print("Your answer: ");
            int userAnswer = new Scanner(System.in).nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'. Let's try again!");
                correctCount = 0;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

    public static int[] generateProgression(int length, Random random) {
        int[] progression = new int[length];
        int start = random.nextInt(20) + 1;
        int step = random.nextInt(5) + 1;

        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }

        return progression;
    }
}




