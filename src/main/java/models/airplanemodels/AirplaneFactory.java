package models.airplanemodels;

public class AirplaneFactory {
    public Airplane createAirplane(AirplaneType type,String nameAirplane, int rangeOfFlight, int fuelConsumption, int airplaneCapacity,int airplanePassengerCapacity){
        Airplane airplane = null;
        switch (type){
            case CARGO:
                airplane = new CargoAirplane(nameAirplane,rangeOfFlight,fuelConsumption,airplaneCapacity);
                break;
            case PASSENGER:
                airplane = new PassengerAirplane(nameAirplane,rangeOfFlight,fuelConsumption, airplanePassengerCapacity);
                break;
        }
        return airplane;
    }
}
