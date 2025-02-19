package com.homeworks.homework35;

import com.homeworks.exceptions.NoPassengerException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlightBooking {
    String[] flights = {"SU100", "BA202", "LH300", "AF101", "AA777"};
    String[] passengers = new String[5];

    public void bookFlight(String flightNumber, String passengerName, int seatNumber) {
        if (flightNumber == null || flightNumber.isEmpty()) {
            System.out.println("некорректный номер рейса");
            log.error("incorrect flight number");
            throw new IllegalArgumentException("incorrect flight number");
        }
        if (passengerName == null || passengerName.isEmpty()) {
            System.out.println("некорректное имя пассажира");
            log.error("incorrect passenger name");
            throw new IllegalArgumentException("incorrect passenger name");
        }
        if (seatNumber <= 0) {
            System.out.println("Некорректный номер места");
            log.error("incorrect seat number");
            throw new IllegalArgumentException("incorrect seat number");
        }
        System.out.println("Пассажир успешно добавлен");
        log.info("passenger was successful added");
    }

    public void addPassenger(int flightIndex, String passengerName) {
        if (flightIndex < 0 || flightIndex >= flights.length) {
            System.out.println("Индекс рейса указан неверно");
            log.error("incorrect flight index");
            throw new ArrayIndexOutOfBoundsException("incorrect flight index");
        }
        if (passengerName == null || passengerName.isEmpty()) {
            System.out.println("Имя пасажира указано неверно");
            log.error("incorrect passenger name");
            throw new IllegalArgumentException("incorrect passenger name");
        }
        passengers[flightIndex] = passengerName;
        System.out.println("Пассажир был успешно добавлен");
        log.info("Passenger was successful added");
    }

    public String getPassenger(int flightIndex) throws NoPassengerException {
        if (flightIndex < 0 || flightIndex > flights.length) {
            System.out.println("Индекс рейса указан неверно");
            log.error("incorrect flight number");
            throw new ArrayIndexOutOfBoundsException("incorrect flight number");
        }
        if (passengers[flightIndex] == null) {
            System.out.println("No passengers in flight {}" + flights[flightIndex]);
            log.error("No passengers in flight {}" + flights[flightIndex]);
            throw new NoPassengerException("No passengers in flight {}" + flights[flightIndex]);
        }
        return passengers[flightIndex];
    }
}
