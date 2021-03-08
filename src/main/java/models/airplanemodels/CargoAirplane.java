package models.airplanemodels;

public class CargoAirplane extends Airplane {

    private int airplaneCargoCapacity;

    public CargoAirplane(String nameAirplane, int rangeOfFlight, int fuelConsumption, int airplaneCapacity) {
        super(nameAirplane, rangeOfFlight, fuelConsumption);
        this.airplaneCargoCapacity =airplaneCapacity;
    }

    public int getAirplaneCargoCapacity() {
        return airplaneCargoCapacity;
    }

    public void setAirplaneCargoCapacity(int airplaneCargoCapacity) {
        this.airplaneCargoCapacity = airplaneCargoCapacity;
    }
}
