package org.knightmoves.learn;

public class ProceduralMortgageCalculator {

    public static String calculate(int principal, float annualInterest, byte years) {
        StringBuffer output = new StringBuffer();
        MortgageCalculator calculator = new MortgageCalculator(principal, annualInterest, years);
        MortgageReport report = new MortgageReport(calculator, output);
        report.printMortgage();
        report.printPaymentSchedule();
        return output.toString();
    }

}
