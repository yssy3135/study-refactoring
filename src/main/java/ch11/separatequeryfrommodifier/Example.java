package ch11.separatequeryfrommodifier;

import java.util.List;

public class Example {

    public String alertForMiscreant(List<String> people) {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).equals("조커")) {
                setOffAlarms();
                return "조커";
            }
            if (people.get(i).equals("사루만")) {
                setOffAlarms();
                return "사루만";
            }
        }
        return "";
    }

    public String findMiscreant(List<String> people) {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).equals("조커")) {
                setOffAlarms();
                return "조커";
            }
            if (people.get(i).equals("사루만")) {
                setOffAlarms();
                return "사루만";
            }
        }
        return "";
    }

    private void setOffAlarms() {

    }
}
