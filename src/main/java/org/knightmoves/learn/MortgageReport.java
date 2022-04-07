package org.knightmoves.learn;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

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
        for (double value : calculator.calculateBalances()) {
            output.append(NumberFormat.getCurrencyInstance().format(value) + "\n");
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
