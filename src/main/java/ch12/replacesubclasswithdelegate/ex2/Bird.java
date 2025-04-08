package ch12.replacesubclasswithdelegate.ex2;

import java.util.Optional;

public class Bird {
    protected Integer voltage;
    private String name;
    private String plumage;
    protected Data data;
    protected Bird speciesDelegate;

    public Bird(Data data) {
        this.name = data.name;
        this.plumage = data.plumage;
        this.data = data;
        this.speciesDelegate = selectSpeciesDelegate(data);
    }


    public String getName() {
        return name;
    }

    public String getPlumage() {
        return plumage;
    }

    public Integer getAirSpeedVelocity() {
        return this.speciesDelegate != null ? speciesDelegate.getAirSpeedVelocity() : null;
    }

    public Bird selectSpeciesDelegate(Data data) {
        return switch (data.type) {
            case "유럽 제비" -> new EuropeanSwallowDelegate(data);
            case "아프리카 제비" -> new AfricanSwallowDelegate(data);
            case "노르웨이 블루 앵무새" -> new NorwegianBlueParrotDelegate(data);
            default -> null;
        };
    }
}
