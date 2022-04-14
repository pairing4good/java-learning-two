package org.knightmoves.learn;

public class TaxReport {

    public TaxCalculator getCalculator() {
        return calculator;
    }

    private TaxCalculator calculator;

    public TaxReport(TaxCalculator calculator){
        this.calculator = calculator;
    }
    public TaxReport(){}

    public String show(){
        var tax = calculator.calculateTax();
        return tax + "";
    }

    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }
}
