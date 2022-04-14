package org.knightmoves.learn;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaxReportTest {

    @Test
    public void shouldInjectTaxCalculatorThroughConstructor(){
        TaxCalculator2018 calculator = new TaxCalculator2018(100_000);
        TaxReport taxReport = new TaxReport(calculator);

        assertNotNull(taxReport.getCalculator());
    }
    @Test
    public void shouldInjectTaxCalculatorThroughSetterSoItCanBeChanged(){
        TaxCalculator2018 calculator = new TaxCalculator2018(100_000);
        TaxReport taxReport = new TaxReport();
        taxReport.setCalculator(calculator);

        assertEquals("30000.0", taxReport.show());

        taxReport.setCalculator(new TaxCalculator2019());

        assertEquals("0.0", taxReport.show());
    }

}