package org.knightmoves.learn;

import java.text.NumberFormat;

public class MortgageReport {

    private MortgageCalculator calculator;
    private StringBuffer output;

    public MortgageReport(MortgageCalculator calculator, StringBuffer output) {
        this.calculator = calculator;
        this.output = output;
    }

    public void printPaymentSchedule() {
        output.append("\n");
        output.append("PAYMENT SCHEDULE\n");
        output.append("----------------\n");
        for (short month = 1; month <= calculator.getYears() * MortgageCalculator.MONTHS_IN_YEAR; month++) {
            double balance = calculator.calculateBalance(month);
            output.append(NumberFormat.getCurrencyInstance().format(balance) + "\n");
        }
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        output.append("\n");
        output.append("MORTGAGE\n");
        output.append("--------\n");
        output.append("Monthly Payments: " + mortgageFormatted + "\n");
    }
}
