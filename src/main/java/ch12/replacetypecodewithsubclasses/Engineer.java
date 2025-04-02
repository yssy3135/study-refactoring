package ch12.replacetypecodewithsubclasses;

public class Engineer extends Employee {

    public Engineer(String name) {
        super(name);
    }

    public String getType() {
        return "engineer";
    }


}
