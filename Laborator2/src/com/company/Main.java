package com.company;


import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Problem problem1 = new Problem();
        ArrayList <Destination> destinations = new ArrayList<Destination>();
        ArrayList <Source> sources = new ArrayList<Source>();

        Source s1= new Source() ;
        Source s2 =new Source ();
        Source s3 = new Source();
        Destination d1 = new Destination();
        Destination d2 = new Destination();
        Destination d3 = new Destination();

        sources.add(s1);
        sources.add(s2);
        sources.add(s3);
        destinations.add(d1);
        destinations.add(d2);
        destinations.add(d3);
        s1.setName("S1");

        s2.setName("S2");
        s3.setName("S3");
        d1.setName("D1");
        d2.setName("D2");
        d3.setName("D3");
        s1.setType(SourceType.FACTORY);
        s2.setType(SourceType.WAREHOUSE);
        s3.setType(SourceType.WAREHOUSE);
        s1.setSupply(10);
        s2.setSupply(35);
        s3.setSupply(25);
        d1.setDemand(20);
        d2.setDemand(25);
        d3.setDemand(25);
        //problem1.add(s1);
        //problem1.add(s2);
        //problem1.add(s3);
        //problem1.add(d1);
        //problem1.add(d2);
        //problem1.add(d3);
        for (Source a : sources) {
            a.info();
        }
        for (Destination a : destinations) {
            a.info();
        }

        problem1.setNrOfSources(sources.size());
        problem1.setNrOfDestinations(destinations.size());
        int n = problem1.getNrOfDestinations();
        int m = problem1.getNrOfSources();

        problem1.setRows(m);
        problem1.setColumns(n);
        problem1.setM();
        problem1.setAnElem(1,1,2);
        problem1.setAnElem(1,2,1);
        problem1.setAnElem(1,3,1);
        problem1.setAnElem(2,1,5);
        problem1.setAnElem(2,2,4);
        problem1.setAnElem(2,3,8);
        problem1.setAnElem(3,1,5);
        problem1.setAnElem(3,2,6);
        problem1.setAnElem(3,3,8);
        //System.out.println(problem1.getAnElem(1,1));

        problem1.info();


















    }
}
