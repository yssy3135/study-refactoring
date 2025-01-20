package ch1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class StatementTest {

    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        objectMapper = new ObjectMapper();
    }

    @Test
    public void test_statement() throws IOException {
        File invoicesFile = new File("src/test/resources/ch1/json/invoices.json");
        File playsFile = new File("src/test/resources/ch1/json/plays.json");

        Invoice[] invoices = objectMapper.readValue(invoicesFile, Invoice[].class);
        Map<String, Play> plays = objectMapper.readValue(playsFile, new TypeReference<Map<String, Play>>() {});
        Invoice invoice = invoices[0];

        String result = Example.statement(invoice, plays);
        assertThat(result).isEqualTo(
                """
                        청구 내역 (고객명 : BigCo)
                         Hamlet : 650 (55석)
                         As You Like It : 580 (35석)
                         Othello : 500 (40석)
                        총액: $1,730.00
                        적립 포인트: 47점
                        """
        );


    }
}
