package models.airlinecompanymodels;

import models.airplanemodels.Airplane;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AirLineCompany {
    private String name;
    private List<Airplane> airplanes = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(List<Airplane> airplanes) {
        this.airplanes = airplanes;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "nameAirport='" + name + '\'' +
                ", baseAirplane=" + airplanes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirLineCompany airLineCompany = (AirLineCompany) o;
        return Objects.equals(name, airLineCompany.name) && Objects.equals(airplanes, airLineCompany.airplanes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, airplanes);
    }
}
