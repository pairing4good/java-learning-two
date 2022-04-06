package org.knightmoves.learn;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProceduralMortgageCalculatorTest {

    @Test
    public void shouldCalculate(){
        String calculation = ProceduralMortgageCalculator.calculate(100_000, 3F, (byte) 5);

        assertEquals("\n" +
                "MORTGAGE\n" +
                "--------\n" +
                "Monthly Payments: $1,796.83\n" +
                "\n" +
                "PAYMENT SCHEDULE\n" +
                "----------------\n" +
                "$98,453.13\n" +
                "$96,902.40\n" +
                "$95,347.79\n" +
                "$93,789.29\n" +
                "$92,226.90\n" +
                "$90,660.60\n" +
                "$89,090.38\n" +
                "$87,516.24\n" +
                "$85,938.17\n" +
                "$84,356.14\n" +
                "$82,770.17\n" +
                "$81,180.23\n" +
                "$79,586.31\n" +
                "$77,988.41\n" +
                "$76,386.51\n" +
                "$74,780.61\n" +
                "$73,170.69\n" +
                "$71,556.75\n" +
                "$69,938.77\n" +
                "$68,316.75\n" +
                "$66,690.68\n" +
                "$65,060.54\n" +
                "$63,426.32\n" +
                "$61,788.02\n" +
                "$60,145.62\n" +
                "$58,499.11\n" +
                "$56,848.49\n" +
                "$55,193.74\n" +
                "$53,534.86\n" +
                "$51,871.83\n" +
                "$50,204.64\n" +
                "$48,533.28\n" +
                "$46,857.74\n" +
                "$45,178.02\n" +
                "$43,494.09\n" +
                "$41,805.96\n" +
                "$40,113.61\n" +
                "$38,417.02\n" +
                "$36,716.19\n" +
                "$35,011.11\n" +
                "$33,301.77\n" +
                "$31,588.15\n" +
                "$29,870.25\n" +
                "$28,148.06\n" +
                "$26,421.56\n" +
                "$24,690.74\n" +
                "$22,955.60\n" +
                "$21,216.12\n" +
                "$19,472.29\n" +
                "$17,724.10\n" +
                "$15,971.54\n" +
                "$14,214.59\n" +
                "$12,453.26\n" +
                "$10,687.52\n" +
                "$8,917.37\n" +
                "$7,142.79\n" +
                "$5,363.77\n" +
                "$3,580.31\n" +
                "$1,792.39\n" +
                "$0.00\n", calculation);
    }

    @Test
    public void shouldCalculateForZero(){
        String result = ProceduralMortgageCalculator.calculate(-1, -1F, (byte) -1);

        assertEquals("\nMORTGAGE\n" +
                "--------\n" +
                "Monthly Payments: $0.08\n" +
                "\n" +
                "PAYMENT SCHEDULE\n" +
                "----------------\n", result);
    }

}