package com.company;

public  class Problem {

    private int[][] m = new int[10][10];
    private int     nrOfSources;
    private int     nrOfDestinations;
    private Source[] sources = new Source [10];
    private Destination [] destinations = new Destination [10];
    private int sCount=0;
    private int dCount=0;

    public void SetSources(Source s)
    {
        sources[++sCount]=s;
    }
    public void SetDestinations(Destination d)
    {
        destinations[++dCount]=d;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setM() {
        for (int i = 1; i <= columns; i++)

            for (int j = 1; j <= rows; j++) this.m[i][j] = 0;

    }

    private int rows;

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    private int columns;


    public void setAnElem(int i, int j, int nr) {
        this.m[i][j] = nr;
    }

    public int getAnElem(int i, int j) {
        return this.m[i][j];
    }


    public void setNrOfSources(int nr) {
        this.nrOfSources = nr;
    }

    public int getNrOfSources() {
        return this.nrOfSources;
    }


    public int getNrOfDestinations() {
        return this.nrOfDestinations;
    }

    public void setNrOfDestinations(int nr) {
        this.nrOfDestinations = nr;
    }


    public String toString() {
        return "Problem{}";
    }

    public Problem() {
    }

    public void info() {
        for (int i = 1; i <= columns; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print(this.m[i][j]);
                System.out.print(' ');
            }
            System.out.println(" ");
        }




    }
}