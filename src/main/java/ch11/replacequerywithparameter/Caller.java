package ch11.replacequerywithparameter;

public class Caller {

    public void call(HeatingPlan thePlan, Thermostat theThermostat) {

        if(thePlan.targetTemperature(theThermostat.selectedTemperature) > theThermostat.currentTemperature) {
            setToHeat();
        }
        else if(thePlan.targetTemperature(theThermostat.selectedTemperature) < theThermostat.currentTemperature) {
            setToCool();
        }
        else setOff();
    }

    private void setOff() {

    }

    private void setToCool() {
    }

    private void setToHeat() {

    }
}
