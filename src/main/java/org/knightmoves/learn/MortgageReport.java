package org.knightmoves.learn;

import java.text.NumberFormat;

public class MortgageReport {

    private static MortgageCalculator mortgageCalculator;

    public static void printMortgage(int principal, float annualInterest, byte years, StringBuffer output) {
        mortgageCalculator = new MortgageCalculator(principal, annualInterest, years);
        double mortgage = mortgageCalculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        output.append("\n");
        output.append("MORTGAGE\n");
        output.append("--------\n");
        output.append("Monthly Payments: " + mortgageFormatted + "\n");
    }

    public static void printPaymentSchedule(int principal, float annualInterest, byte years, StringBuffer output) {
        output.append("\n");
        output.append("PAYMENT SCHEDULE\n");
        output.append("----------------\n");
        for (short month = 1; month <= years * ProceduralMortgageCalculator.MONTHS_IN_YEAR; month++) {
            double balance = MortgageCalculator.calculateBalance(month);
            output.append(NumberFormat.getCurrencyInstance().format(balance) + "\n");
        }
    }
}
