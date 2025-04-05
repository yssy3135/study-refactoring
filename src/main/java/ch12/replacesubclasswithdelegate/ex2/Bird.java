package ch12.replacesubclasswithdelegate.ex2;

public class Bird {
    protected Integer voltage;
    private String name;
    private String plumage;
    protected Data data;
    protected SpeciesDelegate speciesDelegate;

    public Bird(Data data) {
        this.name = data.name;
        this.plumage = data.plumage;
        this.data = data;
        this.speciesDelegate = selectSpecialDelegate(data);
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

    public SpeciesDelegate selectSpecialDelegate(Data data) {
        switch (data.type) {
            case "유럽제비" :
                return new EuropeanSwallowDelegate(data);
            default: return null;
        }

    }
}
