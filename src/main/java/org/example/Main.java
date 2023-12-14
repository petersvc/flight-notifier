package org.example;

public class Main {
    public static void main(String[] args) {
        var hangar = new Hangar(1L, "Hangar 1", "Location 1");

        var aircraftB747 = new Aircraft(1L, "Boeing 747", 400);
        var aircraftA380 = new Aircraft(2L, "Airbus A380", 500);

        hangar.addAircraft(aircraftB747);
        hangar.addAircraft(aircraftA380);

        var notifierFactory = new NotifierFactory();
    }
}