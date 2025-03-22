package ch8.replaceloopwithpipeline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {



    public List<OfficeLocation> acquireData(String input) {

        String[] lines = input.split("\n");

        return Arrays.stream(lines)
                .skip(1)
                .filter(s -> !s.isEmpty())
                .map(s -> s.split(","))
                .filter(record -> record[1].trim().equals("India"))
                .map(record -> new OfficeLocation(record[0], record[2]))
                .toList();

    }
}
