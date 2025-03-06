package ch4;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class ProductionTest {
    ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        objectMapper = new ObjectMapper();
    }


    @Test
    public void province() throws IOException {
        File provinceFile = new File("src/test/resources/ch4/data/province.json");

        Province sample = objectMapper.readValue(provinceFile, Province.class);
        Province province = new Province(sample.getName(), sample.getProducers(), sample.getDemand(), sample.getPrice());

        Assertions.assertThat(province.shortFall()).isEqualTo(5);
    }




}
