package org.knightmoves.learn;

public class TaxReport {

    private TaxCalculator calculator;

    public TaxReport(TaxCalculator calculator){
        this.calculator = calculator;
    }

    public String show(){
        var tax = calculator.calculateTax();
        return tax + "";
    }
}
