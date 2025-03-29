package ch11.separatequeryfrommodifier;

import java.util.List;

public class Example {

    public void alertForMiscreant(List<String> people) {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).equals("조커")) {
                setOffAlarms();
            }
            if (people.get(i).equals("사루만")) {
                setOffAlarms();
            }
        }
    }

    public String findMiscreant(List<String> people) {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).equals("조커")) {
                return "조커";
            }
            if (people.get(i).equals("사루만")) {
                return "사루만";
            }
        }
        return "";
    }

    private void setOffAlarms() {

    }
}
