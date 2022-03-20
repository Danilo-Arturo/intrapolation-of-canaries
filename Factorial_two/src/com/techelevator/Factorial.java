package com.techelevator;

import java.util.Arrays;

public class Factorial {

    public void run() {
        //
        //factorialOf(10);
        System.out.println("Factorial of 10 using recursion is: " + factorialOf(10));
        System.out.println("Factorial of 11 using Iteration is: " + factorialOf2(11));
        System.out.println(Arrays.toString(solution(100)));

    }

    public int factorialOf(int newInteger) {
        //could return int array

        if (newInteger == 0) {
            return 1;
        }
        return newInteger * factorialOf(newInteger - 1);
//        String temp = Integer.toString(newInteger);
//        int [] newIntegerArray = new int[temp.length()];
//        for (int i = 0; i < temp.length(); i++){
//            newIntegerArray[i] = temp.charAt(i);
//        }

    }

    public int factorialOf2(int newInteger) {
        int factorial = 1;
        while (newInteger > 0) {
            factorial = factorial * newInteger;
            newInteger--;
        }
        return factorial;
    }

    public int[] solution(int area) {
        int counter = 0;

        int totalArea = area;

        while (area > 0) {
            int areaSquareRoot = (int) Math.floor(Math.sqrt(area));
            area -= areaSquareRoot * areaSquareRoot;
            counter++;
        }

        int[] populateList = new int[counter];

        // Subtracting largest panel we calculate
        for (int i = 0; i < populateList.length; i++) {
            int totalAreaSquareRoot = (int) Math.floor((Math.sqrt(totalArea)));
            totalArea -= totalAreaSquareRoot * totalAreaSquareRoot;
            populateList[i] = totalAreaSquareRoot * totalAreaSquareRoot;

        }

        return populateList;


    }
}

//    public static int[] solution(int area){
//        double areaSquareRoot = (Math.sqrt(area));
//        int areaSquareRootInt = (int)areaSquareRoot;
//        int remainderSquared = (int) Math.pow(areaSquareRootInt, 2);
//
//        if (area % areaSquareRootInt == 0){
//            return new int[]{remainderSquared};
//        }
//
//        if (area - remainderSquared == 0)
//
//        // int areaSquareRootLargest = int(areaSquareRoot);
//
//        return null;
//    }


