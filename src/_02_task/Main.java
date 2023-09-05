package _02_task;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    static String colour;
    static Scanner scan;

    public static void main(String[] args) {

        scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);
        System.out.print("What colour do you see now? ");
        colour = scan.nextLine();
        scan.close();

        switch (colour.trim()) {
            case "Red", "red", "RED" -> System.out.print("STOP");
            case "Yellow", "yellow", "YELLOW" -> System.out.print("SLOW DOWN");
            case "Green", "green", "GREEN" -> System.out.print("PROCEED");
        }
    }
}
