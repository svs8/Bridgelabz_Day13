package com.bridgelabz;

public class GenericTestMaximum<T extends Comparable<T>>{

    public <T extends Comparable<T>> void testIntegerMaximum(T ...n) {
        Integer i=0;
        T max=n[i];
        for(T data:n){
            if(n[i].compareTo(max)>0){
                max=n[i];
            }
            i++;
        }
        printMax(max);
    }

    public <T> void printMax(T max) {
        System.out.println("The maximum value is "+max);
    }


//    public Integer testIntegerMaximum(Integer a, Integer b, Integer c) {
//        Integer max=a;
//        if (b.compareTo(max) > 0) {
//             max=b;
//        }
//        if (c.compareTo(max)>0) {
//             max=c;
//        }
//
//        return max;
//
//    }
//
//        public Float testFloatMaximum(Float x, Float y, Float z) {
//        Float max=x;
//        if (y.compareTo(max) > 0) {
//            max=y;
//        }
//        if (z.compareTo(max)>0) {
//            max=z;
//        }
//        return max;
//
//    }
//
//    public String testStringMaximum(String x, String y, String z) {
//        String max=x;
//        if (y.compareTo(max) > 0) {
//            max=y;
//        }
//        if (z.compareTo(max)>0) {
//            max=z;
//        }
//        return max;
//
//    }


    }