package ch12.extractsuperclass;

public class Employee extends Party {

    private Long id;

    public Employee(String name, Long id, Integer monthlyCost) {
        super(name);
        this.id = id;
        this.monthlyCost = monthlyCost;
    }

    public Long getId() {
        return this.id;
    }


}
