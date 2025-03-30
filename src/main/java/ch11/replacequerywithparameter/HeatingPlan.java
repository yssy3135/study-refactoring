package ch11.replacequerywithparameter;

public class HeatingPlan {

    private Double max;
    private Double min;
    private Thermostat thermostat;

    public Double getTemperature() {
        if(thermostat.targetTemperature > this.max) {
            return this.max;
        }
        else if(thermostat.targetTemperature < this.min) {
            return this.min;
        }
        else {
            return thermostat.targetTemperature;
        }
    }
}
