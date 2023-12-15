package org.example;


public class Passenger implements Notifier {
    private final String name;
    private final String email;
    private Notifier notifier;

    public Passenger(String name, String email, Notifier notifier) {
        this.name = name;
        this.email = email;
        this.notifier = notifier;
    }

    public String getName() {
        return this.name;
    }
    
    public String getEmail() {
    	return this.email;
    }

    public void notify(String msg) {
    	System.out.println("Passenger: "+ this.name);
        this.notifier.notify(msg);
    }

    public void setNotifier(Notifier n) {
        this.notifier = n;
    }

     @Override
    public String toString(){
        String saida = "Nome do Passageiro: " + this.name;
        saida = saida + "\nEmail: " + this.email;
        saida = saida + "\nNotifier: " +  this.notifier;
        return saida;
    }

}
