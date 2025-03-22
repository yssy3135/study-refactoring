package ch8.splitloop;

import java.util.Arrays;
import java.util.Optional;

public class Main {


    public String calculateYoungestTotalSalary(People[] people) {

        return String.format("최연소 %s, 총 급여: %d", youngestAge(people), totalSalary(people));
    }

    private Integer totalSalary(People[] people) {
        return Arrays.stream(people).map(p -> p.salary).reduce(0, Integer::sum);
    }

    private Integer youngestAge(People[] people) {
        int youngest = Optional.ofNullable(people[0]).map(p -> p.age).orElse(Integer.MAX_VALUE);
        for (People person : people) {
            youngest = Math.min(youngest, person.age);
        }
        return youngest;
    }
}
