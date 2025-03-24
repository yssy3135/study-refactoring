package ch9.renamefield;

public class Organization {
    String title;
    String country;

    public Organization(String country, String title) {
        this.title = title;
        this.country = country;
    }

    public String getTitle() {
        return title;
    }

    public String getCountry() {
        return country;
    }

    public void setTitle(String aString) {
        this.title = aString;
    }

    public void setCountry(String aCountry) {
        this.country = aCountry;
    }
}
