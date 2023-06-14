package hexlet.code.games;

import java.util.Random;
public class Calculator {
    public static String questionGenerator() {

        Random rand = new Random();
        int upperbound = 34;
        int int_random1 = rand.nextInt(upperbound);
        int int_random2 = rand.nextInt(upperbound);

        String expression = "+-*";
        int N = expression.length();

        char currentExpression = 0;
        for (int i = 0; i < 1; i++) {
            currentExpression = expression.charAt(rand.nextInt(N));
        }

        String question;
        question = String.valueOf(int_random1 + " " + String.valueOf(currentExpression) + " " + int_random2);
        return question;
    }

    public static String getCorrectAnswer(String question) {
        String[] strExpression = question.split(" ");
        int correctAnswer = 0;
        switch (strExpression[1]){
            case "+":
                correctAnswer = (Integer.parseInt(strExpression[0]) + Integer.parseInt(strExpression[2]));
                break;
            case "-":
                correctAnswer = (Integer.parseInt(strExpression[0]) - Integer.parseInt(strExpression[2]));
                break;
            case "*":
                correctAnswer = (Integer.parseInt(strExpression[0]) * Integer.parseInt(strExpression[2]));
                break;
        }
        String strCorrectAnswer = String.valueOf(correctAnswer);
        return strCorrectAnswer;
    }
}

