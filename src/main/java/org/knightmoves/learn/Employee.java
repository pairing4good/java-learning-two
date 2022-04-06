package org.knightmoves.learn;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public static int printNumberOfEmployees() {
        return numberOfEmployees;
    }

    public static int numberOfEmployees;

    public Employee(){
    }

    public Employee(int baseSalary, int hourlyRate) {
        this.baseSalary = baseSalary;
        this.hourlyRate = hourlyRate;
        numberOfEmployees++;
    }

    public Employee(int baseSalary) {
        this(baseSalary, 0);
    }

    public int calculateWage(int extraHours){
        return baseSalary + (extraHours * hourlyRate);
    }

    public int calculateWage(){
        return calculateWage(0);
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        if(baseSalary <= 0)
            throw new IllegalStateException("Salary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
