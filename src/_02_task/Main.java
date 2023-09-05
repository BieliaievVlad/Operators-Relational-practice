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
            case "Red": case "red" : case "RED" :
                System.out.print("STOP");
                break;
            case "Yellow" : case "yellow" : case "YELLOW" :
                System.out.print("%nSLOW DOWN");
                break;
            case "Green" : case "green" : case "GREEN" :
                System.out.print("PROCEED");
                break;
        }
    }
}
