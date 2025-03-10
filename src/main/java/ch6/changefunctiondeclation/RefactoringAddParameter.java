package ch6.changefunctiondeclation;

import java.util.ArrayDeque;
import java.util.Queue;

public class RefactoringAddParameter {
    protected Queue<Customer> reservations = new ArrayDeque<>();

    public void addReservation(Customer customer) {
        zz_addReservaion(customer, false);
    }

    private void zz_addReservaion(Customer customer, Boolean isPriority) {
        assert isPriority == true || isPriority == false;
        this.reservations.add(customer);
    }
}
