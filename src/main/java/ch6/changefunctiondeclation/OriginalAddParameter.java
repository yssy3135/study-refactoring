package ch6.changefunctiondeclation;

import java.util.ArrayDeque;
import java.util.Queue;

public class OriginalAddParameter {
    protected Queue<Customer> reservations = new ArrayDeque<>();

    public void addReservation(Customer customer) {
        this.reservations.add(customer);
    }
}
