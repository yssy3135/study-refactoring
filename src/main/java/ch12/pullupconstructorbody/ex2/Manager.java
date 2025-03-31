package ch12.pullupconstructorbody.ex2;

public class Manager extends Employee {

    public Manager(String name, int grade) {
        super(name, grade);
        this.finishConstruction();
    }


}


