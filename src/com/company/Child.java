package com.company;

public class Child extends Point {
    public String bebe;
    Child()
    {

    }
    Child(String bebe)
    {
        super();
        this.bebe=bebe;

    }
    String  get_bebe()
    {
        if (this.bebe!=null)
        {
            return this.bebe;
        }
        else
        {
            return super.toString();
        }
    }//end


}
