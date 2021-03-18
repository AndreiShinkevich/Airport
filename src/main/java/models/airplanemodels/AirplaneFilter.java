package models.airplanemodels;

public class AirplaneFilter {
    private int minFuelConsumption;
    private int maxFuelConsumption;

    public AirplaneFilter(int minFuelConsumption, int maxFuelConsumption) {
        this.minFuelConsumption = minFuelConsumption;
        this.maxFuelConsumption = maxFuelConsumption;
    }

    public int getMinFuelConsumption() {
        return minFuelConsumption;
    }

    public void setMinFuelConsumption(int minFuelConsumption) {
        this.minFuelConsumption = minFuelConsumption;
    }

    public int getMaxFuelConsumption() {
        return maxFuelConsumption;
    }

    public void setMaxFuelConsumption(int maxFuelConsumption) {
        this.maxFuelConsumption = maxFuelConsumption;
    }
}
