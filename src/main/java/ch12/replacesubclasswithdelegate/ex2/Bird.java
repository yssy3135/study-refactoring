package ch12.replacesubclasswithdelegate.ex2;

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
        this.speciesDelegate = selectSpecialDelegate(data);
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

    public Bird selectSpecialDelegate(Data data) {
        switch (data.type) {
            case "유럽제비" :
                return new EuropeanSwallowDelegate(data);
            case "아프리카 제비" :
                return new AfricanSwallow(data);
            case "노르웨이 파랑 앵무" :
                return new NorwegianBlueParrot(data);
            default: return null;
        }

    }
}
