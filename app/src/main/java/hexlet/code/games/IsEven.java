package hexlet.code.games;

import com.sun.jdi.IntegerValue;
import hexlet.code.Engine;

import java.util.Random;

public class IsEven {
    public static void isEven(String userName) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        String question1 = questionGenerator();
        String question2 = questionGenerator();
        String question3 = questionGenerator();
        Engine.runCycle(userName, question1, question2, question3, "isEven");
    }
    public static String questionGenerator() {

        Random rand = new Random();
        int upperbound = 34;
        int int_random = rand.nextInt(upperbound);
        String question = String.valueOf(int_random);
        return question;
    }

    public static Boolean checkAnswer(String userName, String question, String userAnswer, int round) {
        int currentQuestion = Integer.parseInt(question);
        switch (userAnswer) {
            case "yes":
                if (currentQuestion % 2 == 0) {
                    return true;
                } else if (currentQuestion % 2 != 0) {
                    return false;
                }
                break;
            case "no":
                if (currentQuestion % 2 != 0) {
                    return true;
                } else if (currentQuestion % 2 == 0) {
                    return false;
                }
                break;
            default:
                return null;
        }
        return null;
    }
}