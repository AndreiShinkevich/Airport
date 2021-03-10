package service;

import models.airportmodels.Airport;
import models.airplanemodels.Airplane;

public interface AirportService {

    Airport createAirport();

    void buyNewAirplane(Airport airport, Airplane airplane);

    int generalCapacityPassenger(Airport airport);

    int generalCapacityCargo(Airport airport);

    void sortAirplaneByDistance(Airport airport);

    void consumptionFuelAirplane(Airport airport);
}
