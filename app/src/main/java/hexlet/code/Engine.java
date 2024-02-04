package hexlet.code;

import hexlet.code.games.Games;

import java.util.Scanner;

public class Engine {
//    public static void playEven() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Welcome to the Brain Games!");
//        System.out.print("May I have your name? ");
//        String name = scanner.nextLine();
//
//        System.out.println("Hello, " + name + "!");
//        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
//
//        int correctAnswersCount = 0;
//        int consecutiveCorrectAnswersCount = 0;
//        while (consecutiveCorrectAnswersCount < 3) {
//            int number = (int) (Math.random() * 100) + 1;
//            System.out.println("Question: " + number);
//            System.out.print("Your answer: ");
//            String answer = scanner.nextLine();
//
//            // Checking if the answer is correct
//            boolean isEven = number % 2 == 0;
//            boolean isCorrectAnswer = (isEven && answer.equals("yes")) || (!isEven && answer.equals("no"));
//
//            if (isCorrectAnswer) {
//                System.out.println("Correct!");
//                consecutiveCorrectAnswersCount++;
//            } else {
//                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + (isEven ? "yes" : "no") + "'.");
//                System.out.println("Let's try again, " + name + "!");
//                consecutiveCorrectAnswersCount = 0;
//            }
//        }
//
//        System.out.println("Congratulations, " + name + "!");
//    }
    public static void gameChoicer(){
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Cli.greet();
                break;
            case 2:
                Games.playEven();
                break;
            case 3:

            case 0:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }



}