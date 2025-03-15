package ch7.replaceprimitivewithobject;

public class Order {

    Priority priority;

    public Order(Priority priority) {
        this.priority = priority;
    }


    public String getPriorityString() {
        return priority.toString();
    }

    public void setPriority(String aString) {
        priority = new Priority(aString);
    }
}
