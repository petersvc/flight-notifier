package org.example;

import java.util.ArrayList;
import java.util.List;

public class Flight {

    private long id;
    private String departures;
    private String arrivals;
    private String date;
    private String departureTime;
    private String arrivalTime;
    private String gate;
    private Aircraft aircraft;
    private final List<Passenger> passengers = new ArrayList<>();
    public State state;


    public Flight(long id, String departures, String arrivals, String date, String departureTime, String arrivalTime, String gate, Aircraft aircraft) {
        this.id = id;
        this.departures = departures;
        this.arrivals = arrivals;
        this.date = date;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.gate = gate;
        this.aircraft = aircraft;
        this.state = new Boarding(this);
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void removePassenger(Passenger passenger) {
        passengers.remove(passenger);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDepartures() {
        return departures;
    }

    public void setDepartures(String departures) {
        this.departures = departures;
    }

    public String getArrivals() {
        return arrivals;
    }

    public void setArrivals(String arrivals) {
        this.arrivals = arrivals;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }
}
