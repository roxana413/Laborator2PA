package com.company;

//import java.util.Objects;

public abstract class Source {
    public String type;
    public String name;
    public int    supply;


    @Override
    public abstract String toString();

    public abstract void info();

    public abstract String getType();

    public abstract void setType(String type);

    public abstract String getName();

    public abstract void setName(String name);

    public abstract int getSupply();

    public abstract void setSupply(int supply);
}
