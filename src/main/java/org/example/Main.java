package org.example;

public class Main {
    public static void main(String[] args) {
        var hangar = new Hangar(1L, "Hangar 1", "Location 1");

        var aircraftFactory = new AircraftFactory();

        var boeingB747 = aircraftFactory.createAircraft("Boeing747", 3);
        var airbusA380 = aircraftFactory.createAircraft("AirbusA380", 5);

        boeingB747.forEach(hangar::addAircraft);
        airbusA380.forEach(hangar::addAircraft);

        var notifierFactory = new NotifierFactory();

        System.out.println(hangar.getAircrafts());
    }
}