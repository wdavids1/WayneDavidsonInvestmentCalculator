package edu.westga.waynedavidsoninvestmentcalculator;

import org.junit.Test;

import edu.westga.waynedavidsoninvestmentcalculator.model.InvestmentCalculator;

import static org.junit.Assert.assertEquals;

/**
 * Created by Wayne on 2/27/2016.
 */
public class InvestmentCalculatorWhenCalculateFutureValue {

    @Test
    public void shouldGet125779ForFutureValue() {
        InvestmentCalculator calculator = new InvestmentCalculator(100, 5, 10);
        assertEquals(1257.79, calculator.calculateFutureValue(), 0);
    }

    @Test
    public void shouldGet5232ForFutureValue() {
        InvestmentCalculator calculator = new InvestmentCalculator(9.99, 2.32, 5);
        assertEquals(52.32, calculator.calculateFutureValue(), 0);
    }

    @Test
    public void shouldGet0ForFutureValue() {
        InvestmentCalculator calculator = new InvestmentCalculator(0, 0, 0);
        assertEquals(0, calculator.calculateFutureValue(), 0);
    }

    @Test
    public void shouldGet0ForFutureValueWhenNoPeriods() {
        InvestmentCalculator calculator = new InvestmentCalculator(100, 10, 0);
        assertEquals(0, calculator.calculateFutureValue(), 0);
    }

    @Test
    public void shouldGet0ForFutureValueWhenNoPayments() {
        InvestmentCalculator calculator = new InvestmentCalculator(0, 10, 10);
        assertEquals(0, calculator.calculateFutureValue(), 0);
    }

    @Test
    public void shouldGet10ForFutureValueWhenNoPeriods() {
        InvestmentCalculator calculator = new InvestmentCalculator(1, 0, 10);
        assertEquals(10, calculator.calculateFutureValue(), 0);
    }

    @Test
    public void shouldGet65132ForFutureValueWhenNegRate() {
        InvestmentCalculator calculator = new InvestmentCalculator(100, -10, 10);
        assertEquals(651.32, calculator.calculateFutureValue(), 0);
    }

    @Test
    public void shouldGetNeg159374ForFutureValueWhenNegPayment() {
        InvestmentCalculator calculator = new InvestmentCalculator(-100, 10, 10);
        assertEquals(-1593.74, calculator.calculateFutureValue(), 0);
    }

    @Test
    public void shouldGetNeg61446ForFutureValueWhenNegPeriods() {
        InvestmentCalculator calculator = new InvestmentCalculator(100, 10, -10);
        assertEquals(-614.46, calculator.calculateFutureValue(), 0);
    }

    @Test
    public void shouldGetNeg0ForFutureValue() {
        InvestmentCalculator calculator = new InvestmentCalculator(0, 0, 0);
        assertEquals(0, calculator.calculateFutureValue(), 0);
    }
}
