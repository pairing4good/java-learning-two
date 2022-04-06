package org.knightmoves.learn;

import java.text.NumberFormat;

public class ProceduralMortgageCalculator {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static String calculate(int principal, float annualInterest, byte years) {
        StringBuffer output = new StringBuffer();
        printMortgage(principal, annualInterest, years, output);
        printPaymentSchedule(principal, annualInterest, years, output);
        return output.toString();
    }

    private static void printMortgage(int principal, float annualInterest, byte years, StringBuffer output) {
        double mortgage = calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        output.append("\n");
        output.append("MORTGAGE\n");
        output.append("--------\n");
        output.append("Monthly Payments: " + mortgageFormatted + "\n");
    }

    private static void printPaymentSchedule(int principal, float annualInterest, byte years, StringBuffer output) {
        output.append("\n");
        output.append("PAYMENT SCHEDULE\n");
        output.append("----------------\n");
        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double balance = calculateBalance(principal, annualInterest, years, month);
            output.append(NumberFormat.getCurrencyInstance().format(balance) + "\n");
        }
    }

    public static double calculateBalance(
            int principal,
            float annualInterest,
            byte years,
            short numberOfPaymentsMade
    ) {
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        float numberOfPayments = years * MONTHS_IN_YEAR;

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }

    public static double calculateMortgage(
            int principal,
            float annualInterest,
            byte years) {

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        float numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }
}
