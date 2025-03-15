package ch7.encapsulatecollection;

import java.util.ArrayList;
import java.util.List;

public class Person {
    String name;
    List<Course> courses = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return new ArrayList<>(courses);
    }

    public List<Course> getCourse(List<Course> courses) {
        return new ArrayList<>(courses);
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.stream()
                .filter(c -> c.getName().equals(course.getName()))
                .findAny()
                .ifPresentOrElse(
                        c -> courses.remove(c),
                        () -> {throw new IllegalArgumentException("Range error");}
                );


    }

}
