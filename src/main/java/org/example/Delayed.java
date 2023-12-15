public class Delayed implements Status {
    private final String status = "Delayed";
    private final Long minutes;
    private Status nextStatus;

    public Delayed(Long minutes) {
        this.flight = flight;
    }

    public void nextStatus(Status status) {
        this.flight.nextStatus = status;
    }

   public void Confirmed() throws Exception{
        if(this.flight.getStatus() instanceof Boarding){
            this.nextStatus(new Confirmed(this.flight));
            this.flight.notifierPassengers("O Voo "+ this.flight.getCode() + " está confirmado.");
        }else{
            throw new Exception("Aguarde mudança do status do seu vôo.");
        }
    }

    public void Canceled(Long minutes) throws Exception{
        if(this.flight.getStatus() instanceof Boarding){
            this.nextStatus(new Canceled(this.flight));
            this.flight.notifierPassengers("O Voo "+ this.flight.getCode() + " está cancelado.");
        }else{
            throw new Exception("Aguarde mudança do status do seu vôo.");
        }
    }

    public void Boarding(Long minutes) throws Exception{
        if(this.flight.getStatus() instanceof Boarding){
            this.nextStatus(new Boarding(this.flight));
            this.flight.notifierPassengers("O Voo "+ this.flight.getCode() + " está embarcando.");
        }else{
            throw new Exception("Aguarde mudança do status do seu vôo.");
        }
    }

    public void ChangedGate(Long minutes) throws Exception{
        if(this.flight.getStatus() instanceof Boarding){
            this.nextStatus(new ChangedGate(this.flight));
            this.flight.notifierPassengers("O Voo "+ this.flight.getCode() + " mudou de portão de embarque.");
        }else{
            throw new Exception("Aguarde mudança do status do seu vôo.");
        }
    }

    public void Delayed(Long minutes) throws Exception{
        if(this.flight.getStatus() instanceof Boarding){
            this.nextStatus(new Delayed(this.flight));
            this.flight.notifierPassengers("O Voo "+ this.flight.getCode() + " está atrasado.");
        }else{
            throw new Exception("Aguarde mudança do status do seu vôo.");
        }
    }

    public String toString() {
        return "Delayed{" +
                "status='" + this.status + '\'' +
                ", minutes=" + this.minutes +
                '}';
    }

       

}