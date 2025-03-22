package ch8.replaceloopwithpipeline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {



    public List<OfficeLocation> acquireData(String input) {

        String[] lines = input.split("\n");

        List<OfficeLocation> result = new ArrayList<>();

        String[] loopItems = Arrays.stream(lines)
                .skip(1)
                .toArray(String[]::new);

        for (String line : loopItems) {
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
