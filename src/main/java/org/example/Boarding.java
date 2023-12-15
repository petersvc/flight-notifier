package org.example;

public class Boarding implements State {

    private Flight flight;

    public Boarding (Flight flight) {
        this.flight = flight;
    }

    @Override
    public void setState(State state) {

    }

    @Override
    public void confirmed() throws Exception {

    }

    @Override
    public void canceled() throws Exception {

    }

    @Override
    public void boarding() throws Exception {

    }

    @Override
    public void setGate(String newGate) throws Exception {

    }

    @Override
    public void delayed(Long minutes) throws Exception {

    }
}
