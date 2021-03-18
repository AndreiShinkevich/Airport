package models.airplanemodels;

public class CargoAirplane extends Airplane {

    private int airplaneCargoCapacity;

    public CargoAirplane(String nameAirplane, int rangeOfFlight, int fuelConsumption, int airplaneCargoCapacity, AirplaneType airplaneType) {
        super(nameAirplane, rangeOfFlight, fuelConsumption, airplaneType);
        this.airplaneCargoCapacity = airplaneCargoCapacity;
    }

    public int getAirplaneCargoCapacity() {
        return airplaneCargoCapacity;
    }

    public void setAirplaneCargoCapacity(int airplaneCargoCapacity) {
        this.airplaneCargoCapacity = airplaneCargoCapacity;
    }
}
