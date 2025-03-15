package ch7.replaceprimitivewithobject;

public class Order {

    Priority priority;

    public Order(Priority priority) {
        this.priority = priority;
    }


    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority aString) {
        priority = aString;
    }
}
