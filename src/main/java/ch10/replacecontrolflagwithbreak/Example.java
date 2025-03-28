package ch10.replacecontrolflagwithbreak;

import java.util.List;

public class Example {

    public void checkForMiscreant(List<String> people ) {
        boolean found = false;
        for(String p : people) {
            if(!found) {
                if(p.equals("조커")) {
                    sendAlert();
                    found = true;
                }
                if(p.equals("사루만")) {
                    sendAlert();
                    found = true;
                }
            }
        }
    }

    private void sendAlert() {

    }
}
