package ch12.removesubclass;

public class Female extends Person {

    public Female(String name) {
        super(name);
    }

    @Override
    public String getGenderCode() {
        return "F";
    }

    public static Female createFemale(String name) {
        return new Female(name);
    }
}
