package _01_task;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner scan;
    static double[] bonusRate = new double[]{10, 15, 20};
    static double[] salesAmount = new double[]{10000, 20000};
    static double sales;
    static double payment;
    final static String CURRENCY = "UAH";

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

        System.out.print("Enter sales amount: ");
        sales = scan.nextDouble();

        if (sales > 0 & sales <= salesAmount[0]) {
            payment = sales * bonusRate[0] / 100;
            System.out.printf("%nPayment amount is, %S: %.2f.", CURRENCY, payment);
        } else if (sales > salesAmount[0] & sales <= salesAmount[1]) {
            payment = (salesAmount[0] * bonusRate[0] / 100) + ((sales - salesAmount[0]) * bonusRate[1] / 100);
            System.out.printf("%nPayment amount is, %S: %.2f.", CURRENCY, payment);
        } else {
            payment = (salesAmount[0] * bonusRate[0] / 100) + ((salesAmount[1] - salesAmount[0]) * bonusRate[1] / 100) +
                    ((sales - salesAmount[1]) * bonusRate[2] / 100);
            System.out.printf("%nPayment amount is, %S: %.2f.", CURRENCY, payment);
        }


    }

}


