package ch12.extractsuperclass;

import java.util.List;

public class Department extends Party {

    private List<Staff> staff;

    public Department(String name, List<Staff> staff) {
        super(name);
        this.staff = staff;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public Integer monthlyCost() {
        return staff.stream().reduce(0, (total, s) -> total + s.getMonthlyCost(), Integer::sum);
    }

    public Integer getHeadCount() {
        return staff.size();
    }

    public Integer getAnnualCost() {
        return monthlyCost() * 12;
    }
}
