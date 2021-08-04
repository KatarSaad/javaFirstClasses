package com.company;

public class Date {
    private int day;
    private int month ;
    private int year ;

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
    void setDay(int day)
    {
        this.day=day;

    }
    void setMonth(int month)
    {
        this.month=month;

    }
    void setYear(int year)
    {
        this.year=year;

    }
    int getDay()
    {
        return this.day;
    }
    int getMonth()
    {
        return this.month;

    }
    int getYear()
    {
        return this.year;

    }
    void setDate(int day,int month,int year)
    {
        this.year=year;
        this.day=day;
        this.month=month;

    }
    void nextDay()
    {
        setDay(this.day+1);
    }

}
