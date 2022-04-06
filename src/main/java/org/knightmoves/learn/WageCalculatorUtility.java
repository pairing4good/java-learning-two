package org.knightmoves.learn;

public class WageCalculatorUtility {

    public static int calculate(){
        Employee employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);

        return employee.calculateWage(10);
    }
}
