package hexlet.code.games;

import java.util.Random;
public class Calculator {
    public static String questionGenerator() {

        Random rand = new Random();
        int upperbound = 34;
        int number1 = rand.nextInt(upperbound);
        int number2 = rand.nextInt(upperbound);

        String expression = "+-*";
        int expressionLength = expression.length();

        char currentExpression = 0;
        for (int i = 0; i < 1; i++) {
            currentExpression = expression.charAt(rand.nextInt(expressionLength));
        }

        String question;
        question = String.valueOf(number1 + " " + String.valueOf(currentExpression) + " " + number2);
        return question;
    }

    public static String getCorrectAnswer(String question) {
        String[] strExpression = question.split(" ");
        int correctAnswer = 0;
        switch (strExpression[1]) {
            case "+":
                correctAnswer = (Integer.parseInt(strExpression[0]) + Integer.parseInt(strExpression[2]));
                break;
            case "-":
                correctAnswer = (Integer.parseInt(strExpression[0]) - Integer.parseInt(strExpression[2]));
                break;
            case "*":
                correctAnswer = (Integer.parseInt(strExpression[0]) * Integer.parseInt(strExpression[2]));
                break;
            default:
                return null;
        }
        String strCorrectAnswer = String.valueOf(correctAnswer);
        return strCorrectAnswer;
    }
}
