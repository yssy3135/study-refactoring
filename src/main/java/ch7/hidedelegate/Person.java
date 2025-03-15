package ch7.hidedelegate;

public class Person {

    String name;
    Department department;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department arg) {
        department = arg;
    }

}
