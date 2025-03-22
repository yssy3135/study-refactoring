package ch8.splitloop;

import java.util.Optional;

public class Main {


    public Integer calculateYoungestTotalSalary(People[] people) {
        int youngest = Optional.ofNullable(people[0]).map(p -> p.age).orElse(Integer.MAX_VALUE);
        int totalSalary = 0;
        for (People person : people) {
            totalSalary += person.salary;
        }

        for (People person : people) {
            if (person.age < youngest) {
                youngest = person.age;
            }
        }

        return totalSalary;
    }
}
