package org.knightmoves.learn;

public class ProceduralMortgageCalculator {

    public static String calculate(int principal, float annualInterest, byte years) {
        MortageValidator mortageValidator = new MortageValidator();
        StringBuffer output = new StringBuffer();
        MortgageCalculator calculator = new MortgageCalculator(principal, annualInterest, years);
        MortgageReport report = new MortgageReport(calculator, output);

        if(mortageValidator.isPrincipalInvalid(principal)){
            return "The principal must be a number between 1,000 and 1,000,000.";
        }

        if(mortageValidator.isAnnualInterestInvalid(annualInterest)){
            return "The annual interest rate must be a number between 1 and 30.";
        }

        if(mortageValidator.isYearsInvalid(years)){
            return "The years must be a number between 1 and 30.";
        }

        report.printMortgage();
        report.printPaymentSchedule();
        return output.toString();
    }

}
