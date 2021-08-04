package com.company;

public class Avreage {
    double avreage(int n1,int n2,int n3)
    {
        System.out.println("First avg");
        return (n1+n3+n2)/3;
    }
    double avreage(double n1,int n2,int n3)
    {
        System.out.println("Second avg");
        return (n1+n2+n3)/3;

    }
    double avreage(int n1,double n2)
    {
        System.out.println("Third avg");
        return (n1+n2)/2;
    }
}//end
