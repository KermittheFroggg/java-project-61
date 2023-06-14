package hexlet.code.games;

import java.util.Random;
import java.util.Arrays;

public class Progression {
    public static String questionGenerator() {

        Random rand = new Random();
        final int upperbound = 9;
        final int[] intProgression = new int[10];
        intProgression[0] = rand.nextInt(upperbound);
        int increaseOfProgression = rand.nextInt(upperbound) + 1;

        for (var i = 1; i <= intProgression.length - 1; i++) {
            intProgression[i] = intProgression[i - 1] + increaseOfProgression;
        }

        String strProgression = Arrays.toString(intProgression);
        String formattedStrProgression  = strProgression.toString()
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .trim();
        String[] strArrayProgression = formattedStrProgression.split(" ");

        int randomNumberInProgression = rand.nextInt(upperbound);
        strArrayProgression[randomNumberInProgression] = "..";

        String question;
        question = String.join(" ", strArrayProgression);
        return question;
    }

    public static String getCorrectAnswer(String question) {
        String[] strArrayProgression = question.split(" ");
        int intCorrectAnswer = 0;
        for (var i = 0; i <= strArrayProgression.length - 1; i++) {
            if (strArrayProgression[i].equals("..")) {
                if (i <= 1) {
                    int nextNumber = Integer.parseInt(strArrayProgression[i + 1]);
                    intCorrectAnswer = nextNumber - (Integer.parseInt(strArrayProgression[i + 2]) - nextNumber);
                } else {
                    int previousNumber = Integer.parseInt(strArrayProgression[i - 1]);
                    intCorrectAnswer = previousNumber + (previousNumber - Integer.parseInt(strArrayProgression[i - 2]));
                }
            }
        }
        String strCorrectAnswer;
        strCorrectAnswer = Integer.toString(intCorrectAnswer);
        return strCorrectAnswer;
    }
}
