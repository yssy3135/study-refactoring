package ch6.extractfunction;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Invoice {
    protected List<Order> orders = new ArrayList<>();
    protected LocalDateTime dueDate;
    protected String customer;

    public Invoice(List<Order> orders, LocalDateTime dueDate, String customer) {
        this.orders = orders;
        this.dueDate = dueDate;
        this.customer = customer;
    }

    public List<Order> getOrders() {
        return orders;
    }
}