package com.company;

import java.util.Scanner;

interface ICalculator {
    int add(int x, int y);
    float divide(int x, int y) throws RuntimeException;
}
class IC implements ICalculator{
    public int add(int x, int y){
        return x+y ;
    }

    public float divide(int x, int y) {
        if (y==0) {
            throw new IllegalArgumentException("Math Error !");
        }
        else if (x==0)   return 0;
        return (float) x/y ;
    }
}



