package com.homeworks.lesson34;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlightBooking1 {

    public void bookFlight(String flightNumber, String passengerName, int seatNumber) {

        if (flightNumber == null || flightNumber.isEmpty()) {
            log.error("flight number is null or empty");
            throw new IllegalArgumentException("Flight number is null or empty");
        }
        if (passengerName == null || passengerName.isEmpty()) {
            log.error("passenger name is null or empty");
            throw new IllegalArgumentException("passenger name is null or empty");
        }
        if (seatNumber < 0) {
            log.error("incorrect seat number");
            throw new IllegalArgumentException("incorrect seat number");
        } else {
            log.info("Passenger {} registered successful", passengerName);
            System.out.println("Register was successful");
        }
    }
}
