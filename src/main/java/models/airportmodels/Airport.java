package models.airportmodels;

import models.airplanemodels.Airplane;

import java.util.ArrayList;
import java.util.List;

public class Airport {

   private List<Airplane> baseAirplane = new ArrayList<>();

    public List<Airplane> getBaseAirplane() {
        return baseAirplane;
    }

    public void setBaseAirplane(List<Airplane> baseAirplane) {
        this.baseAirplane = baseAirplane;
    }
}
