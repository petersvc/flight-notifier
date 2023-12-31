package org.example;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    List<Flight> flights = new ArrayList<>();

    public List<Flight> findAll() {
        return flights;
    }

    public Flight findByCode(long id) {
        for (Flight flight : flights) {
            if (flight.getCode() == id) {
                return flight;
            }
        }
        return null;
    }

    public void save(Flight flight) {
        flights.add(flight);
    }
}
