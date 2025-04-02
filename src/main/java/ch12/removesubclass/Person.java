package ch12.removesubclass;

public class Person{
    private String name;
    private String genderCode;


    public Person(String name, String genderCode) {
        this.name = name;
        this.genderCode = genderCode;
    }

    public String getName() {
        return name;
    }

    public String getGenderCode() {
        return genderCode;
    }


}
