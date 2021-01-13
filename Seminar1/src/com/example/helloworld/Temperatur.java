package com.example.helloworld;

import java.security.KeyPair;
import java.util.Arrays;
public class Temperatur {
    public int durschnitttemperatur(int[] temp,int[] tage)
    {
        int sum=0;
        for(int i=1;i<temp.length;i++)
            sum=sum+temp[i];
        return sum/tage.length;
    }
    public int min_temp(int[] temp,int[] tage)
    {
        int min=9999;
        for(int i=1;i<temp.length;i++) {
            if (temp[i] < min)
                min = temp[i];
        }
        return min;
    }
    public int max_temp(int[] temp,int[] tage)
    {
        int max=0;
        for(int i=1;i<temp.length;i++) {
            if (temp[i] > max)
                max = temp[i];
        }
        return max;
    }

    public String tempschwung(int[] temp,int[] tage)
    {
        int schwung1=0;
        int schwung2=0;
        int[] aux=new int[3];
        for(int i=0;i< temp.length;i++)
            if((temp[i]>temp[i+1]) & (temp[i]-temp[i+1]>schwung1) ) {
                schwung1 = temp[i] - temp[i + 1];
                aux[0]=schwung1;
                aux[1]=temp[i];
                aux[2]=temp[i+1];
            }

            else
                if((temp[i+1]>temp[i]) & (temp[i+1]-temp[i]>schwung1)) {
                    schwung1 = temp[i + 1] - temp[i];
                    aux[0] = schwung1;
                    aux[1] = temp[i];
                    aux[2] = temp[i + 1];
                }
        for(int i=0;i<temp.length;i++)
            if((temp[i]>temp[i+1]) & (temp[i]-temp[i+1]>schwung2) &(aux[1]!=) )
    }
}
