package ch12.removesubclass;

public class Male extends Person {

    public Male(String name) {
        super(name, "M");
    }

    @Override
    public String getGenderCode() {
        return "M";
    }

    public static Male createMale(String name) {
        return new Male(name);
    }
}
