package com.bridgelabz;

import java.util.Scanner;

public class MainClass {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Integer[] arr1 = new Integer[4];
        Float[] arr2 = new Float[4];
        String[] arr3 = new String[4];

        System.out.println("enter the first integer");
        arr1[0] = scanner.nextInt();
        System.out.println("enter the second integer");
        arr1[1] = scanner.nextInt();
        System.out.println("enter the third integer");
        arr1[2] = scanner.nextInt();
        System.out.println("enter the forth integer");
        arr1[3] = scanner.nextInt();

        GenericTestMaximum generictestmaximum = new GenericTestMaximum();

         generictestmaximum.testIntegerMaximum(arr1[0], arr1[1], arr1[2],arr1[3]);

        System.out.println("enter the first float");
        arr2[0]= scanner.nextFloat();
        System.out.println("enter the second float");
        arr2[1]=scanner.nextFloat();
        System.out.println("enter the third float");
        arr2[2]=scanner.nextFloat();
        System.out.println("enter the forth float");
        arr2[2] = scanner.nextFloat();

        generictestmaximum.testIntegerMaximum(arr2[0], arr2[1], arr2[2],arr2[3]);

        System.out.println("enter the first String");
        arr3[0]=scanner.next();
        System.out.println("enter the second String");
        arr3[1]=scanner.next();
        System.out.println("enter the third String");
        arr3[2]=scanner.next();
        System.out.println("enter the forth String");
        arr3[2]=scanner.next();

         generictestmaximum.testIntegerMaximum(arr3[0], arr3[1], arr3[2],arr3[3]);

    }
}