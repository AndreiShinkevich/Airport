package service.impl;

import models.airlinecompanymodels.AirLineCompany;
import models.airplanefactory.AirplaneFactory;
import models.airplanemodels.AirplaneFilter;
import models.airplanemodels.AirplaneType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.AirLineCompanyService;

public class AirportServiceImplTest {
    private AirLineCompanyService airLineService;
    private AirplaneFactory airplaneFactory;
    private AirLineCompany airLineCompanyTest;
    private AirplaneFilter airplaneFilter;

    @Before
    public void init() {
        airLineService = new AirLineCompanyServiceImpl();
        airplaneFactory = new AirplaneFactory();
        airLineCompanyTest = airLineService.createAirLineCompany();
        fillList();

    }

    public void fillList() {
        airLineService.buyNewAirplane(airLineCompanyTest, airplaneFactory.createAirplane(AirplaneType.PASSENGER, "an-25", 1000, 400, 200));
        airLineService.buyNewAirplane(airLineCompanyTest, airplaneFactory.createAirplane(AirplaneType.PASSENGER, "an-27", 1200, 300, 150));
        airLineService.buyNewAirplane(airLineCompanyTest, airplaneFactory.createAirplane(AirplaneType.CARGO, "an-10", 1000, 250, 300));
        airLineService.buyNewAirplane(airLineCompanyTest, airplaneFactory.createAirplane(AirplaneType.CARGO, "an-15", 500, 150, 400));


    }

    @Test

    public void shouldCreateAirLineCompany() {
        AirLineCompany airLineCompany = airLineService.createAirLineCompany();
        Assert.assertNotNull(airLineCompany);
    }

    @Test
    public void shouldBuyNewAirplane() {

        Assert.assertNotNull(airLineCompanyTest.getAirplanes());
        Assert.assertEquals("an-25", airLineCompanyTest.getAirplanes().get(0).getNameAirplane());
    }

    @Test
    public void shouldGeneralCapacityPassenger() {
        Assert.assertEquals(350, airLineService.generalCapacityPassenger(airLineCompanyTest));
    }

    @Test
    public void shouldGeneralCapacityCargo() {
        Assert.assertEquals(700, airLineService.generalCapacityCargo(airLineCompanyTest));
    }

    @Test
    public void shouldSortAirplaneByDistance() {
        airLineService.sortAirplaneByDistance(airLineCompanyTest);
        Assert.assertEquals(1200, airLineCompanyTest.getAirplanes().get(3).getRangeOfFlight());

    }

    @Test
    public void shouldFindAirplaneRangeConsumptionFuel() {
        airplaneFilter = new AirplaneFilter(350, 450);
        Assert.assertEquals("an-25", airLineService.findAirplaneRangeConsumptionFuel(airLineCompanyTest, airplaneFilter).get(0).getNameAirplane());

    }

}
