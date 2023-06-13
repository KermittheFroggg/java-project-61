package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;
public class Calculator {
    public static void calculator(String userName) {
        System.out.println("What is the result of the expression?");
        String question1 = questionGenerator();
        String question2 = questionGenerator();
        String question3 = questionGenerator();
        Engine.runCycle(userName, question1, question2, question3, "calculator");
    }
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

    public static Boolean checkAnswer(String userName, String question, String userAnswer, int round) {
        String[] strExpression = question.split(" ");
        int intUserAnswer = Integer.parseInt(userAnswer);
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
        if (intUserAnswer == correctAnswer) {
            return true;
        } else if (intUserAnswer != correctAnswer){
            wrongAnswerCalculater(userName, userAnswer, strCorrectAnswer);
        }
        return false;
    }
    public static void wrongAnswerCalculater(String userName, String userAnswer, String correctAnswer) {
        System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + correctAnswer + ".");
        System.out.println("Let's try again, " + userName + "!");
        return;
    }
}

