package org.knightmoves.learn;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WageCalculatorUtilityTest {

    @Test
    public void shouldCalculateWage_ThroughProceeduralCode(){
        int wage = WageCalculatorUtility.calculate();

        assertEquals(50200, wage);
    }
}
