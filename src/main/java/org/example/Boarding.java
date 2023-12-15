import java.util.List;

public class Boarding implements Status {

    private Flight flight;

    public Boarding(Flight flight){
        this.flight = flight;
        this.flight.notifierPassengers("Embarque iniciado");
    }

    @Override
    public void nextStatus(Status status) {
        this.flight.setStatus(status);
    }

    @Override
    public void confirmed() throws Exception {
        throw new Exception("O vôo já está confirmado");
    }

    @Override
    public void canceled() throws Exception {
        throw new Exception("O vôo já está cancelado");
    }

    @Override
    public void boarding() throws Exception {
        throw new Exception("O vôo já está embarcando");
    }

    @Override
    public void changedgate(String newGate) throws Exception {
        throw new Exception("O vôo trocou de portão de embarque");
    }

    @Override
    public void delayed(Long minutes) throws Exception {
        throw new Exception("O vôo está atrasado");
    }

    @Override
    public String toString() {
        return "Boarding";
    }

    @Override
    public List<String> getMessages() {
        return this.flight.getMessages();
    }

    @Override
    public void addMessage(String message) {
        this.flight.addMessage(message);
    }

    @Override
    public void notifierPassengers(String message) {
        this.flight.notifierPassengers(message);
    }

    @Override
    public void addPassenger(Passenger passenger) {
        this.flight.addPassenger(passenger);
    }

    @Override
    public List<Passenger> getPassengers() {
        return this.flight.getPassengers();
    }

    @Override
    public void removePassenger(Passenger passenger) {
        this.flight.removePassenger(passenger);
    }

    


}