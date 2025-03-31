package ch12.pullupconstructorbody;

public class Department extends Party {

    private String name;
    private String staff;

    public Department(String name, String staff) {
        super(name);
        this.staff = staff;
    }
}
