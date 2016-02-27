package edu.westga.waynedavidsoninvestmentcalculator.model;

/**
 * Created by Wayne on 2/27/2016.
 */
public class InvestmentCalculator {
    double paymentAmount;
    double rate;
    int periods;

    /**
     * Construct the investmentcalculator object
     *
     * @param paymentAmount The amount paid each period
     * @param rate          The rate over the life
     * @param periods       The number of periods to calculate for
     */
    public InvestmentCalculator(double paymentAmount, double rate, int periods) {
        this.paymentAmount = paymentAmount;
        this.rate = rate;
        this.periods = periods;
    }

    /**
     * Set the payment amount
     *
     * @param paymentAmount The amount paid each period
     */
    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    /**
     * Retrive the payment amount
     *
     * @return  The amount paid each period
     */
    public double getPaymentAmount() {
        return this.paymentAmount;
    }

    /**
     * Set the rate
     *
     * @param rate  The rate over the life
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    /**
     * Return the rate
     *
     * @return  The rate over the life
     */
    public double getRate() {
        return this.rate;
    }

    /**
     * Set the periods
     * @param periods   The number of periods to calculate for
     */
    public void setPeriods(int periods) {
        this.periods = periods;
    }

    /**
     * Return the periods
     *
     * @return  The number of periods to calculate for
     */
    public int getPeriods() {
        return this.periods;
    }

    /**
     * Calculate the future value
     * @return  The future value
     */
    public double calculateFutureValue() {
        if (this.rate == 0) {
            return Math.round((this.paymentAmount * this.periods) * 100.0) / 100.0;
        }

        double numerator = (Math.pow(1 + (this.rate/100), this.periods) - 1);

        return Math.round(this.paymentAmount * (numerator / (this.rate / 100)) * 100.0) / 100.0;
    }
}
