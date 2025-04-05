package ch12.replacesubclasswithdelegate.ex2;

public class Bird {
    protected Integer voltage;
    private String name;
    private String plumage;
    protected Data data;

    public Bird(Data data) {
        this.name = data.name;
        this.plumage = data.plumage;
        this.data = data;
    }


    public String getName() {
        return name;
    }

    public String getPlumage() {
        return plumage;
    }

    public Integer getAirSpeedVelocity() {
        return null;
    }
}
