package edu.westga.waynedavidsoninvestmentcalculator;

import org.junit.Test;

import edu.westga.waynedavidsoninvestmentcalculator.model.InvestmentCalculator;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class InvestmentCalculatorWhenConstructed {

    @Test
    public void shouldGet100ForPaymentAmount() {
        InvestmentCalculator calculator = new InvestmentCalculator(100, 0, 0);
        assertEquals(100, calculator.getPaymentAmount(), 0);
    }

    @Test
    public void shouldGet999ForPaymentAmount() {
        InvestmentCalculator calculator = new InvestmentCalculator(9.99, 0, 0);
        assertEquals(9.99, calculator.getPaymentAmount(), 0);
    }

    @Test
    public void shouldGet0ForPaymentAmount() {
        InvestmentCalculator calculator = new InvestmentCalculator(0, 0, 0);
        assertEquals(0, calculator.getPaymentAmount(), 0);
    }

    @Test
    public void shouldGetNeg100ForPaymentAmount() {
        InvestmentCalculator calculator = new InvestmentCalculator(-100, 0, 0);
        assertEquals(-100, calculator.getPaymentAmount(), 0);
    }

    @Test
    public void shouldGet5ForRate() {
        InvestmentCalculator calculator = new InvestmentCalculator(0, 5, 0);
        assertEquals(5, calculator.getRate(), 0);
    }

    @Test
    public void shouldGet0ForRate() {
        InvestmentCalculator calculator = new InvestmentCalculator(0, 0, 0);
        assertEquals(0, calculator.getRate(), 0);
    }

    @Test
    public void shouldGet399ForRate() {
        InvestmentCalculator calculator = new InvestmentCalculator(0, 3.99, 0);
        assertEquals(3.99, calculator.getRate(), 0);
    }

    @Test
    public void shouldGetNeg5ForRate() {
        InvestmentCalculator calculator = new InvestmentCalculator(0, -5, 0);
        assertEquals(-5, calculator.getRate(), 0);
    }

    @Test
    public void shouldGet1ForPeriods() {
        InvestmentCalculator calculator = new InvestmentCalculator(0, 0, 1);
        assertEquals(1, calculator.getPeriods(), 0);
    }

    @Test
    public void shouldGet100ForPeriods() {
        InvestmentCalculator calculator = new InvestmentCalculator(0, 0, 100);
        assertEquals(100, calculator.getPeriods(), 0);
    }

    @Test
    public void shouldGet0ForPeriodsWhenPeriodNotSpecified() {
        InvestmentCalculator calculator = new InvestmentCalculator(0, 0, 0);
        assertEquals(0, calculator.getPeriods(), 0);
    }

    @Test
    public void shouldGetNeg1ForPeriodsWhenPeriodNegative() {
        InvestmentCalculator calculator = new InvestmentCalculator(0, 0, -1);
        assertEquals(-1, calculator.getPeriods(), 0);
    }
}