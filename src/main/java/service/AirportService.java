package service;

import models.airportmodels.Airport;
import models.airplanemodels.Airplane;

public interface AirportService {

    Airport createAirport();

    void buyNewAirplane(Airport airoport, Airplane airplane);

    int generalCapacityPassenger(Airport airoport);

    int generalCapacityCargo(Airport airoport);

    void sortAiroplaneByDistance(Airport airoport);

    void cosumptionFuelAiroplane(Airport airoport);
}
