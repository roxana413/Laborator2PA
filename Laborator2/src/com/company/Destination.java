package com.company;

public class Destination {
   private String name;
   private int    demand;
   private int count = 0;



    public Destination(String name, int demand) {
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

    public int getDemand() {
        return demand;
    }

    public void setDemand(int demand) {
        this.demand = demand;
    }

    public void info() {
        System.out.print(this.name + ' ');
        System.out.print(this.demand);
        System.out.println(" ");

    }

}
