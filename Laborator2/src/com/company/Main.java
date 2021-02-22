package com.company;


import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList <Problem> problem1 = new ArrayList<Problem>();
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
        s1.name="S1";
        s2.name="S2";
        s3.name="S3";
        d1.name="D1";
        d2.name="D2";
        d3.name="D3";
        s1.type=SourceType.FACTORY;
        s2.type=SourceType.WAREHOUSE;
        s3.type=SourceType.WAREHOUSE;
        s1.supply=10;
        s2.supply=35;
        s3.supply=25;
        d1.demand=20;
        d2.demand=25;
        d3.demand=25;
        problem1.add(s1);
        problem1.add(s2);
        problem1.add(s3);
        problem1.add(d1);
        problem1.add(d2);
        problem1.add(d3);
        for (Problem a : problem1) {
            a.info();
        }







    }
}
