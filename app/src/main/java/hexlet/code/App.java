package hexlet.code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner gameChoice = new Scanner(System.in);
        System.out.printf("Please enter the game number and press Enter\n1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - "
                + "Progression\n6 - Prime\n0 - Exit\nYour choice:");
        int choice = Integer.parseInt(gameChoice.next());
        System.out.println();
        Map<String, String> typeOfGame = new HashMap<>();
        typeOfGame.put("1", "Greet");
        typeOfGame.put("2", "isEven");
        typeOfGame.put("3", "calculator");
        typeOfGame.put("4", "gcd");
        typeOfGame.put("5", "progression");
        typeOfGame.put("6", "prime");
        typeOfGame.put("0", "Exit");

        Engine.runGames(typeOfGame.get(Integer.toString(choice)));
    }
}
