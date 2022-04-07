package org.knightmoves.learn;

public class ProceduralMortgageCalculator {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static String calculate(int principal, float annualInterest, byte years) {
        StringBuffer output = new StringBuffer();
        MortgageReport.printMortgage(principal, annualInterest, years, output);
        MortgageReport.printPaymentSchedule(principal, annualInterest, years, output);
        return output.toString();
    }

}
