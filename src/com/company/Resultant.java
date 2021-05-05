package com.company;
import java.lang.Math;
import java.util.*;


public class Resultant {
    private int x;
    private int y;

    public Resultant(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public float resultant(int a, int b ){

        float z = ((a * a) + (b + b));
        double w = Math.sqrt(z);
        return z;
    }
}