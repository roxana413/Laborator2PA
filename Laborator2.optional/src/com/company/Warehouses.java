package com.company;

import java.util.Objects;

public class Warehouses extends Source  {
    private  String type = "Warehouses";
    private String     name;
    private  int        supply;

    @Override
    public String toString() {
        return null;
    }

    public void info() {
        System.out.print(this.getName());
        System.out.print(' ');
        System.out.print(this.getSupply() );
        System.out.print(' ');
        System.out.print(this.getType() );
        System.out.println(' ');
    }

    public String  getType() {
        return type;
    }

    @Override
    public void setType(String type) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Warehouses)) return false;
        Warehouses that = (Warehouses) o;
        return getSupply() == that.getSupply() && getType().equals(that.getType()) && getName().equals(that.getName());
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

















}
