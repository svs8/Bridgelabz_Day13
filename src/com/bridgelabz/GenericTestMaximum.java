package com.bridgelabz;

public class GenericTestMaximum<T extends Comparable<T>>{

    public <T extends Comparable<T>> T testIntegerMaximum(T a, T b, T c) {
        T max=  a;
        if (b.compareTo(max) > 0) {
            max=b;
        }
        if (c.compareTo(max)>0) {
            max=c;
        }

       return max;

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