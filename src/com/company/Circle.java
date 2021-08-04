package com.company;


public class Circle {
    private double radius ;
    private String color ;
    Circle (double radius ,String color)
    {
        this.radius=radius;
        this.color=color ;

        }
    Circle ()
        {

        }
    double getRadius()
    {
        return this.radius;
    }
    String getColor()
    {
        return this.color;
    }
    void setRadius(double radius)
    {
        this.radius=radius;

    }
    void setColor(String color )
    {
        this.color=color;

    }
    double getArea()
    {
        return 2*Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}//end
