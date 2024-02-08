package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void playCalc() {
        String description = "\nWhat is the result of the expression?";
        Engine.greetForUser();
        String name = Engine.getName();
        Engine.helloUser(name);
        Engine.gameDescription(description);

        int correctCount = 0;

        while (correctCount < Engine.gameLimit()) {
            int firstNumber = Utils.generateRandomNumber();
            int secondNumber = Utils.generateRandomNumber();
            int operator = Utils.generateRandomOperator();
            String operatorSymbol = "";

            switch (operator) {
                case 0:
                    operatorSymbol = "+";
                    break;
                case 1:
                    operatorSymbol = "-";
                    break;
                case 2:
                    operatorSymbol = "*";
                    break;
                default:
                    break;
            }

            Engine.question("Question: "
                + firstNumber
                + " "
                + operatorSymbol
                + " "
                + secondNumber
                + "\n");
            int userAnswer = getUserAnswer();

            int correctAnswer = calculateAnswer(firstNumber, secondNumber, operator);

            if (userAnswer == correctAnswer) {
                Engine.correctAnswer();
                correctCount++;
            } else {
                Engine.wrongAnswer(String.valueOf(userAnswer), String.valueOf(correctAnswer), name);
                break;
            }
        }

        if (correctCount == Engine.gameLimit()) {
            Engine.congrats(name);
        }
    }

    private static int calculateAnswer(int firstNumber, int secondNumber, int operator) {
        int result = 0;

        switch (operator) {
            case 0:
                result = firstNumber + secondNumber;
                break;
            case 1:
                result = firstNumber - secondNumber;
                break;
            case 2:
                result = firstNumber * secondNumber;
                break;
            default:
                break;
        }
        return result;
    }

    private static int getUserAnswer() {
        Engine.userAnswer();
        return Engine.scanner.nextInt();
    }
}

