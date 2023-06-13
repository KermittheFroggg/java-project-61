package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.IsEven;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner gameChoice = new Scanner(System.in);
        System.out.printf("Please enter the game number and press Enter\n1 - Greet\n2 - Even\n3 - Calculator\n0 - Exit\nYour choice:");
        int choice = Integer.parseInt(gameChoice.next());
        System.out.println();

        switch (choice) {
            case 1:
                Cli.cli();
                break;
            case 2:
                String userName = Cli.cli();
                IsEven.isEven(userName);
                break;
            case 3:
                String userName2 = Cli.cli();
                Calculator.calculator(userName2);
                break;
            default:
                return;
            }
        }
    }
