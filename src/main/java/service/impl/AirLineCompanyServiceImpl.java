package service.impl;

import models.airlinecompanymodels.AirLineCompany;
import models.airplanemodels.*;
import org.apache.log4j.Logger;
import service.AirLineCompanyService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AirLineCompanyServiceImpl implements AirLineCompanyService {
    private static final Logger LOG = Logger.getLogger(AirLineCompanyServiceImpl.class);

    @Override
    public AirLineCompany createAirLineCompany() {
        return new AirLineCompany();
    }

    @Override
    public Airplane buyNewAirplane(AirLineCompany airLineCompany, Airplane airplane) {
        List<Airplane> airplanes = airLineCompany.getAirplanes();
        airplanes.add(airplane);
        return airplane;
    }

    @Override
    public int generalCapacityPassenger(AirLineCompany airLineCompany) {
        int generalPassenger = 0;

        for (Airplane airplane : airLineCompany.getAirplanes()) {
            if (airplane.getAirplaneType().equals(AirplaneType.PASSENGER))
                generalPassenger += ((PassengerAirplane) airplane).getAirplanePassengerCapacity();
        }
        LOG.info(String.format("Total capacity passenger of all '%s' airplane = '%d'", airLineCompany.getName(), generalPassenger));
        return generalPassenger;
    }

    @Override
    public int generalCapacityCargo(AirLineCompany airLineCompany) {
        int generalCargo = 0;
        for (Airplane airplane : airLineCompany.getAirplanes()) {
            if (airplane.getAirplaneType().equals(AirplaneType.CARGO))
                generalCargo += ((CargoAirplane) airplane).getAirplaneCargoCapacity();
        }
        LOG.info(String.format("Total capacity cargo of all '%s' airplane = '%d'", airLineCompany.getName(), generalCargo));
        return generalCargo;
    }

    @Override
    public List<Airplane> sortAirplaneByDistance(AirLineCompany airLineCompany) {
        List<Airplane> airplanes = airLineCompany.getAirplanes();
        airplanes.sort(Comparator.comparing(Airplane::getRangeOfFlight));
        LOG.info("Sort airplane by distance...");
        return airplanes;
    }

    @Override
    public List<Airplane> findAirplaneRangeConsumptionFuel(AirLineCompany airLineCompany, AirplaneFilter airplaneFilter) {
        List<Airplane> airplanes = airLineCompany.getAirplanes();
        List<Airplane> consumptionFuelSort = new ArrayList<>();
        for (Airplane airplane : airplanes) {

            if (airplaneFilter.getMaxFuelConsumption() != 0 && airplaneFilter.getMinFuelConsumption() != 0) {
                if (airplane.getFuelConsumption() > airplaneFilter.getMinFuelConsumption() && airplane.getFuelConsumption() < airplaneFilter.getMaxFuelConsumption()) {
                    consumptionFuelSort.add(airplane);
                }
            }
        }
        return consumptionFuelSort;
    }
}
