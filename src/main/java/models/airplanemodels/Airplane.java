package models.airplanemodels;

import java.util.Objects;

public abstract class Airplane {
    private String nameAirplane;
    private int rangeOfFlight;
    private int fuelConsumption;
    final AirplaneType airplaneType;

    public Airplane(String nameAirplane, int rangeOfFlight, int fuelConsumption, AirplaneType airplaneType) {
        this.nameAirplane = nameAirplane;
        this.rangeOfFlight = rangeOfFlight;
        this.fuelConsumption = fuelConsumption;
        this.airplaneType = airplaneType;
    }

    public String getNameAirplane() {
        return nameAirplane;
    }

    public void setNameAirplane(String nameAirplane) {
        this.nameAirplane = nameAirplane;
    }

    public int getRangeOfFlight() {
        return rangeOfFlight;
    }

    public void setRangeOfFlight(int rangeOfFlight) {
        this.rangeOfFlight = rangeOfFlight;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public AirplaneType getAirplaneType() {
        return airplaneType;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "nameAirplane='" + nameAirplane + '\'' +
                ", rangeOfFlight=" + rangeOfFlight +
                ", fuelConsumption=" + fuelConsumption +
                ", airplaneType=" + airplaneType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airplane airplane = (Airplane) o;
        return rangeOfFlight == airplane.rangeOfFlight && fuelConsumption == airplane.fuelConsumption && Objects.equals(nameAirplane, airplane.nameAirplane) && airplaneType == airplane.airplaneType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAirplane, rangeOfFlight, fuelConsumption, airplaneType);
    }
}
