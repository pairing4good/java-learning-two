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
}