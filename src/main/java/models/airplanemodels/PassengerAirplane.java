package models.airplanemodels;

public class PassengerAirplane extends Airplane {

    private int airoplanePassengerCapacity;

    public PassengerAirplane(String nameAiroplane, int rangeOfFlight, int fuelConsumption, int airoplanePassengerCapacity) {
        super(nameAiroplane, rangeOfFlight, fuelConsumption);
        this.airoplanePassengerCapacity=airoplanePassengerCapacity;
    }

    public int getAiroplanePassengerCapacity() {
        return airoplanePassengerCapacity;
    }

    public void setAiroplanePassengerCapacity(int airoplanePassengerCapacity) {
        this.airoplanePassengerCapacity = airoplanePassengerCapacity;
    }
}
