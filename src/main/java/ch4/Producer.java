package ch4;
public class Producer {

    private Province province;
    private String name;
    private Integer cost;
    private Integer production;

    public Producer() {
    }

    public Producer(String name, Integer cost, Integer production) {
        this.name = name;
        this.cost = cost;
        this.production = production;
    }

    public String getName() {
        return name;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(String arg) {
        this.cost = Integer.valueOf(arg);
    }

    public Integer getProduction() {
        return production;
    }

    public void production(String amountStr) {
        Integer amount = Integer.parseInt(amountStr);
        Integer newProduction = amount == null ? 0 : amount;
        this.province.totalProduction += newProduction - this.production;
        this.production = newProduction;
    }

}
