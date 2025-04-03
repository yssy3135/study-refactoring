package ch12.extractsuperclass;

import java.util.List;

public class Department extends Party {

    private String name;
    private List<Staff> staff;

    public Department(String name, List<Staff> staff) {
        this.name = name;
        this.staff = staff;
    }

    public String getName() {
        return name;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public Integer totalMonthlyCost() {
        return staff.stream().reduce(0, (total, s) -> total + s.getMonthlyCost(), Integer::sum);
    }

    public Integer getHeadCount() {
        return staff.size();
    }

    public Integer totalAnnualCost() {
        return totalMonthlyCost() * 12;
    }
}
