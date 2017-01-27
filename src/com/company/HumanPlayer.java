package com.company;

import java.util.Scanner;

public class HumanPlayer {

    private Scanner scanner = new Scanner(System.in);

    public char chooseLetter() {

        String letter = "";
        do {
            GamePrinter.printInstructions();
            letter = scanner.next();

            return letter.charAt(0);
        } while (letter.length()!=1);
    }
}
