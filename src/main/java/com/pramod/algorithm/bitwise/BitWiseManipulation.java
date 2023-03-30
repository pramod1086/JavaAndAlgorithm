package com.pramod.algorithm.bitwise;

public class BitWiseManipulation {
    public static void main(String args[]){

        int number = 35;

        devideByTwo(number);
        iterateThroughBits(number);


    }

    private static void iterateThroughBits(int number) {
        for ( int x = 0; x < (1 << number); ++x ){
            System.out.println("Bit by Bit value " + x);
        }
    }

    private static void devideByTwo(int number) {
        int result = number>>1;
        System.out.println("Devide by two " + result);
    }

}
