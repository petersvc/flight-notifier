public class Canceled implements Status{
    private Flight flight;

    public Canceled(Flight flight){
        this.flight = flight;
        this.flight.notifierPassengers("Vôo cancelado");
    }
    
    @Override
    public void nextStatus(Status status) {
        this.flight.setStatus(status);
    }

    
}
   