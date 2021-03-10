package service;

import models.airplanemodels.AirplaneType;
import models.airplanemodels.CargoAirplane;
import models.airplanemodels.PassengerAirplane;

public interface AirplaneService {

    CargoAirplane createCargoAirplane(String nameAirplane, int rangeOfFlight, int fuelConsumption, int airplaneCapacity);

    PassengerAirplane createPassengerAirplane(String nameAirplane, int rangeOfFlight, int fuelConsumption, int airplanePassengerCapacity);
}
