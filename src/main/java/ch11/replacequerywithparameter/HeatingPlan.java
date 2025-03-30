package ch11.replacequerywithparameter;

public class HeatingPlan {

    private Double max;
    private Double min;
    private Thermostat thermostat;

    public Double getTemperature() {
        Double selectedTemperature = thermostat.selectedTemperature;
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
