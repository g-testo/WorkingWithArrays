package com.gt;

public class Main {
    public static void main(String[] args) {
//        int count = 0;
//        for(int i = 2; i <= 1_000_000; i*=2){
//            System.out.println("I love Java");
//            count++;
//        }

        int[] numList = {520, 3, 24, 16};
//        System.out.println(numList[0]); // Get first element
//        System.out.println(numList[numList.length-1]); // Get last element
        int sum = 0;

        for(int i=0;i<4;i++) { // "For" loop that iterates through an array
            System.out.println(numList[i]);
            // (position) i: 0, 1, 2, 3
            // (value at that position) numList[i]: 520, 3, 24, 16
        }


    }
}