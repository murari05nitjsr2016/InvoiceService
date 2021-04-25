package com.invoiceservice;

public class InvoiceGenerator {
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_COST_PER_KILOMETER = 10;
    private static final double NORMAL_MINIMUN_FARE = 5;

    /*
    This method will return total fare based on
    parameters distance and time
     */
    public double calculateFare(double distance, int time) {
        double NormaltotalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
        if (NormaltotalFare < NORMAL_MINIMUN_FARE) {
            return NORMAL_MINIMUN_FARE;
        }
        return NormaltotalFare;
    }
}