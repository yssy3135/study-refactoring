package ch12.pullupconstructorbody.ex2;

public class Manager extends Employee {

    private int grade;

    public Manager(String name, int grade) {
        super(name);
        this.grade = grade;
        if(this.isPrivileged()) {
            this.assignCar();
        }
    }

    private void assignCar() {

    }

    private boolean isPrivileged() {
        return this.grade > 4;
    }

}
