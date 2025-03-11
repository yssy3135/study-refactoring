package ch6.introduceparameterobject;

import java.util.List;
import java.util.stream.Collectors;

public class Refactoring {

    Station station;


    public List<Reading> readingsOutsideRange(Station station, int min, int max, NumberRange range) {
        return station.readings
                .stream()
                .filter(r -> r.temp < min || r.temp > max)
                .collect(Collectors.toList());
    }
}
