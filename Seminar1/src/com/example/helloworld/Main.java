package com.example.helloworld;

public class Main {
    public static void main(String[] args)
    {
        Mathe1 m=new Mathe1();
        Temperatur t=new Temperatur();
        int[] temperatur={12, 14 , 9, 12, 15, 16, 15, 15, 11,  8, 13, 13, 15, 12};
        int[] tage={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        System.out.println(t.max_temp(temperatur,tage));
    }
}
