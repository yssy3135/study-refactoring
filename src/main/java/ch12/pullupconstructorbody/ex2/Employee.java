package ch12.pullupconstructorbody.ex2;

public class Employee {

    private String name;
    private int grade;

    public Employee(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    protected void finishConstruction() {
        if (this.isPrivileged()) {
            this.assignCar();
        }
    }

    private void assignCar() {

    }

    private boolean isPrivileged() {
        return this.grade > 4;
    }

}
