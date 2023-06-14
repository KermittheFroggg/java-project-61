package hexlet.code.games;

import java.util.Random;

public class Prime {
    public static String questionGenerator() {

        Random rand = new Random();
        final int upperbound = 34;
        int number = rand.nextInt(upperbound) + 2;
        String question = String.valueOf(number);
        return question;
    }

    public static String getCorrectAnswer(String question) {
        int currentQuestion = Integer.parseInt(question);
        int count = 0;
        for (var i = 1; i < currentQuestion / 2; i++) {
            if (currentQuestion % i == 0) {
                count += 1;
                if (count > 1) {
                    return "no";
                }
            }
        }
        return "yes";
    }
}
