package ch6.introduceparameterobject;

import java.time.LocalDateTime;

public class Reading {
    protected int temp;
    protected LocalDateTime time;

    public Reading(int temp) {
        this.temp = temp;
        time = LocalDateTime.now();
    }
}