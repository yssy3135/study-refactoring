package ch11.replacequerywithparameter;

public class HeatingPlan {

    private Double max;
    private Double min;
    private Thermostat thermostat;
    private HeatingPlan thePlan;

    public Double targetTemperature() {
        return xxNEWtargetTemperature(thermostat.selectedTemperature);
    }

    public double xxNEWtargetTemperature(Double selectedTemperature) {
        if(selectedTemperature > this.max) {
            return this.max;
        }
        else if(selectedTemperature < this.min) {
            return this.min;
        }
        else {
            return selectedTemperature;
        }
    }
}
