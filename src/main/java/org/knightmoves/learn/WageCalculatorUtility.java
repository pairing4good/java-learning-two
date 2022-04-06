package org.knightmoves.learn;

public class WageCalculatorUtility {

    public static int calculate(){
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;

        return calculateWage(baseSalary, extraHours, hourlyRate);
    }

    public static int calculateWage(int baseSalary, int extraHours, int hourlyRate){
        return baseSalary + (extraHours * hourlyRate);
    }
}
