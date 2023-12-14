package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Hangar {
    private final Long id;
    private final String name;
    private final String location;

    private final List<Aircraft> aircrafts = new ArrayList<>();

    public Hangar(Long id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public void addAircraft(Aircraft aircraft) {
        this.aircrafts.add(aircraft);
    }

    public List<Aircraft> getAircrafts() {
        return this.aircrafts;
    }

    public Aircraft getAircraftById(Long id) {
        return this.aircrafts.stream().filter(ac -> Objects.equals(ac.getId(), id)).findFirst().orElse(null);
    }

    public void removeAircraftById(Long id) {
        this.aircrafts.removeIf(ac -> Objects.equals(ac.getId(), id));
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getLocation() {
        return this.location;
    }
}
