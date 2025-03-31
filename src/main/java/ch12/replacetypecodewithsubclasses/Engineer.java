package ch12.replacetypecodewithsubclasses;

public class Engineer extends Employee {

    public Engineer(String name, String type) {
        super(name, type);
    }

    public String getType() {
        return "engineer";
    }


}
