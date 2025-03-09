package ch4;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class ProductionTest {
    ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        objectMapper = new ObjectMapper();
    }


    @Test
    public void province() throws IOException {
        Province sample = sampleProvinceData();

        Province province = new Province(sample.getName(), sample.getProducers(), sample.getDemand(), sample.getPrice());

        assertThat(province.shortFall()).isEqualTo(5);
    }


    @Test
    public void profit() throws IOException {
        Province province = sampleProvinceData();
        assertThat(province.getProfit()).isEqualTo(230);
    }


    @Test
    public void noProducers() throws IOException {
        Province noProducers = new Province("No producers", new ArrayList<>(), 30, 20);
        assertThat(noProducers.shortFall()).isEqualTo(30);
        assertThat(noProducers.getProfit()).isEqualTo(0);
    }

    @Test
    public void changeProduction() throws IOException {
        Province asia = sampleProvinceData();
        asia.getProducers().get(0).production("20");
        assertThat(asia.shortFall()).isEqualTo(-6);
        assertThat(asia.getProfit()).isEqualTo(292);
    }


    private Province sampleProvinceData() throws IOException {
        File provinceFile = new File("src/test/resources/ch4/data/province.json");
        Province readValue = objectMapper.readValue(provinceFile, Province.class);
        return new Province(readValue.name, readValue.producers, readValue.demand, readValue.price);
    }




}
