package ch9.renamefield;

public class Organization {
    String name;
    String country;

    public Organization(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String aCountry) {
        this.country = aCountry;
    }
}
