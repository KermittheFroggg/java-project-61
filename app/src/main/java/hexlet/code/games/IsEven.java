package hexlet.code.games;

import java.util.Random;

public class IsEven {
    public static String questionGenerator() {

        Random rand = new Random();
        final int upperbound = 34;
        int number = rand.nextInt(upperbound) + 1;
        String question = String.valueOf(number);
        return question;
    }

    public static String getCorrectAnswer(String question) {
        int currentQuestion = Integer.parseInt(question);
        if (currentQuestion % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
