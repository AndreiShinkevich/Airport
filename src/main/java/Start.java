import models.airplanemodels.Airplane;
import models.airplanemodels.AirplaneFactory;
import models.airplanemodels.AirplaneType;
import models.airportmodels.Airport;
import service.impl.AirportServiceImpl;

public class Start {
    public static void main(String[] args) {

        AirportServiceImpl airportService = new AirportServiceImpl();

        Airport airport = airportService.createAirport();
        AirplaneFactory airplane = new AirplaneFactory();
        airplane.createAirplane(AirplaneType.CARGO,"AN24",250,500,200, 300);

    }
}

