package service.impl;

import models.airplanemodels.AirplaneType;
import models.airplanemodels.CargoAirplane;
import models.airplanemodels.PassengerAirplane;
import models.airportmodels.Airport;
import models.airplanemodels.Airplane;
import service.AirportService;

import java.util.Comparator;
import java.util.List;
import org.apache.log4j.Logger;

public class AirportServiceImpl implements AirportService {

    private static final Logger LOG = Logger.getLogger(AirportServiceImpl.class);

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
        int generalPassenger = 0;

        for(Airplane airplane : airport.getBaseAirplane()){
            if(airplane.equals(AirplaneType.PASSENGER))
                generalPassenger += ((PassengerAirplane) airplane).getAirplanePassengerCapacity();
        }
        return generalPassenger;
    }



    @Override
    public int generalCapacityCargo(Airport airport) {
        int generalCargo = 0;
        for(Airplane airplane : airport.getBaseAirplane()){
            if(airplane.equals(AirplaneType.CARGO))
                generalCargo += ((CargoAirplane) airplane).getAirplaneCargoCapacity();
        }

        return generalCargo;
    }

    @Override
    public void sortAirplaneByDistance(Airport airport) {
        List<Airplane> airplanes = airport.getBaseAirplane();
        airplanes.sort(Comparator.comparing(Airplane::getRangeOfFlight));
    }

    @Override
    public void consumptionFuelAirplane(Airport airport) {


    }
}
