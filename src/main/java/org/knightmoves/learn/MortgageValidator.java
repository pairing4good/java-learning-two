package org.knightmoves.learn;

public class MortgageValidator {
    public boolean isValid(int principal, float annualInterest, byte years) {
        return principal >= 0 && annualInterest >= 0 && years >= 0;
    }
}
