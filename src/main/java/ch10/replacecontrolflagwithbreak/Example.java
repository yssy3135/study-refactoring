package ch10.replacecontrolflagwithbreak;

import java.util.List;

public class Example {

    public void checkForMiscreant(List<String> people ) {

        for(String p : people) {
            if(p.equals("조커")) {
                sendAlert();
                return ;
            }
            if(p.equals("사루만")) {
                sendAlert();
                return ;
            }

        }
    }

    private void sendAlert() {

    }
}
