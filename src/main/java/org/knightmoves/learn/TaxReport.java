package org.knightmoves.learn;

public class TaxReport {

    private TaxCalculator2018 calculator;

    public TaxReport(){
        calculator = new TaxCalculator2018(100_000);
    }

    public String show(){
        var tax = calculator.calculateTax();
        return tax + "";
    }
}
