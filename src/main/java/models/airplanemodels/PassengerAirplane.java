package models.airplanemodels;

public class PassengerAirplane extends Airplane {

    private int airplanePassengerCapacity;

    public PassengerAirplane(String nameAiroplane, int rangeOfFlight, int fuelConsumption, int airplanePassengerCapacity) {
        super(nameAiroplane, rangeOfFlight, fuelConsumption);
        this.airplanePassengerCapacity =airplanePassengerCapacity;
    }

    public int getAirplanePassengerCapacity() {
        return airplanePassengerCapacity;
    }

    public void setAirplanePassengerCapacity(int airplanePassengerCapacity) {
        this.airplanePassengerCapacity = airplanePassengerCapacity;
    }
}
