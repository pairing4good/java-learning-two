package org.knightmoves.learn;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaxReportTest {

    @Test
    public void shouldInjectTaxCalculator(){
        TaxCalculator2018 calculator = new TaxCalculator2018(100_000);
        TaxReport taxReport = new TaxReport(calculator);
    }

}