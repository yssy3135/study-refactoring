package ch9.renamefield;

public class Organization {
    String title;
    String country;

    public Organization(String name, String country, String title) {
        this.title = title;
        this.country = country;
    }

    public String getName() {
        return title;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String aString) {
        this.title = aString;
    }

    public void setCountry(String aCountry) {
        this.country = aCountry;
    }
}
