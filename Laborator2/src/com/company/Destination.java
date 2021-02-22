package com.company;

public class Destination extends Problem {
    public String name;
    public int demand;
    public Destination(String name, int  demand) {
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

    public int  getDemand() {
        return demand;
    }

    public void setDemand(int demand) {
        this.demand = demand;
    }
    public void info()
    {
        System.out.println(this.name);
        System.out.println(" ");
        System.out.println(this.demand);
        System.out.println(" ");

    }
}
