package ch12.removesubclass;

public class Male extends Person {

    public Male(String name) {
        super(name);
    }

    @Override
    public String getGenderCode() {
        return "M";
    }
}
