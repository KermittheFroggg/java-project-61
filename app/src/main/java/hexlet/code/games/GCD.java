package hexlet.code.games;

import java.util.Random;
public class GCD {
    public static String questionGenerator() {

        Random rand = new Random();
        int upperbound = 34;
        int number1 = rand.nextInt(upperbound);
        int number2 = rand.nextInt(upperbound);

        String question;
        question = String.valueOf(number1 + " " + number2);
        return question;
    }

    public static int findGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGcd(b, a % b);
    }

    public static String getCorrectAnswer(String question) {
        String[] strExpression = question.split(" ");
        int correctAnswer = findGcd(Integer.parseInt(strExpression[0]), Integer.parseInt(strExpression[1]));
        String strCorrectAnswer = String.valueOf(correctAnswer);
        return strCorrectAnswer;
    }
}
