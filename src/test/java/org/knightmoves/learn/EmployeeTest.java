package org.knightmoves.learn;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest{

    @Test
    public void shouldThrowException_WhenBaseSalaryIsNegative(){
        try{
            new Employee().setBaseSalary(-1);
            fail();
        }catch (Exception e){
            assertTrue(e instanceof IllegalStateException);
            assertEquals("Salary cannot be 0 or less.", e.getMessage());
        }
    }

    @Test
    public void shouldCallSettersToCreateValidEmployee(){
        Employee employee = new Employee();
        employee.setHourlyRate(10);
        employee.setBaseSalary(10_000);

        int wage = employee.calculateWage(5);

        assertEquals(10_050, wage);
    }


    @Test
    public void shouldSimplifyEmployeeCreationByCallingConstructor(){
        Employee employee = new Employee(10_000, 10);

        int wage = employee.calculateWage(5);

        assertEquals(10_050, wage);
    }

    @Test
    public void shouldCallNoParameterOverloadedMethod_WhenNoExtraHours(){
        Employee employee = new Employee(10_000, 10);

        int wage = employee.calculateWage();

        assertEquals(10_000, wage);
    }



    @Test
    public void shouldCallSingleParameterConstructorForNonHourlyEmployees(){
        Employee employee = new Employee(10_000);

        int wage = employee.calculateWage();

        assertEquals(10_000, wage);
    }

    @Test
    public void shouldIncrementNumberOfEmployees_WhenNewEmployeeCreated(){
        Employee.numberOfEmployees = 0;

        assertEquals(0, Employee.printNumberOfEmployees());

        new Employee(0);

        assertEquals(1, Employee.printNumberOfEmployees());

        new Employee(0);

        assertEquals(2, Employee.printNumberOfEmployees());
    }
}