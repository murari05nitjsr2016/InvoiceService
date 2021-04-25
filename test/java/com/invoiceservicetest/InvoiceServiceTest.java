package com.invoiceservicetest;

import com.invoiceservice.InvoiceGenerator;
import com.invoiceservice.Ride;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceServiceTest {
    @Test
    public void givenDistanceAndTimeShouldReturnTotalFare()
    {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance,time);
        Assertions.assertEquals(25,fare,0.0);
    }

    @Test
    public void givenLessDistanceAndTimeShouldReturnMinFare() {
        InvoiceGenerator invoiceGenerator= new InvoiceGenerator();
        double distance = 0.2;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assertions.assertEquals(5, fare, 0.0);
    }

    @Test
    public void givenMultipleRidesShouldReturnTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Ride[] rides = {new Ride(2.0, 5),
                new Ride(0.1, 1)
        };
        double fare = invoiceGenerator.calculateFare(rides);
        Assertions.assertEquals(30, fare, 0.0);
    }

}
