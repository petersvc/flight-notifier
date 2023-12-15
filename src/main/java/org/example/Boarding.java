package org.example;

public class Boarding implements State {

    private Flight flight;

    public Boarding (Flight flight) {
        this.flight = flight;
    }

    @Override
    public void changeState(int typeState) throws Exception {
        State state = SimpleFactoryState.createState(typeState);
        if (state instanceof Boarding || state instanceof Canceled || state instanceof Delayed || state instanceof Concluded) {
            flight.setState(state);
            state.setFlight(flight);
            state.notify();
        }
        else {
            throw new Exception();
        }
    }

    @Override
    public void addPassenger(Passenger passenger) throws UnsupportedOperationException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Esse estado não permite adição de passageiros");
    }

    @Override
    public void removePassenger(String passenger) throws UnsupportedOperationException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Não é possível remover passageiros");
    }

    @Override
    public void changeGate(String gate) throws UnsupportedOperationException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Não é possível alterar o portão de embarque");
    }

    @Override
    public void setFlight(Flight flight) {
        // TODO Auto-generated method stub
        this.flight = flight;

    }

    @Override
    public void notify() {
        flight.notify("O voo está confirmado");
    }
   
}




