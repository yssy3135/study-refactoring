package ch6.extractfunction;


import ch6.combinefunctionsintotransform.Reading;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static ch6.combinefunctionsintotransform.Refactoring.enrichReading;

public class combinefunctionsintotransform {


    @Test
    public void checkReadingUnchanged() {

        Reading reading = new Reading("ivan", 15, 5, 2017);
        Reading oracle = new Reading(reading);
        enrichReading(oracle);

        Assertions.assertThat(reading).isEqualToComparingFieldByField(oracle);

    }

}
