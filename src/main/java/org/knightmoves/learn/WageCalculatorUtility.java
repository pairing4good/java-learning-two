package org.knightmoves.learn;

public class WageCalculatorUtility {

    public static int calculate(){
        Employee employee = new Employee();
        employee.baseSalary = 50_000;
        employee.hourlyRate = 20;

        return employee.calculateWage(10);
    }
}
