package com.homeworks.homework35;

import com.github.javafaker.Bool;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class AirlineReservationSystem {
    Map<String, Map<Integer, Boolean>> base = new HashMap<>();

    public void reserveSeat(String flightNumber, int seatNumber, String passengerName) {
        if (flightNumber == null || flightNumber.isEmpty()) {
            System.out.println("Некорректный номер рейса");
            log.error("incorrect flight number");
            throw new IllegalArgumentException("incorrect flight number");
        }
        if (seatNumber <= 0) {
            System.out.println("Некорректный номер места");
            log.error("incorrect seat number");
            throw new IllegalArgumentException("incorrect seat number");
        }
        if (passengerName == null || passengerName.isEmpty()) {
            System.out.println("Некорректне имя пассажира");
            log.error("incorrect passenger name");
            throw new IllegalArgumentException("incorrect passenger name");
        }
        if (!base.containsKey(flightNumber)) {
            System.out.println("Такого рейса не существует");
            log.warn("attempt to find incorrect flight");
            throw new IllegalArgumentException("attempt to find incorrect flight");
        }
        Map<Integer, Boolean> passenger = null;
        for (Map.Entry<String, Map<Integer, Boolean>> entry : base.entrySet()) {
        }
    }
}
