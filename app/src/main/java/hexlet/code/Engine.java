package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.GCD;
import hexlet.code.games.IsEven;
import hexlet.code.games.Calculator;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class Engine {
    public static String askQuestion(String question) {
        System.out.println("Question: " + question);
        return question;
    }

    public static String receiveUserAnswer() {
        Scanner answer = new Scanner(System.in);
        String userAnswer = answer.next();
        System.out.println("Your answer: " + userAnswer);
        return userAnswer;
    }

    public static void runGames(String userName, String typeOfGame) {
        for (var round = 1; round <= 3; round++) {
            switch (typeOfGame) {
                case "isEven":
                    String question = askQuestion(IsEven.questionGenerator());
                    String userAnswer = receiveUserAnswer();
                    String correctAnswer = IsEven.getCorrectAnswer(question);
                    if (userAnswer.equals(correctAnswer) && round != 3) {
                        printRightAnswerMessage();
                    } else if (userAnswer.equals(correctAnswer) && round == 3) {
                        printFinalGongratulationsMessage(userName);
                    } else if (!userAnswer.equals(correctAnswer)) {
                        printWrongAnswerMessage(userName, userAnswer, correctAnswer, typeOfGame);
                    }
                    break;
                case "calculator":
                    String question2 = askQuestion(Calculator.questionGenerator());
                    String userAnswer2 = receiveUserAnswer();
                    String correctAnswer2 = Calculator.getCorrectAnswer(question2);
                    if (userAnswer2.equals(correctAnswer2) && round != 3) {
                        printRightAnswerMessage();
                    } else if (userAnswer2.equals(correctAnswer2) && round == 3) {
                        printFinalGongratulationsMessage(userName);
                    } else if (!userAnswer2.equals(correctAnswer2)) {
                        printWrongAnswerMessage(userName, userAnswer2, correctAnswer2, typeOfGame);
                    }
                    break;
                case "gcd":
                    String question3 = askQuestion(GCD.questionGenerator());
                    String userAnswer3 = receiveUserAnswer();
                    String correctAnswer3 = GCD.getCorrectAnswer(question3);
                    if (userAnswer3.equals(correctAnswer3) && round != 3) {
                        printRightAnswerMessage();
                    } else if (userAnswer3.equals(correctAnswer3) && round == 3) {
                        printFinalGongratulationsMessage(userName);
                    } else if (!userAnswer3.equals(correctAnswer3)) {
                        printWrongAnswerMessage(userName, userAnswer3, correctAnswer3, typeOfGame);
                        return;
                    }
                    break;
                case "progression":
                    String question4 = askQuestion(Progression.questionGenerator());
                    String userAnswer4 = receiveUserAnswer();
                    String correctAnswer4 = Progression.getCorrectAnswer(question4);
                    if (userAnswer4.equals(correctAnswer4) && round != 3) {
                        printRightAnswerMessage();
                    } else if (userAnswer4.equals(correctAnswer4) && round == 3) {
                        printFinalGongratulationsMessage(userName);
                    } else if (!userAnswer4.equals(correctAnswer4)) {
                        printWrongAnswerMessage(userName, userAnswer4, correctAnswer4, typeOfGame);
                        return;
                    }
                    break;
                case "prime":
                    String question5 = askQuestion(Prime.questionGenerator());
                    String userAnswer5 = receiveUserAnswer();
                    String correctAnswer5 = Prime.getCorrectAnswer(question5);
                    if (userAnswer5.equals(correctAnswer5) && round != 3) {
                        printRightAnswerMessage();
                    } else if (userAnswer5.equals(correctAnswer5) && round == 3) {
                        printFinalGongratulationsMessage(userName);
                    } else if (!userAnswer5.equals(correctAnswer5)) {
                        printWrongAnswerMessage(userName, userAnswer5, correctAnswer5, typeOfGame);
                        return;
                    }
                    break;
            }
        }
    }

    public static void printWrongAnswerMessage(String userName, String userAnswer, String correctAnswer, String typeOfGame) {
        switch (typeOfGame) {
            case "isEven", "prime":
                if (typeOfGame.equals("isEven") && userAnswer.equals("yes")) {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'");
                    System.out.println("Let's try again, " + userName + "!");
                } else if (typeOfGame.equals("isEven") && userAnswer.equals("no")) {
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'");
                    System.out.println("Let's try again, " + userName + "!");
                }
                System.exit(0);
            case "calculator", "gcd", "progression":
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + correctAnswer + ".");
                System.out.println("Let's try again, " + userName + "!");
                System.exit(0);
            default:
                System.exit(0);
        }
        System.exit(0);
    }

    public static void printRightAnswerMessage() {
        System.out.println("Correct!");
    }

    public static void printFinalGongratulationsMessage(String userName) {
        System.out.println("Congratulations, " + userName + "!");
    }
}
