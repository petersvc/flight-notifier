public class Confirmed implements Status{
    private Flight flight;

    public Confirmed(Flight flight){
        this.flight = flight;
        this.flight.notifierPassengers("Vôo confirmado");
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
        this.flight.setStatus(new Canceled(this.flight));
    }

    @Override
    public void boarding() throws Exception {
        throw new Exception("O vôo está embarcando");
    }

    @Override
    public void changedgate(String newGate) throws Exception {
        throw new Exception("O vôo trocou de portão de embarque");
    }

    @Override
    public void delayed(Long minutes) throws Exception {
        throw new Exception("O vôo está atrasado");
    }

}