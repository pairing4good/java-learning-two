package org.knightmoves.learn;

import java.text.NumberFormat;

public class MortgageReport {

    private MortgageCalculator calculator;
    private StringBuffer output;
    private NumberFormat numberFormat;

    public MortgageReport(MortgageCalculator calculator, StringBuffer output) {
        this.calculator = calculator;
        this.output = output;
        numberFormat = NumberFormat.getCurrencyInstance();
    }

    public void printPaymentSchedule() {
        output.append("\n");
        output.append("PAYMENT SCHEDULE\n");
        output.append("----------------\n");
        for (double value : calculator.calculateBalances()) {
            output.append(numberFormat.format(value) + "\n");
        }
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = numberFormat.format(mortgage);
        output.append("\n");
        output.append("MORTGAGE\n");
        output.append("--------\n");
        output.append("Monthly Payments: " + mortgageFormatted + "\n");
    }
}
