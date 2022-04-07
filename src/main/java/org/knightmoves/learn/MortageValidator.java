package org.knightmoves.learn;

public class MortageValidator {

    public boolean isYearsInvalid(byte years) {
        return years < 1 || years > 30;
    }

    public boolean isAnnualInterestInvalid(float annualInterest) {
        return annualInterest < 1 || annualInterest > 30;
    }

    public boolean isPrincipalInvalid(int principal) {
        return principal < 1000 || principal > 1_000_000;
    }
}
