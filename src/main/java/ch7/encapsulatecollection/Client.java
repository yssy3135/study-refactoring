package ch7.encapsulatecollection;

public class Client {

    public Integer getNumberOfAdvancedCourses(Person person) {
       return person.courses.stream()
               .filter(Course::isAdvanced)
               .reduce(0, (total, course) -> total + 1, Integer::sum);
    }
}
