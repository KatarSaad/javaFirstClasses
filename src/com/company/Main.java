package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
     /* Testt t1=new Testt(5);
      t1.setHello("welcome");

      System.out.println(t1.get_hello());*/


        /*Circle c1=new Circle();
      c1.setColor("Green");
      c1.setRadius(2);
      double x=c1.getArea();
      System.out.println(c1.toString());
      System.out.println(x);*/

       /* Avreage avg=new Avreage();
        System.out.println(avg.avreage(2,4,4));
        */

        /*
        Date date=new Date();
        date.setDate(21,07,1996);
        date.setDay(21);
        date.nextDay();
        System.out.println(date.toString());
        */
        Point p=new Point();
        Point p1=new Point(1,3);
        p.setX(3);
        p.setY(2);
        p.setVar_static(8);
        Point.setVarstatic(7);
        System.out.println(p.distance());
        System.out.println(p.distance(p1));
        System.out.println(p.toString());
        System.out.println(Point.get_var_static());
        System.out.println(p.getVar_static());
        Child child=new Child();
        Child child1=new Child("Saad");
        System.out.println(child.get_bebe());
        System.out.println(child1.get_bebe());
        System.out.println(child instanceof Child);
        System.out.println(child instanceof Point);
        System.out.println(p instanceof Child);
        System.out.println(p instanceof Point );
    }

}
