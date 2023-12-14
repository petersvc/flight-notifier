package org.example;

public class Passenger {
    private final String name;
    private Notifier notifier;

    public Passenger(String name, Notifier notifier) {
        this.name = name;
        this.notifier = notifier;
    }

    public String getName() {
        return this.name;
    }

    public void notify(String msg) {
        this.notifier.notify(msg);
    }

    public void setNotifier(Notifier n) {
        this.notifier = n;
    }

}
