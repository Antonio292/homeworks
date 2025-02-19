package com.homeworks.homework35;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlightBookingMain {
    public static void main(String[] args) {
        FlightBooking booking = new FlightBooking();
        try {
            booking.bookFlight(null, "Anton", 32);
            booking.bookFlight("FL321", null, 32);
            booking.bookFlight("FL321", "Anton", 0);
        } catch (IllegalArgumentException exception) {
            System.out.println("Данные введены неверно. Проверьте данные.");
            log.error("Incorrect data. Passenger was not added.");
        }
        booking.bookFlight("FL321", "Anton", 32);

        booking.addPassenger(0, "Anton");
        try {
            booking.addPassenger(7, "Igor");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Индекс рейса указан неверно");
            log.error("incorrect flight index");
        }
        booking.addPassenger(0, "Anton");
        try {
            booking.addPassenger(2, null);
        } catch (IllegalArgumentException exception) {
            System.out.println("Имя пассажира введено неверно");
            log.error("incorrect passenger name");
        }
    }
}
