public class Flight {
    private Long code;
    private ArrayList<Passenger> passageiros;
    private Status status;
    private String departures;
    private String arrivals;
    private String gate;
    private LocalDateTime date;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private Aircraft aircraft;
    private int availableSeats;
    private int occupiedSeats;

    
    public Flight(
            String departures,
            String arrivals,
            String gate,
            LocalDateTime date,
            LocalDateTime departureTime,
            LocalDateTime arrivalTime,
            Aircraft aircraft
        Aircraft aircraft){
        this.code = code;
        this.passengers = new ArrayList<Passenger>();
        this.status = new Programado();
        this.departures = departures;
        this.arrivals = arrivals;
        this.gate = gate;
        this.date = date;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.aircraft = aircraft;
        this.availableSeats = aircraft.getCapacity();
        this.occupiedSeats = 0;
        
    }

    public Long getCode(){
        return this.code;
    }

    public Status getStatus(){
        return this.status;
    }

    public String getGate(){
        return this.gate;
    }

    public LocalDateTime getDate(){
        return this.date;
    }

    public LocalDateTime getDepartureTime(){
        return this.departureTime;
    }

    public LocalDateTime getArrivalTime(){
        return this.arrivalTime;
    }

    public Aircraft getAircraft(){
        return this.aircraft;
    }

    public int getAvailableSeats(){
        return this.availableSeats;
    }

    public int getOccupiedSeats(){
        return this.occupiedSeats;
    }

    public void setCode(Long code){
        this.code = code;
    }

    public void setStatus(Status status){
        this.status = status;
    }

    public void setGate(String gate){
        this.gate = gate;
    }

    public void setDate(LocalDateTime date){
        this.date = date;
    }

    public void setDepartureTime(LocalDateTime departureTime){
        this.departureTime = departureTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime){
        this.arrivalTime = arrivalTime;
    }

    public void setAircraft(Aircraft aircraft){
        this.aircraft = aircraft;
    }

    public void setAvailableSeats(int availableSeats){
        this.availableSeats = availableSeats;
    }

    public void setOccupiedSeats(int occupiedSeats){
        this.occupiedSeats = occupiedSeats;
    }

    public void cancelFlight() throws Exception{
        try{
            this.status.cancelFlight();
        }catch(Exception e){
            throw new Exception(e);
        }
    }


    public void confirmFlight() throws Exception{
        try{
            this.status.confirmFlight();
        }catch(Exception e){
            throw new Exception(e);
        }
    }

    public void changeGate(String newGate) throws Exception{
        try{
            this.status.changeGate(newGate);
        }catch(Exception e){
            throw new Exception(e);
        }
    }

    public void delayFlight(Long minutes) throws Exception{
        try{
            this.status.delayFlight(minutes);
        }catch(Exception e){
            throw new Exception(e);
        }
    }

    public void nextStatus(Status status) throws Exception{
        try{
            this.status.nextStatus(status);
        }catch(Exception e){
            throw new Exception(e);
        }
    }

    public void addPassenger(Passenger passenger) throws Exception{
        try{
            this.passengers.add(passenger);
        }catch(Exception e){
            throw new Exception(e);
        }
    }

    public void removePassenger(Passenger passenger) throws Exception{
        try{
            this.passengers.remove(passenger);
        }catch(Exception e){
            throw new Exception(e);
        }
    }

    public void addOccupiedSeats(int occupiedSeats) throws Exception{
        try{
            this.occupiedSeats += occupiedSeats;
        }catch(Exception e){
            throw new Exception(e);
        }
    }

    public void removeOccupiedSeats(int occupiedSeats) throws Exception{
        try{
            this.occupiedSeats -= occupiedSeats;
        }catch(Exception e){
            throw new Exception(e);
        }
    }

    public void addAvailableSeats(int availableSeats) throws Exception{
        try{
            this.availableSeats += availableSeats;
        }catch(Exception e){
            throw new Exception(e);
        }
    }

    public void removeAvailableSeats(int availableSeats) throws Exception{
        try{
            this.availableSeats -= availableSeats;
        }catch(Exception e){
            throw new Exception(e);
        }
    }

    public String toString(){
        return "Flight{" +
                "code=" + this.code +
                ", status='" + this.status + '\'' +
                ", gate='" + this.gate + '\'' +
                ", date='" + this.date + '\'' +
                ", departureTime='" + this.departureTime + '\'' +
                ", arrivalTime='" + this.arrivalTime + '\'' +
                ", aircraft='" + this.aircraft + '\'' +
                ", availableSeats='" + this.availableSeats + '\'' +
                ", occupiedSeats='" + this.occupiedSeats + '\'' +
                '}';
    }


    
}