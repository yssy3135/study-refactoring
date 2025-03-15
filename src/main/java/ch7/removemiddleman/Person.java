package ch7.removemiddleman;

public class Person {

    Department department;

    public String getManager() {
        return department.getManager().toString();
    }


}
