package ch12.replacesubclasswithdelegate.ex2;


public class Bird {
    protected Integer voltage;
    private String name;
    private String plumage;
    protected SpeciesDelegate speciesDelegate;

    public Bird(Data data) {
        this.name = data.name;
        this.plumage = data.plumage;
        this.speciesDelegate = selectSpeciesDelegate(data);
    }


    public String getName() {
        return name;
    }

    public String getPlumage() {
        return this.speciesDelegate.getPlumage();
    }

    public Integer getAirSpeedVelocity() {
        return this.speciesDelegate.getAirSpeedVelocity();
    }

    public SpeciesDelegate selectSpeciesDelegate(Data data) {
        return switch (data.type) {
            case "유럽 제비" -> new EuropeanSwallowDelegate(data, this);
            case "아프리카 제비" -> new AfricanSwallowDelegate(data, this);
            case "노르웨이 블루 앵무새" -> new NorwegianBlueParrotDelegate(data, this);
            default -> null;
        };
    }
}
