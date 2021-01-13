package com.example.helloworld;

public class Mathe1 {
    public double add(double x,double y)
    {
        return x+y;
    }
    public double sub(double x,double y)
    {
        return x-y;
    }
    public boolean perfekt(double x)
    {
        int sum=0;
        for(int d=1;d<=x/2;d++)
            if(x%d==0)
                sum=sum+d;
            return sum==x;
    }
    public double mul(double x,double y)
    {
        double mul=1;
        for(int i=1;i<=y;i++)
            mul=mul+add(x,x);
        return mul;

    }
}
