package service;

import models.airplanemodels.CargoAirplane;
import models.airplanemodels.PassengerAirplane;

public interface AirplaneService {

    CargoAirplane createCargoAirplane(String nameAirplane, int rangeOfFlight, int fuelConsumption, int airplaneCargoCapacity);

    PassengerAirplane createPassengerAirplane(String nameAirplane, int rangeOfFlight, int fuelConsumption, int airplanePassengerCapacity);
}
