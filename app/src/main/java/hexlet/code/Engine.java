package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.IsEven;
import hexlet.code.games.Calculator;

public class Engine {
    public static void askQuestion(String question){
        System.out.println("Question: " + question);
    }
    public static String receiveUserAnswer(){
        Scanner answer = new Scanner(System.in);
        String userAnswer = answer.next();
        System.out.println("Your answer: " + userAnswer);
        return userAnswer;
    }
    public static void finalGongratulations(String userName) {
        System.out.println("Congratulations, " + userName+ "!");

    }
    public static void wrongAnswer(String userName, String userAnswer, String typeOfGame) {
        if (typeOfGame.equals("isEven")  && userAnswer.equals("yes")) {
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'");
            System.out.println("Let's try again, " + userName + "!");
        } else if (typeOfGame.equals("isEven")  && userAnswer.equals("no")) {
            System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'");
            System.out.println("Let's try again, " + userName + "!");
        }
    }
    public static void rightAnswer() {
        System.out.println("Correct!");
    }

    public static void runCycle(String userName, String gameQuestion1, String gameQuestion2, String gameQuestion3, String typeOfGame) {
       String[] gameQuestions = new String[]{gameQuestion1, gameQuestion2, gameQuestion3};
       int x = 0;
       for (var round=1; round<=3; round++) {
            Engine.askQuestion(gameQuestions[x]);
            String userAnswer = Engine.receiveUserAnswer();
            Boolean checkedAnswer = sendAnswerForChecking(userName, gameQuestions[x], userAnswer, round, typeOfGame);
            if (checkedAnswer && round != 3){
                rightAnswer();
            } else if (checkedAnswer && round == 3) {
                finalGongratulations(userName);
            } else if (!checkedAnswer) {
                wrongAnswer(userName, userAnswer, typeOfGame);
                return;
            } else if (checkedAnswer == null) {
                return;
            }
            x += 1;
        }
    }
    public static Boolean sendAnswerForChecking(String userName, String question, String userAnswer, int round, String typeOfGame) {
        if (typeOfGame == "isEven") {
            return IsEven.checkAnswer(userName, question, userAnswer, round);
        } else if (typeOfGame == "calculator") {
            return Calculator.checkAnswer(userName, question, userAnswer, round);
        }
        return null;
    }
}
