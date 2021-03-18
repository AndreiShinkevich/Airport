import models.airlinecompanymodels.AirLineCompany;
import models.airplanefactory.AirplaneFactory;
import models.airplanemodels.AirplaneType;
import service.impl.AirLineCompanyServiceImpl;

public class Start {
    public static void main(String[] args) {

        AirLineCompanyServiceImpl airLineService = new AirLineCompanyServiceImpl();
        AirLineCompany airLineCompany = airLineService.createAirLineCompany();
        AirplaneFactory airplaneFactory = new AirplaneFactory();

        airLineService.buyNewAirplane(airLineCompany, airplaneFactory.createAirplane(AirplaneType.CARGO, "an-10", 1000, 200, 300));
        airLineService.buyNewAirplane(airLineCompany, airplaneFactory.createAirplane(AirplaneType.CARGO, "an-15", 500, 100, 400));
        airLineService.buyNewAirplane(airLineCompany, airplaneFactory.createAirplane(AirplaneType.PASSENGER, "an-25", 1000, 200, 200));
        airLineService.buyNewAirplane(airLineCompany, airplaneFactory.createAirplane(AirplaneType.PASSENGER, "an-27", 1200, 300, 150));
        airLineService.buyNewAirplane(airLineCompany, airplaneFactory.createAirplane(AirplaneType.PASSENGER, "an-20", 1000,500,200));

        System.out.println(airLineService.generalCapacityCargo(airLineCompany));
        System.out.println(airLineService.generalCapacityPassenger(airLineCompany));

        airLineService.createAirLineCompany();
        System.out.println(airLineCompany.getAirplanes());

    }
}

