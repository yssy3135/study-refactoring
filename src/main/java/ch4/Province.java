package ch4;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Province {

    String name;
    List<Producer> producers;
    Integer totalProduction;
    Integer demand;
    Integer price;

    public Province() {

    }


    public Province(String name, List<Producer> producers, Integer demand, Integer price) {
        this.name = name;
        this.producers = producers;
        this.totalProduction = 0;
        this.demand = demand;
        this.price = price;
        producers.forEach(p -> {
            p.province = this;
            this.totalProduction += p.getProduction();
        });
    }


    public void addProducer(Producer arg) {
        producers.add(arg);
        this.totalProduction += arg.getProduction();
    }


    public String getName() {
        return name;
    }

    public List<Producer> getProducers() {
        return producers;
    }

    public Integer getTotalProduction() {
        return totalProduction;
    }

    public void setTotalProduction(Integer arg) {
        this.totalProduction = arg;
    }

    public Integer getDemand() {
        return demand;
    }

    public void setDemand(String arg) {
        this.demand = Integer.parseInt(arg);
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(String arg) {
        this.price = Integer.parseInt(arg);
    }

    public Integer shortFall() {
        if(demand == null) {
            return null;
        }

        return this.demand - this.totalProduction;
    }


    public Integer getProfit() {
        if(demand == null) return null;

        return this.getDemandValue() - this.demandCost();
    }


    public Integer getDemandValue() {
        return satisfiedDemand() * this.price;

    }

    public Integer satisfiedDemand() {
        return Math.min(this.demand, this.totalProduction);
    }

    public Integer demandCost() {
        AtomicInteger remainingDemand = new AtomicInteger(this.demand);
        AtomicInteger result = new AtomicInteger(0);
        producers.stream()
                .sorted((a,b) -> a.getCost() - b.getCost())
                .forEach(p -> {

                    Integer contribution = Math.min(remainingDemand.get(), p.getProduction());
                    remainingDemand.set(remainingDemand.get() - contribution);
                    result.set(result.get() + (contribution * p.getCost()));
                });

        return result.get();
    }


}
