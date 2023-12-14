package org.example;

public class Aircraft {
    private final Long id;
    private final String model;
    private final int capacity;

    public Aircraft(Long id, String model, int capacity) {
        this.id = id;
        this.model = model;
        this.capacity = capacity;
    }

    public Long getId() {
        return this.id;
    }

    public String getModel() {
        return this.model;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
