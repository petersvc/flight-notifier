package org.example;

import java.util.ArrayList;
import java.util.List;

public class AircraftFactory {

    public List<Aircraft> createAircraft(String type, int HowManyToCreate){
        List<Aircraft> aircrafts = new ArrayList<>();
        String model = "";
        int capacity = 0;

        switch (type) {
            case "Boeing747":
                model = "Boeing747";
                capacity = 416;
                break;
            case "AirbusA380":
                model = "AirbusA380";
                capacity = 853;
                break;
            case "Boeing777":
                model = "Boeing777";
                capacity = 550;
                break;
            default:
                System.out.println("Invalid aircraft type");
                break;
        }

        for (int i = 0; i < HowManyToCreate; i++) {
            aircrafts.add(new Aircraft(this.generateId(), model, capacity));
        }

        return aircrafts;
    }

    private Long generateId() {
        return (long) (Math.random() * 1000000);
    }
}
