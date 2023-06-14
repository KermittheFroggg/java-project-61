package hexlet.code.games;

import java.util.Random;

public class IsEven {
    public static String questionGenerator() {

        Random rand = new Random();
        int upperbound = 34;
        int int_random = rand.nextInt(upperbound);
        String question = String.valueOf(int_random);
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