package game;

import java.util.Scanner;

public class GameRunner {

    public int takeAGuess() {
        Scanner scanner = new Scanner(System.in);

        while(!scanner.hasNextInt()) {
            scanner.next();
        }

        return scanner.nextInt();
    }
}
