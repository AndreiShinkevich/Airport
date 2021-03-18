package service;

import models.airlinecompanymodels.AirLineCompany;
import models.airplanemodels.Airplane;
import models.airplanemodels.AirplaneFilter;

import java.util.List;

public interface AirLineCompanyService {

    AirLineCompany createAirLineCompany();

    Airplane buyNewAirplane(AirLineCompany airLineCompany, Airplane airplane);

    int generalCapacityPassenger(AirLineCompany airLineCompany);

    int generalCapacityCargo(AirLineCompany airLineCompany);

    List<Airplane> sortAirplaneByDistance(AirLineCompany airLineCompany);

    List<Airplane> findAirplaneRangeConsumptionFuel(AirLineCompany airLineCompany, AirplaneFilter airplaneFilter);
}
