package org.knightmoves.learn;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MortgageValidatorTest {

    @Test
    public void shouldPass_WhenAllValuesArePositiveNumbers(){
        MortgageValidator mortgageValidator = new MortgageValidator();
        assertTrue(mortgageValidator.isValid(1, 1F, (byte) 1));
    }

    @Test
    public void shouldPass_WhenAllValuesAreZero(){
        MortgageValidator mortgageValidator = new MortgageValidator();
        assertTrue(mortgageValidator.isValid(0, 0F, (byte) 0));
    }

    @Test
    public void shouldFail_WhenAllValuesAreNegativeNumbers(){
        MortgageValidator mortgageValidator = new MortgageValidator();
        assertFalse(mortgageValidator.isValid(-1, -1F, (byte) -1));
    }

    @Test
    public void shouldFail_WhenSomeValuesAreNegativeNumbers(){
        MortgageValidator mortgageValidator = new MortgageValidator();
        assertFalse(mortgageValidator.isValid(-1, 1F, (byte) -1));
    }
}
