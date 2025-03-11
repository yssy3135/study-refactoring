package ch6.introduceparameterobject;

import java.util.List;
import java.util.stream.Collectors;

public class Refactoring {

    Station station;


    public List<Reading> readingsOutsideRange(Station station, NumberRange range) {
        return station.readings
                .stream()
                .filter(r -> r.temp < range.min || r.temp > range.max)
                .collect(Collectors.toList());
    }
}
