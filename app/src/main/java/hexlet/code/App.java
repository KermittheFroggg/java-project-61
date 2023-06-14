package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner gameChoice = new Scanner(System.in);
        System.out.printf("Please enter the game number and press Enter\n1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - "
                + "Progression\n6 - Prime\n0 - Exit\nYour choice:");
        int choice = Integer.parseInt(gameChoice.next());
        System.out.println();

        if (choice == 1) {
            Cli.cli();
        } else if (choice == 2) {
            String userName = Cli.cli();
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            Engine.runGames(userName, "isEven");
        } else if (choice == 3) {
            String userName2 = Cli.cli();
            System.out.println("What is the result of the expression?");
            Engine.runGames(userName2, "calculator");
        } else if (choice == 4) {
            String userName3 = Cli.cli();
            System.out.println("Find the greatest common divisor of given numbers.");
            Engine.runGames(userName3, "gcd");
        } else if (choice == 5) {
            String userName4 = Cli.cli();
            System.out.println("What number is missing in the progression?");
            Engine.runGames(userName4, "progression");
        } else if (choice == 6) {
            String userName5 = Cli.cli();
            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            Engine.runGames(userName5, "prime");
        }
    }
}
