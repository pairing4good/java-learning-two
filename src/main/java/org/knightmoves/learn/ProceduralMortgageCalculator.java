package org.knightmoves.learn;

public class ProceduralMortgageCalculator {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static String calculate(int principal, float annualInterest, byte years) {
        StringBuffer output = new StringBuffer();
        MortgageCalculator calculator = new MortgageCalculator(principal, annualInterest, years);
        MortgageReport report = new MortgageReport(calculator, output);
        report.printMortgage();
        report.printPaymentSchedule();
        return output.toString();
    }

}
