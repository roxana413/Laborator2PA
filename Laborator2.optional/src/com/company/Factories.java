package com.company;

import java.util.Objects;

public class Factories extends Source {
    private  String type = "Factories";
    private String     name;
    private  int        supply;

    @Override
    public String toString() {
        return null;
    }








    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSupply() {
        return supply;
    }

    public void setSupply(int supply) {
        this.supply = supply;
    }
    public void info() {
        System.out.print(this.getName());
        System.out.print(' ');
        System.out.print(this.getSupply() );
        System.out.print(' ');
        System.out.print(this.getType() );
        System.out.println(' ');
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Factories)) return false;
        Factories factories = (Factories) o;
        return getSupply() == factories.getSupply() && Objects.equals(getType(), factories.getType()) && Objects.equals(getName(), factories.getName());
    }
}
