package com.invoiceservice;

public class InvoiceReport {
    public int numOfRides;
    public double totalFare;
    public  double averageFare;



    public  InvoiceReport(int numOfRides, double totalFare) {
        this.numOfRides = numOfRides;
        this.totalFare = totalFare;
        this.averageFare = this.totalFare/this.numOfRides;
    }

    @Override
    public String toString() {
        return "InvoiceReport{" +
                "numOfRides=" + numOfRides +
                ", totalFare=" + totalFare +
                ", averageFare=" + averageFare +
                '}';
    }
}
