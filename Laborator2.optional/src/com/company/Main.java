package com.company;


import java.util.ArrayList;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        // write your code here
        Problem problem1 = new Problem();
        ArrayList<Destination> destinations = new ArrayList<Destination>();
        ArrayList<Source> sources = new ArrayList<Source>();

        Factories s1 = new Factories();
        Warehouses s2 = new Warehouses();
        Warehouses s3;
        s3 = new Warehouses();
        Destination d1 = new Destination();
        Destination d2 = new Destination();
        Destination d3 = new Destination();


        ///adugarea surselor in vectorul de surse cu verificare
        s1.setName("S1");
        s1.setSupply(10);
        sources.add(s1);
        problem1.SetSources(s1);


        s2.setName("S2");
        s2.setSupply(35);
        // sourceEquality(s2,sources);

       // for (Source a : sources) {
            if (s2.equals(s1)) {
                System.out.println("Introduceti o alta sursa, deorece aceasta deja exista !");
                Scanner keyboard = new Scanner(System.in);
                System.out.println("enter the source name");
                String text= keyboard.nextLine();
                s2.setName(text);
                System.out.println("enter the source supply");
                s2.setSupply(keyboard.nextInt());
                sources.add(s2);
                problem1.SetSources(s2);
            } else {
                sources.add(s2);
                problem1.SetSources(s2);
            }
       // }


        s3.setName("S3");
        s3.setSupply(25);
        // sourceEquality(s3,sources);

        //for (Source a : sources )
        //{
            if(s3.equals(s2))
            {
                System.out.println("Introduceti o alta sursa, deorece aceasta deja exista !");
                Scanner keyboard = new Scanner(System.in);
                System.out.println("enter the source name");
                String text= keyboard.nextLine();
                s3.setName(text);
                System.out.println("enter the source supply");
                s3.setSupply(keyboard.nextInt());
                sources.add(s3);
                problem1.SetSources(s3);
            }
            else {

                sources.add(s3);
                problem1.SetSources(s3);
            }
      //  }






        ///adugarea destinatiilor in vectorul de destinatii cu verificare de egalitate

        d1.setName("D1");
        d1.setDemand(20);
        destinations.add(d1);
        problem1.SetDestinations(d1);

        d2.setName("D1");
        d2.setDemand(20);
        // destinationEquality(d2,destinations);
        //for (Destination a: destinations )
        //{
            if(d2.equals(d1))
            {
                System.out.println("Introduceti o alta destinatie " + "d2 !");
                Scanner keyboard = new Scanner(System.in);
                System.out.println("enter the destination name");
                String text= keyboard.nextLine();
                d2.setName(text);
                System.out.println("enter the destination demand");
                d2.setDemand(keyboard.nextInt());
                destinations.add(d2);
                problem1.SetDestinations(d2);
            }
            else
            {
                destinations.add(d2);
                problem1.SetDestinations(d1);
            }

        //}

        d3.setName("D3");
        d3.setDemand(25);
        //destinationEquality(d3,destinations);

        //for (Destination a : destinations )
        //{
            if(d3.equals(d2))
            {
                System.out.println("Introduceti o alta destinatie, deorece aceasta deja exista !");
                Scanner keyboard = new Scanner(System.in);
                System.out.println("enter the destination name");
                String text= keyboard.nextLine();
                d3.setName(text);
                System.out.println("enter the destination demand");
                d3.setDemand(keyboard.nextInt());
                destinations.add(d3);
                problem1.SetDestinations(d3);
            }
            else
                destinations.add(d3);
                problem1.SetDestinations(d3);

       // }

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
        problem1.setAnElem(1, 1, 2);
        problem1.setAnElem(1, 2, 1);
        problem1.setAnElem(1, 3, 1);
        problem1.setAnElem(2, 1, 5);
        problem1.setAnElem(2, 2, 4);
        problem1.setAnElem(2, 3, 8);
        problem1.setAnElem(3, 1, 5);
        problem1.setAnElem(3, 2, 6);
        problem1.setAnElem(3, 3, 8);
        //System.out.println(problem1.getAnElem(1,1));

        problem1.info();
    }


   /* public static void sourceEquality(Source obj, ArrayList sources)
    {

        for (Object a : sources )
        {
            if(true == obj.equals(a))
            {
                System.out.println("Introduceti o alta sursa, deorece aceasta deja exista !");
                Scanner keyboard = new Scanner(System.in);
                System.out.println("enter the source name");
                obj.setName(String.valueOf(keyboard.nextInt()));
                System.out.println("enter the source supply");
                obj.setSupply(keyboard.nextInt());
            }
            else


      sources.add(obj);
      }
    }

    public static  void destinationEquality (Destination obj, ArrayList destinations)
    {

        for (Object a : destinations )
        {
            if(true == obj.equals(a))
            {
                System.out.println("Introduceti o alta destinatie, deorece aceasta deja exista !");
                Scanner keyboard = new Scanner(System.in);
                System.out.println("enter the destination name");
                obj.setName(String.valueOf(keyboard.nextInt()));
                System.out.println("enter the destination demand");
                obj.setDemand(keyboard.nextInt());
            }
            else
                destinations.add(obj);

        }

    } */


}
