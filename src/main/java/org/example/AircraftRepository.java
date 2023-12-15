package org.example;

import java.util.ArrayList;
import java.util.List;

public class AircraftRepository {
    List<Aircraft> aircrafts = new ArrayList<>();
    AircraftFactory aircraftFactory = new AircraftFactory();

    public void save(String type, int HowManyToCreate) {
        aircrafts.addAll(aircraftFactory.create(type, HowManyToCreate));
    }

    public List<Aircraft> findAll() {
        return aircrafts;
    }

    public List<Aircraft> findByAvailability(FlightRepository flightRepository) {
        List<Aircraft> availableAircrafts = new ArrayList<>();
        for (Flight flight : flightRepository.findAll()) {
            if (flight.getAircraft() != null) {
                availableAircrafts.add(flight.getAircraft());
            }
        }
        return availableAircrafts;
    }

    public Aircraft findById(long id) {
        for (Aircraft aircraft : aircrafts) {
            if (aircraft.getId() == id) {
                return aircraft;
            }
        }
        return null;
    }

}
