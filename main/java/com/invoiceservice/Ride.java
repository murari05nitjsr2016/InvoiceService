package com.invoiceservice;

public class Ride {
    public double distance;
    public int time;
    public static int noOfRides = 0;

    public Ride(double distance, int time) {
        noOfRides++;
        this.distance = distance;
        this.time = time;
    }
}
