package models.airplanefactory;

import models.airplanemodels.Airplane;
import models.airplanemodels.AirplaneType;
import models.airplanemodels.CargoAirplane;
import models.airplanemodels.PassengerAirplane;

public class AirplaneFactory {
    public Airplane createAirplane(AirplaneType type, String nameAirplane, int rangeOfFlight, int fuelConsumption, int airplaneCapacity) {

        Airplane airplane = null;
        switch (type) {
            case CARGO:
                airplane = new CargoAirplane(nameAirplane, rangeOfFlight, fuelConsumption, airplaneCapacity, type);
                break;
            case PASSENGER:
                airplane = new PassengerAirplane(nameAirplane, rangeOfFlight, fuelConsumption, airplaneCapacity, type);
                break;
            default:
                throw new IllegalArgumentException("Select the type of Airplane:" + type);
        }
        return airplane;
    }
}
