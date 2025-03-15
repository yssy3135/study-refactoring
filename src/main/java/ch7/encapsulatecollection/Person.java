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
}
