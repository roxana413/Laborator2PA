package com.company;

public class Destination extends Problem {
    public String name;
    public String demand;
    public Destination(String name, String demand) {
        this.name = name;
        this.demand = demand;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Destination() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDemand() {
        return demand;
    }

    public void setDemand(String demand) {
        this.demand = demand;
    }
}
