package models.airplanemodels;

public class PassengerAirplane extends Airplane {

    private int airplanePassengerCapacity;

    public PassengerAirplane(String nameAirplane, int rangeOfFlight, int fuelConsumption, int airplanePassengerCapacity,AirplaneType airplaneType) {
        super(nameAirplane, rangeOfFlight, fuelConsumption, airplaneType);
        this.airplanePassengerCapacity =airplanePassengerCapacity;
    }

    public int getAirplanePassengerCapacity() {
        return airplanePassengerCapacity;
    }

    public void setAirplanePassengerCapacity(int airplanePassengerCapacity) {
        this.airplanePassengerCapacity = airplanePassengerCapacity;
    }
}
