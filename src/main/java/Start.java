import models.airplanemodels.Airplane;
import models.airplanemodels.AirplaneFactory;
import models.airportmodels.Airport;
import service.impl.AirportServiceImpl;

public class Start {
    public static void main(String[] args) {

        AirportServiceImpl airportService = new AirportServiceImpl();

        Airport airport = airportService.createAirport();



    }
}

