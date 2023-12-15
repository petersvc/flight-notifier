public class Changedgate implements Status{
    private Flight flight;

    public Changedgate (Flight flight) {
        this.flight = flight;
        this.flight.notifierPassengers("O seu vôo mudou de portão");
    }

    @Override
    public void nextStatus(Status status) {
        this.flight.setStatus(status);
    }

    @Override
    public void Confirmed() throws Exception{
        if(this.flight.getStatus() instanceof Boarding){
            this.nextStatus(new Confirmed(this.flight));
            this.flight.notifierPassengers("O Voo "+ this.flight.getCode() + " foi confirmado.");
        }else{
            throw new Exception("O voo ainda não pode ser confirmado.");
        }
    }

    @Override
    public void Canceled() throws Exception{
        if(this.flight.getStatus() instanceof Boarding){
            this.nextStatus(new Canceled(this.flight));
            this.flight.notifierPassengers("O Voo "+ this.flight.getCode() + " foi cancelado.");
        }else{
            throw new Exception("O voo ainda não pode ser cancelado.");
        }
    }

    @Override
    public void Boarding() throws Exception{
        if(this.flight.getStatus() instanceof Boarding){
            this.nextStatus(new Boarding(this.flight));
            this.flight.notifierPassengers("O Voo "+ this.flight.getCode() + " está embarcando.");
        }else{
            throw new Exception("O voo ainda não pode ser embarcado.");
        }
    }

    @Override
    public void ChangedGate() throws Exception{
        if(this.flight.getStatus() instanceof Boarding){
            this.nextStatus(new ChangedGate(this.flight));
            this.flight.notifierPassengers("O Voo "+ this.flight.getCode() + " mudou de portão de embarque.");
        }else{
            throw new Exception("O voo ainda não pode mudar de portão.");
        }
    }

    @Override
    public void Delayed() throws Exception{
        if(this.flight.getStatus() instanceof Boarding){
            this.nextStatus(new Delayed(this.flight));
            this.flight.notifierPassengers("O Voo "+ this.flight.getCode() + " está atrasado.");
        }else{
            throw new Exception("O voo ainda não tem nenhuma alteração.");
        }
    }

    @Override
    public String toString() {
        return "ChangedGate{" +
                "status='" + this.status + '\'' +
                ", newGate=" + this.newGate +
                '}';
    }


}