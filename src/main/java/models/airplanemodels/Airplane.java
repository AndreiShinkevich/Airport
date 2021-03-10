package models.airplanemodels;

public abstract class Airplane {
    private String nameAirplane;
    private int rangeOfFlight;
    private int fuelConsumption;
    AirplaneType airplaneType;

    public Airplane(String nameAirplane, int rangeOfFlight, int fuelConsumption) {
        this.nameAirplane = nameAirplane;
        this.rangeOfFlight = rangeOfFlight;
        this.fuelConsumption = fuelConsumption;



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
}
