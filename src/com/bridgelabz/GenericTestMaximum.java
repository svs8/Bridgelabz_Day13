package com.bridgelabz;

public class GenericTestMaximum{
    public Integer testIntegerMaximum(Integer x, Integer y, Integer z) {
        Integer max=x;
        if (y.compareTo(max) > 0) {
             max=y;
        }
        if (z.compareTo(max)>0) {
             max=z;
        }

        return max;

    }

}