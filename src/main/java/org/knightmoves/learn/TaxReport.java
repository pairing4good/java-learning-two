package org.knightmoves.learn;

public class TaxReport {

    private TaxCalculator calculator;

    public TaxReport(){
        calculator = new TaxCalculator(100_000);
    }

    public String show(){
        var tax = calculator.calculateTax();
        return tax + "";
    }
}
