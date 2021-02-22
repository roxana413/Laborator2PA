package com.company;
public class Source extends Problem {
    public SourceType type;
    public String     name;
    public int        supply;



    public Source(SourceType type) {
        this.type = type;
    }

    public Source(String name) {
        this.name = name;
    }

    public Source(int supply) {
        this.supply = supply;
    }

    @Override
    public String toString() {
        return super.toString();
    }


    /*public void Source(SourceType type, String name, int supply) {
        this.type = type;
        this.name = name;
        this.supply = supply;
    }*/

    public Source() {

    }

    @Override
    public void info() {
        System.out.println(this.name);
        System.out.println(" ");
        System.out.println(this.supply);
        System.out.println(" ");
        System.out.println(this.type);
        System.out.println(" ");




    }

    public SourceType getType() {
        return type;
    }

    public void setType(SourceType type) {
        this.type = type;
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
