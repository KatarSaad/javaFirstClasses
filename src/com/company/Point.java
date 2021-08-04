package com.company;

public class Point {
    private static final int  STATIC_CONST=5;
    private static int var_static;//not recomended ,because it's accecible easly from the outside environement
    private int x=0;
    private int y=0;


    Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    Point ()
    {

    }
    public static int  get_var_static()
    {
        return var_static;
    }
    void setVar_static(int var_static)
    {
        this.var_static=var_static;
    }
    public static void setVarstatic(int var_staticc)
    {
        var_static=var_staticc;
    }
    int getVar_static()
    {
        return var_static;
    }
    void setX(int x)
    {
        this.x=x;

    }
    void setY(int y)
    {
        this.y=y;
    }
    int  getX()
    {
        return this.x;

    }
    int getY()
    {
        return this.y=y;
    }
    int[] getXY()
    {
        int xy[]=new int[2];//Similar to a Class
        xy[0]=this.x;
        xy[1]=this.y;
        return xy;
    }
    double  distance(Point p1)
    {

        double distance =Math.sqrt(Math.pow(p1.getY()-this.y,2)+Math.pow(p1.getX()-this.x,2));

        return distance ;
    }
    double distance ()
    {
        return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
