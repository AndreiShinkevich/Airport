package service.impl;

import models.airplanemodels.AirplaneFactory;
import models.airplanemodels.AirplaneType;
import models.airportmodels.Airport;
import models.airplanemodels.Airplane;
import service.AirportService;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class AirportServiceImpl implements AirportService {

//    private static final Logger log = Logger.getLogger(AirportServiceImpl.class);

    @Override
    public Airport createAirport() {
        return new Airport();
    }

    @Override
    public void buyNewAirplane(Airport airport, Airplane airplane) {
        List<Airplane> airplanes = airport.getBaseAirplane();
        airplanes.add(airplane);
    }


    @Override
    public int generalCapacityPassenger(Airport airport) {
        List<Airplane> list = new ArrayList<>();
        list = airport.getBaseAirplane();

        return 0;
    }



    @Override
    public int generalCapacityCargo(Airport airport) {
        return 0;
    }

    @Override
    public void sortAiroplaneByDistance(Airport airoport) {

    }

    @Override
    public void cosumptionFuelAiroplane(Airport airoport) {

    }
}
