package org.knightmoves.learn;

public class ProceduralMortgageCalculator {

    public static String calculate(int principal, float annualInterest, byte years) {
        if(principal < 1000 || principal > 1_000_000){
            return "The principal must be a number between 1,000 and 1,000,000.";
        }

        if(annualInterest < 1 || annualInterest > 30){
            return "The annual interest rate must be a number between 1 and 30.";
        }

        if(years < 1 || years > 30){
            return "The years must be a number between 1 and 30.";
        }

        StringBuffer output = new StringBuffer();
        MortgageCalculator calculator = new MortgageCalculator(principal, annualInterest, years);
        MortgageReport report = new MortgageReport(calculator, output);
        report.printMortgage();
        report.printPaymentSchedule();
        return output.toString();
    }

}
