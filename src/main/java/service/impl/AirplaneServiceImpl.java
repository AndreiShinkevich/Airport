package service.impl;

import models.airplanemodels.AirplaneType;
import models.airplanemodels.CargoAirplane;
import models.airplanemodels.PassengerAirplane;
import service.AirplaneService;

public class AirplaneServiceImpl implements AirplaneService {

    @Override
    public CargoAirplane createCargoAirplane(String nameAirplane, int rangeOfFlight, int fuelConsumption, int airplaneCapacity) {
        return new CargoAirplane(nameAirplane, rangeOfFlight,fuelConsumption, airplaneCapacity);
    }

    @Override
    public PassengerAirplane createPassengerAirplane(String nameAirplane, int rangeOfFlight, int fuelConsumption, int airplanePassengerCapacity) {
        return new PassengerAirplane(nameAirplane, rangeOfFlight, fuelConsumption, airplanePassengerCapacity);
    }
}
