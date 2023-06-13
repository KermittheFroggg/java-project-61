package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String cli() {
        System.out.println("Welcome to the Brain Games!");
        Scanner name = new Scanner(System.in);
        System.out.printf("May I have your name?");
        String userName = name.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
