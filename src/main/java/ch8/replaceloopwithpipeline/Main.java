package ch8.replaceloopwithpipeline;

import java.util.ArrayList;
import java.util.List;

public class Main {



    public List<OfficeLocation> acquireData(String input) {

        String[] lines = input.split("\n");
        Boolean firstLine = true;
        List<OfficeLocation> result = new ArrayList<>();

        for (String line : lines) {
            if(firstLine) {
                firstLine = false;
                continue;
            }
            if(line.trim().equals("")) {
                continue;
            }
            String[] fields = line.split(",");
            if (fields[1].equals("office")) {
                result.add(new OfficeLocation(fields[0], fields[2]));
            }
        }
        return result;
    }
}
